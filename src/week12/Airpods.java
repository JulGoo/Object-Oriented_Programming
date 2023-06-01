package week12;

public class Airpods implements Earphone{
	
	public Airpods() {
		System.out.println("\nApple Airpods 이어폰 연결");	
	}
	
	@Override
	public void play() {
		System.out.println("Apple Airpods 음악 재생 중...");
	}
	
	@Override
	public void stop() {
		System.out.println("Apple Airpods 음악을 중지합니다.");		
	}
	
}
