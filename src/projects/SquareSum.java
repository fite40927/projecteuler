package projects;

public class SquareSum {
	public static void main(String[] args) {
		int squareSum = (int)(Math.pow((100*101)/2, 2));
		int sumSquare = 0;
		for(int i = 1; i < 101; i++) {
			sumSquare += (int)(Math.pow(i, 2));
		}
		System.out.println(squareSum-sumSquare);
	}
}