package projects;

public class Collatz {
	public static int chainLength(int l) {
		int chainCt = 0;
		for(int i = l; i > 1; chainCt++){
			if(i % 2 == 0)
				i /= 2;
			else i = i*3 + 1;
		}
		return chainCt;
	}
	public static void main(String[] args) {
		int chainCt; int largestChain = 0; int idx = 0;
		
		for(int i = 1; i < 1000000; i++) {
			chainCt = chainLength(i);
			if(chainCt > largestChain) {
				largestChain = chainCt;
				idx = i;
			}
		}
		
		System.out.println(idx + " | " + largestChain);
		
		final int number = 1000000;

		long sequenceLength = 0;
		long startingNumber = 0;
		long sequence;

		for (int i = 2; i <= number; i++) {
		    int length = 1;
		    sequence = i;
		    while (sequence != 1) {
		        if ((sequence % 2) == 0) {
		            sequence = sequence / 2;
		        } else {
		            sequence = sequence * 3 + 1;
		        }
		        length++;
		    }

		    //Check if sequence is the best solution
		    if (length > sequenceLength) {
		        sequenceLength = length;
		        startingNumber = i;
		    }
		}
		System.out.println(startingNumber);
	}
}
