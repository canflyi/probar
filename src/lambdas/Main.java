package lambdas;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		List<BigDecimal> miWalletBalance = new ArrayList<>();
		
		miWalletBalance.add(new BigDecimal(23.4));
		miWalletBalance.add(new BigDecimal(120.89));
		
		double testTotalSaldo = 23.4 + 120.89;
		
		BigDecimal totalSaldo = miWalletBalance.stream().reduce(BigDecimal.ZERO, BigDecimal::add);
		
		System.out.println(totalSaldo.doubleValue());
		System.out.println(testTotalSaldo);
	}
}
