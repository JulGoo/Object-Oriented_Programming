package week11;

public class ChildEx {
	public static void main(String[] args) {
		Child child = new Child();
		
		//자식 클래스로 생성된 객체는 부모 클래스 참조변수에 대입 가능
		//자동 타입 변환 적용
		Parent parent = child;
		
		parent.method1();
		
		//자동 타입 변환이 적용된 부모 객체라도 자식 클래스의 재정의된 메소드가 출력
		parent.method2();
		
		//자식 객체가 부모객체로 자동 타입 변환이 일어나면 자식 객체에만 정의된 메소드는 호출할 수 없다.
		//parent.method3();
		//parent.field2 = "홍길동";
		
		//casting
		//parent는 child가 자동타입변환으로 적용된 객체이므로 casting이 가능
		child = (Child)parent;
		child.field2 = "홍길동";
		child.method3();
	}
}
