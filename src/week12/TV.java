package week12;

public class TV implements RemoteControl{
	private int volume;
	private int memoryVol;
	
	@Override     public void setMute(boolean mute) {
		if(mute) {
	    	memoryVol = this.volume;
	    	System.out.println("TV 무음 처리...");
	    	setVolume(RemoteControl.MIN_VOLUME);
    	}else {
	    	System.out.println("TV 무음 해제");
	    	setVolume(memoryVol);
    	}	    }
        	
	//TV 클래스 : RemoteControl 인터페이스를 구현하는 구현 클래스
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");		
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");		
	}

	@Override
	public void setVolume(int volume) {
		 if(volume > RemoteControl.MAX_VOLUME) {		//유효성 검사
	         this.volume = RemoteControl.MAX_VOLUME;
	      }else if(volume < RemoteControl.MIN_VOLUME) {
	         this.volume = RemoteControl.MIN_VOLUME;
	      }
	      this.volume = volume;
	      
	      System.out.println("현재 TV 볼륨 : " + volume);		
	}
}
