package projects;

import java.util.ArrayList;
import java.util.Collections;

public class AbundantSum {
	public static int factorSum(int n) {
		int prod = 1, p;
		for(int k = 2; k*k <= n; k++){
			p = 1;
			while(n % k == 0){
				p = p * k + 1;
		    	n /= k;
			}
			prod *= p;
		}
		if(n > 1) prod *= 1 + n;
		return prod;
	}
	public static boolean findMatch(ArrayList<Integer> a, int k) {
		for(int i = 0; i < a.size() - 1; i++) {
			if(a.get(i) >= k) return false;
			for(int j = i; j < a.size(); j++) {
				if(a.get(j) >= k)
					j = a.size();
				else if(a.get(i) + a.get(j) == k) 
					return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		ArrayList<Integer> abundantNums = new ArrayList<Integer>();
		long sum = 0;
		for(int i = 1; i <= 28123; i++) {
			if(factorSum(i) > i * 2) {
				abundantNums.add(i);
			}
		}
		System.out.println(abundantNums.toString());
		long start = System.nanoTime();
		for(int k = 1; k <= 28123; k++) {
			if(!findMatch(abundantNums, k)) {
				System.out.println(k);
				sum += k;
			}
		}
		long end = System.nanoTime();
		System.out.println("Sum = " + sum);
		System.out.println((end-start) / 1000000000.0 + "sec");
	}
}
