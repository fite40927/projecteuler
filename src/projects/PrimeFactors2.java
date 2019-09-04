package projects;

public class PrimeFactors2 {	
	public static void main(String[] args) {
		long num = 13195L; long largest = num;
		long startTime = System.nanoTime();
		for(long i = 2; i*(i-1) <= largest; i++) {
			if(largest % i == 0)
				largest /= i;
		}
		long endTime = System.nanoTime() - startTime;
		System.out.println(largest);
		System.out.println(endTime);
	}
}