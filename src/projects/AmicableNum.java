package projects;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;

public class AmicableNum {
	public static boolean amicable(int a) {
		int da = d(a);
		int db = d(da);
		if(db == a && da != db)
			return true;
		else return false;
	}
	public static int d(int n) {
		int sum = 0;
		int[] factors = factorise(n);
		for(int i : factors)
			sum += i;
		return sum;
	}
	public static int[] factorise(int n) {
		ArrayList<Integer> f = new ArrayList<Integer>();
		for(int i = 1; i < n; i++) {
			if(n % i == 0) {
				if(!f.contains(i)) f.add(i);
				if(!f.contains(n/i)) f.add(n/i);
			}
		}
		Collections.sort(f, Collections.reverseOrder());
		if(f.size() > 1)
			f.remove(0);
		int[] factors = new int[f.size()];
		for(int i = 0; i < factors.length; i++)
			factors[i] = f.get(i);
		return factors;
	}
	public static void main(String[] args) {
		int sum = 0; long startTime = System.nanoTime();
		for(int i = 1; i < 10000; i++) {
			if(amicable(i)) {
				System.out.println(i + " | " + d(i));
				sum += i;
			}
		}
		long endTime = System.nanoTime();
		System.out.println(sum);
		System.out.println((endTime-startTime) / 1000000000.0 + "sec");
	}
}
