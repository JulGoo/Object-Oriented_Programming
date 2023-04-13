package week7;

public class Car2Ex {
	public static void main(String[] args) {
		//개발자에 의해 생성자가 정의된 경우 기본 생성자가 생성되지 않는다.
		//Car2 myCar = new Car2(); --> 오류 발생
		Car2 myCar = new Car2("현대자동차", "그랜저", 350);		
	}
}
