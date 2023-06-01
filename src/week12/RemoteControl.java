package week12;

public interface RemoteControl {
	//인터페이스에서 선언 가능한 필드는 상수 뿐이다.
	//컴파일 과정에서 static final이 자동 생성
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//인터페이스에 선언된 메소드는 실행문이 없는 추상메소드
	//실행과정에서 abstract가 자동으로 생성
	//최종적으로 구현 클래스에서 재정의해서 사용	
	public void turnOn();
	void turnOff();
	void setVolume(int volume);

	//무음 모드 기능 추가된 경우
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
			setVolume(MIN_VOLUME);
		}else {
			System.out.println("무음 해제합니다.");
		}
	}
}
