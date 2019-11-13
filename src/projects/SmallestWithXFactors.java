package projects;
import java.util.*;

public class SmallestWithXFactors {	
	public static boolean isPrime(int num) {
		boolean x = true;
		for(int i = 2; i < num; i++) {
			if(i!=num && num%i == 0) {
				x = false;
				break;
			}
		}
		return x;
	}
	public static void findFactors(ArrayList<Integer> f) {
		System.out.println(f.toString());
		for(int i = 0; i < f.size(); i++) {
			if(!isPrime(f.get(i))) {
				for(int j = 2; j < f.get(i); j++) {
					if(f.get(i) % j == 0) {
						f.add(j);
						f.add(f.get(i) / j);
						j = f.get(i);
					}
				}
				f.remove(i);
				findFactors(f);
			}
		}		
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numFactors;
		long multiple = 1;
		ArrayList<Integer> factors = new ArrayList(); 
		int idx = 0;
		
		System.out.println("This program finds the smallest number with an x amount of factors");
		System.out.print("Factors:\t"); numFactors = scan.nextInt();
		
		factors.add(numFactors);
		System.out.println("\nFactor Tree:");
		findFactors(factors);
		Collections.sort(factors, Collections.reverseOrder());
		System.out.println("\n" + factors.toString());
		
		for(int i = 2; idx < factors.size(); i++) {
			if(isPrime(i)) {
				multiple *= Math.pow(i, factors.get(idx) - 1);
				System.out.print("(" + i + "^" + (factors.get(idx)-1) + ")");
				idx++;
				if(idx < factors.size()) System.out.print(" * ");
			}
		}
		
		System.out.println("\n\nThe smallest number with " + numFactors + " factors is " + multiple);
	}
}
