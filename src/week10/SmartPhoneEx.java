package week10;

public class SmartPhoneEx {
	public static void main(String[] args) {
		SmartPhone mine = new SmartPhone("갤럭시", "while");
		
		System.out.println("모델 : " + mine.model);
		System.out.println("색상 : " + mine.color);
		
		System.out.println("wifi : " + mine.isWifi());
		
		mine.bell();
		mine.sendVoice("Hello");
		mine.receiveVoice("Hi");
		mine.hangUp();
		
		mine.setWifi(true);
		mine.internet();
	}

}
