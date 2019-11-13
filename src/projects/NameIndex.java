package projects;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class NameIndex {
	static String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	public static int alphabetScore(String s) {
		int score = 0;
		for(int i = 0; i < s.length(); i++)
			score += alphabet.indexOf(s.substring(i, i+1)) + 1;
		return score;
	}
	public static void main(String[] args) throws FileNotFoundException {
		File nameFile = new File("C:\\Users\\apsar\\OneDrive\\Desktop\\p022_names.txt");
		Scanner scan = scan = new Scanner(nameFile);
		String s = "";
		while(scan.hasNext()) s += scan.next();
		s = s.substring(1, s.length() - 1);
		String[] names = s.split("\",\"");
		Arrays.sort(names);
		
		long[] nameProduct = new long[names.length];
		for(int i = 0; i < names.length; i++) {
			nameProduct[i] = alphabetScore(names[i]) * (i+1);
		}
		long total = 0;
		for(int i = 0; i < names.length; i++) {
			System.out.println(names[i] + " | " + nameProduct[i]);
			total += nameProduct[i];
		}
		System.out.println(total);
	}
}