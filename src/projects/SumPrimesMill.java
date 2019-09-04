package projects;

public class SumPrimesMill {
	public static long[] primes = new long[200000];
	public static int arrIndex = 0;
	public static boolean isPrime(long k) {
		boolean prime = true;
		for(int i = 0; i<arrIndex; i++) {
			if(k % primes[i] == 0) {
				prime = false;
				i = arrIndex;
			}
			if(i > k/2) i = arrIndex;
		}
		if(prime) {
			primes[arrIndex] = k;
			arrIndex++;
		}
		return prime;
	}
	public static void main(String[] args) {
		int b = 1;
		long under = 7600L;
		long l = 0L;
		double startTime = System.currentTimeMillis();
		double placeholder = startTime;
		for(long i = 2; i < under; i++) {
			if(isPrime(i)) {
				l += i;
			}
			if(i % 100000 == 0) {
				double current = System.currentTimeMillis();
				System.out.println(i + ":\t" + (current-placeholder));
				placeholder = current;
			}
		}
		double endTime = System.currentTimeMillis();
		System.out.println("Sum:\t" + l);
		System.out.println("Time:\t" + ((endTime - startTime))/1000.0);
	}
}