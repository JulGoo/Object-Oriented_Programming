package week11;

public class Child extends Parent {
	String field2;
	
	//Parent 클래스에 정의된 method2()을 재정의
	//method overriding
	@Override
	public void method2() {
		System.out.println("Child-method2");
	}

	//Child 클래스에서만 정의된 메소드도 가능
	public void method3() {
		System.out.println("Child-method3");
	}
}
