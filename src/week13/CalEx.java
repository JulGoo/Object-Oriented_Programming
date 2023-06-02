package week13;

public class CalEx {
	public static void main(String[] args) {
		Calculator clac = new Calculator();
		
		CalUser1 user1 = new CalUser1();
		user1.setCalculator(clac);
		user1.start();
		
		CalUser2 user2 = new CalUser2();
		user2.setCalculator(clac);
		user2.start();
	}

}
