package projects;
import java.util.Scanner;

public class TryIt {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			System.out.print("Gimme integer:\t");
			scan.nextInt();
			System.out.print("Thx");
		}
		catch(Exception a) {System.out.print("Thats not an integer >:(");}
	}
}