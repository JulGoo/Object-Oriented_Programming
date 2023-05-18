package week9;

public class PersonEx {
	public static void main(String[] args) {
		Person ps = new Person("1234-5678", "홍길동", 6.1);
		
		System.out.println(ps.nation + ", "+ ps.name);
		System.out.println(ps.height*Person.FEET_CONSTANT +"cm");
		
		//final로 정의된 필드는 한 번 초기화 되면 값을 변경할 수 없다.
//		ps.nation = "USA";
//		ps.ssn = "5678-67967";
		ps.name = "이순신";
	}
}
