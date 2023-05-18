package week9;

public class Calculator {
	String color;
	String size;
	
	static double pi = 3.14;
	
	static int minus(int x, int y) {
		return x-y;
	}
	
	public Calculator(String color, String size) {
		this.color = color;
		this.size = size;
	}
	//메소드 정의
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	double divide(int x, int y) { 
		double result = (double)x / y;
		return result;
	}
	double avg(int x, int y) {
		double sum = plus(x, y);
		double result = sum / 2;
		return result;
	}
	
	void exec() {
		double result = avg(7, 10);
		System.out.println("실행결과 :  "+ result);
	}
	//매개변수 
	int sum1(int[] values) {
		int sum = 0;
		//for(int i=0; i <values.length; i++) {
		//	sum += values[i];
		
		for(int var : values)
			sum += var;
		
		return sum;
	
	}
	
	//매개변수의 개수가 몇 개가 들어올 지 모르는 경우
	int sum2(int...values) {
		int sum = 0;
		for(int var : values)
			sum += var;
		return sum;
	}
}
