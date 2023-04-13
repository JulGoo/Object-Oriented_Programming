package week7;

public class Car3 {
	String model;
	String color;
	int maxSpeed;
	
	//생성자 오버로딩(overloading)
	//객체 초기화의 다양성 제공
	Car3() { }
	
	Car3(String model) {
		//this.model = model;
		//this.color = "black";
		//this.maxSpeed = 500;
		this(model, "black", 500);
	}
	
	Car3(String model, String color) {
		//this.model = model;
		//this.color = color;
		//this.maxSpeed = 500;
		this(model, color, 500);
	}
	
	Car3(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
