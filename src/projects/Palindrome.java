package projects;

import java.util.Collections;

public class Palindrome {
	public static boolean palindrome(String p) {
		boolean r = true; int c = p.length()-1;
		for(int i = 0; i < p.length(); i++) {
			if(p.charAt(i) != p.charAt(c)) {
				r = false;
			}
			c--;
		}
		return r;
	}
	public static void main(String[] args) {
		int largest = 0, arrIndex = 0; String lS; int [] arr = new int[10];
		for(int i = 999; i > 900; i--) {
			for(int x = i; x > 900; x--) {
				int a = i*x;
				lS = "" + a;
				if(palindrome(lS)) {
					arr[arrIndex] = a; arrIndex++;
				}
			}
		}
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > largest) largest = arr[i];
		}
		System.out.println(largest);
	}
}