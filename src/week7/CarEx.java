package week7;

public class CarEx {
	public static void main(String[] args) {
		//객체를 생성해야 필드에 접근 가능
		Car myCar = new Car();
		
		//필드값을 읽기 가능
		System.out.println("제작회사 : " + myCar.company);
		System.out.println("모델명 : " + myCar.model);
		System.out.println("색상 : " + myCar.color);
		System.out.println("최고속도 : " + myCar.maxSpeed);
		System.out.println("현재속도 : " + myCar.speed);
		
		//핑드값 변경
		myCar.speed = 60;
		System.out.println("수정된 현재 속도 : " + myCar.speed);
	}
}
