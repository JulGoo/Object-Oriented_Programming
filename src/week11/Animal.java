package week11;

public abstract class Animal {
	//추상 클래스는 객체 생성 불가
	public String kind;
	
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	//추상 메소드 정의 => 실제 클래스에서 반드시 재정의
	public abstract void sound();

}
