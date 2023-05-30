package week10;

public class CarBasic {
	//필드는 private으로 선언해 외부 접근을 제한
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	
	public String getCompany() {
		return company;
	}
	
	public void setCompany(String company) {
		this.company = company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		if(maxSpeed > 350) {	//유효성검사
			maxSpeed = 350;
		}
		this.maxSpeed = maxSpeed;
	}

}
