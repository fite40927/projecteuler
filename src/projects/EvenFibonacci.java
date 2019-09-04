package projects;

public class EvenFibonacci {
	public static void main(String[] args) {
		int term1 = 1, term2 = 2, fibonum = 0, sum = 2;
		for(int i = 0; fibonum < 4000001; i++) {
			fibonum = term1+term2;
			if(fibonum % 2 == 0) sum += fibonum;
			term1 = term2;
			term2 = fibonum;
		}
		System.out.println(sum);
	}
}