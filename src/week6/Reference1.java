package week6;

public class Reference1 {
	public static void main(String[] args) {
		//기본 데이터 타입의 변수는 스택영역에 생성
		//값도 같이 저장
		int iVal1 = 100;
		int iVal2 = 100;
		System.out.println("iVal1 == iVal2 : " + (iVal1 == iVal2));
		
		//참조 타입의 변수는 스택영역에 생성
		//해당 걕체의 주소를 저장
		String sVal1 = "Java";
		String sVal2 = "Java";
		//자바는 문자열 리터럴이 동일하다면 String 객체를 공유한다.
		System.out.println("sVal1 == sVal2 : " + (sVal1 == sVal2 ? "참조가 같음" : "참조가 다름"));
		
		//참조 타입의 변수는 초기값으로 null을 사용할 수 있다(스택 영역에만 생성됨)
		String sVal3 = null;
		//참조 타입의 변수가 null값을 가지고 있을 때는 해당 변수를 사용할 수 없다.
		// --> NullPointerException 에러 발생
		//System.out.println("sVal3.length = " + sVal3.length());
		
		sVal3 = "Java";
		System.out.println("sVal3 = " + sVal3);
		System.out.println("sVal1 == sVal3 : " + (sVal1 == sVal3 ? "참조가 같음" : "참조가 다름"));
		
		//new 연산자를 이용하는 경우에는 힙 영역에 새로운 String 객체가 생성
		String sVal4 = "Java";
		String sVal5 = "Java";
		System.out.println("sVal4 == sVal5 : " + (sVal4 == sVal5 ? "참조가 같음" : "참조가 다름"));

		//String 객체가 동일한 문자열을 가지고 있는지 비교할 경우
		//반드시 equals() 메소드를 사용
		if (sVal4.equals(sVal5)) {
			System.out.println("sVal4와 sVal5의 문자열은 동일하다.");
		} else {
			System.out.println("sVal4와 sVal5의 문자열은 다르다.");
		}
	}
}
