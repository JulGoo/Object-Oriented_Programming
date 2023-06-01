package week12;

public class Tonfree implements Earphone{
	
	public Tonfree() {
		System.out.println("\nLG Tonfree 이어폰 연결");	
	}
	
	@Override
	public void play() {
		System.out.println("LG Tonfree 음악 재생 중...");
	}
	
	@Override
	public void stop() {
		System.out.println("LG Tonfree 음악을 중지합니다.");		
	}
	
}
