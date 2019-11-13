package projects;

import java.math.BigInteger;

public class FactorialDigitSum {
	public static void main(String[] args) {
		BigInteger product = new BigInteger("1"); BigInteger factor;
		for(int i = 100; i > 0; i--) {
			factor = new BigInteger("" + i);
			product = product.multiply(factor);
		}
		System.out.println(product);
		String s = product.toString(); int sum = 0;
		for(int i = 0; i < s.length(); i++) {
			sum += Integer.parseInt(s.substring(i, i+1));
		}
		System.out.println(sum);
	}
}
