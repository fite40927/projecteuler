package projects;

public class PrimeFactors {	
	public static void main(String[] args) {
		int num = 13195; int largest = num;
		long startTime = System.nanoTime();
		for(int i = num-1; i > 1; i--) {
			if(num % i == 0) {
				largest = i;
				num = largest;
			}
		}
		long endTime = System.nanoTime();
		System.out.println(largest);
		System.out.println(endTime-startTime);
	}
}