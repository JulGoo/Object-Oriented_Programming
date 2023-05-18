package week9;

public class Area {
	//메소드 오버로딩
	//원의 넓이 메소드
	double areaCal(double radius) {
		return 3.14*radius*radius;
	}
	
	//정사각형의 넓이 메소드
	int areaCal(int width) {
		return width * width;
	}
	
	//직사각형의 넓이 메소드
	int areaCal(int width, int height) {
		return width * height;
	}
}
