package week10;

public class SmartPhone extends Phone{
	private boolean wifi;
	
	public SmartPhone(String model, String color) {
		//this.model = model;	부모에서 이미 받았기 때문에 받아온다.
		//this.color = color;
		super(model, color);
		System.out.println("SmartPhone(String model, String color) 생성자 호출");
	}

	public boolean isWifi() {
		return wifi;
	}

	public void setWifi(boolean wifi) {
		this.wifi = wifi;
	}
	
	public void internet() {
		System.out.println("인터넷 연결");
	}
}
