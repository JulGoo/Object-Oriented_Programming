package week12;

public class SmartTV implements RemoteControl, Searchable{
	private int volume;
	private int memoryVol;
	
	@Override
	public void setMute(boolean mute) {
		if(mute) {
	    	memoryVol = this.volume;
	    	System.out.println("SmartTV 무음 처리...");
	    	setVolume(RemoteControl.MIN_VOLUME);
    	}else {
	    	System.out.println("SmartTV 무음 해제");
	    	setVolume(memoryVol);
    	}	
	}

	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");
	}

	@Override
	public void turnOn() {
		System.out.println("SmartTV를 켭니다.");		
	}

	@Override
	public void turnOff() {
		System.out.println("SmartTV를 끕니다.");		
	}

	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {		//유효성 검사
	         this.volume = RemoteControl.MAX_VOLUME;
	      }else if(volume < RemoteControl.MIN_VOLUME) {
	         this.volume = RemoteControl.MIN_VOLUME;
	      }
	      this.volume = volume;
	      
	      System.out.println("현재 SmartTV 볼륨 : " + volume);			
	}
}
