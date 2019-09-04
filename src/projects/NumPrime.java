package projects;

public class NumPrime {
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
	public static void main(String[] args) {
		int hunFirst = 1, count = 0;
		while(count < 10001) {
			hunFirst++;
			if(isPrime(hunFirst)) count++;
		}
		System.out.print(hunFirst);
	}
}