package week7;

public class Car3Ex {
	public static void main(String[] args) {
		Car3 myCar1 = new Car3();
		System.out.println(myCar1.model + ", " + myCar1.color + ", " + myCar1.maxSpeed);
		
		Car3 myCar2 = new Car3("그랜저");
		System.out.println(myCar2.model + ", " + myCar2.color + ", " + myCar2.maxSpeed);
		
		Car3 myCar3 = new Car3("그랜저", "화이트");
		System.out.println(myCar3.model + ", " + myCar3.color + ", " + myCar3.maxSpeed);
		
		Car3 myCar4 = new Car3("그랜저", "화이트", 300);
		System.out.println(myCar4.model + ", " + myCar4.color + ", " + myCar4.maxSpeed);
	}
}
