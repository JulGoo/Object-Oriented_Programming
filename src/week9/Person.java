package week9;

public class Person {
	//상수 선언
	static final double FEET_CONSTANT = 30.48;
	
	//final 필드 - 객체마다 가지지만 변하지 않는 값
	final String nation = "Korea";
	final String ssn;
	
	String name;
	double height;
	
	public Person(String ssn, String name, double height) {
		this.ssn = ssn;
		this.name = name;
		this.height = height;
	}
}
