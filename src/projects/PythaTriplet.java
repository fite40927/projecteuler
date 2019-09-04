package projects;

public class PythaTriplet {
	public static void main(String[] args) {
		double c = 5.0;
		int product = 1;
		for(int a = 3; a < 500; a++) {
			for(int b = 4; b < 500; b++) {
				int a2 = a*a;
				int b2 = b*b;
				c = Math.sqrt(a2+b2);
				if(c == (int)(c)) {
					if(a+b+c == 1000) {
						System.out.println(a + ", " + b + ", " + c);
						product = (int)(a*b*c);
						b = 500;
						a = 500;
					}
				}
			}
		}
		System.out.println(product);
	}
}