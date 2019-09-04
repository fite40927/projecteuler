package tools;
import java.util.*;

public class RandomSample {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Population size:\t");
		int x = scan.nextInt();
		System.out.print("Sample size:\t");
		int y = scan.nextInt();
		
		for(int i = 0; i < y; i++) {
			int rand = (int)(Math.random()*x + 1);
			System.out.println(rand);
		}
	}
}
