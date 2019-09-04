package projects;

public class Factor {
	public static void main(String[] args) {
		int num = 6472112, prime = 2;
		for(int i = 2; i * (i-1) <= num; i++) {
			if(num%i == 0) {
				if(prime < i) prime = num/i;
				num/=i;
				i= 2;
			}
		} System.out.println(prime);
	}
}