package projects;
public class Mult3n5 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 0; i < 1000; i++)
			if(i%5 == 0 || i%3 == 0) sum+= i;
		System.out.println(sum);
	}
}