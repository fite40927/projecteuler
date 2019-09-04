package projects;

public class SmallestMult {
	public static void main(String[] args) {
		int smallest = 0; int i = 1;
		while(smallest == 0) {
			if(i%19 == 0 && i%17==0 && i%13==0 && i%11==0) {
				if(i%20==0 && i%18==0 && i%16==0 && i%14==0) smallest = i;
			}
			i++;
		}
		System.out.print(smallest);
	}
}