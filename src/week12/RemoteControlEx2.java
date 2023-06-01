package week12;

public class RemoteControlEx2 {
	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("익명 객체 전원을 켭니다.");
			}
			
			@Override
			public void turnOff() {
				System.out.println("익명 객체 전원을 끕니다.");				
			}
			
			@Override
			public void setVolume(int volume) {
				System.out.println("익명 객체 볼륨을 조절합니다.");
			}
		};
		
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
	}

}
