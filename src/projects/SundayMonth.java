package projects;

public class SundayMonth {
	public static void main(String[] args) {
		int sunday = 6; int yrDays = 365;
		int sundayCount = 0;
		for(int i = 1; i < 101; i++) {
			sundayCount += 52;
			System.out.print((1900 + i) + " | Sunday on Jan " + sunday);
			if(sunday == 1 || (i % 4 == 0 && sunday < 3)) {
				sundayCount++;
				System.out.println(" | ++53");
			}
			else System.out.println(" | ++52");
			sunday = i % 4 == 0 ? sunday - 2 : sunday - 1;
			sunday = sunday <= 0 ? sunday + 7 : sunday;
		}
		System.out.println(sundayCount);
	}
}