package week12;

public class RemoteControlEx {
	public static void main(String[] args) {
		//구현 클래스를 이용한 객체 생성		
		Audio audio = new Audio();
		TV tv = new TV();
		
		audio.turnOn();
		audio.setVolume(5);
		audio.setMute(true);
		audio.setMute(false);
		audio.turnOff();
		
		System.out.println("--------------------------------------");
		
		tv.turnOn();
		tv.setVolume(3);
		tv.setMute(true);
		tv.turnOff();
		
		System.out.println("--------------------------------------");
		
		//System.out.println("리모컨 최대 볼륩 : " + RemoteControl.MAX_VOLUME);
		//System.out.println("리모컨 최소 볼륩 : " + RemoteControl.MIN_VOLUME);
		
		SmartTV st = new SmartTV();
		st.turnOn();
		st.setVolume(3);
		st.search("네이버");
		st.setMute(true);
		st.setMute(false);
		st.turnOff();
		
		System.out.println("------------------------------------------\n <<다형성 구현 결과>> \n");
		
		RemoteControl[] rc = new RemoteControl[3];
		
		//인터페이스 변수에 구현 클래스 객체 대입이 가능 => 자동타입변환
		rc[0] = audio;
		rc[1] = tv;
		rc[2] = st;
		
		for (RemoteControl r : rc) {
			r.turnOn();
			r.setVolume(5);
			r.setMute(true);
			r.setMute(false);
			r.turnOff();
			System.out.println("---------------------------------------------\n");
		}
		
	}

}
