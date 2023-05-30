package week10;

public class CarBasicEx {
	public static void main(String[] args) {
		CarBasic car = new CarBasic();
		//car.company = "현대";
		car.setCompany("현대");
		car.setModel("그랜져");
		car.setColor("white");
		car.setMaxSpeed(1350);
		
		System.out.println(car.getCompany());
		System.out.println(car.getModel());
		System.out.println(car.getColor());
		System.out.println(car.getMaxSpeed());
		
	}

}
