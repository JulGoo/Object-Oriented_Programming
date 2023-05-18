package week9;

public class CalcEx {
	public static void main(String[] args) {
		Calculator c1 = new Calculator("white", "small");
		System.out.println(c1.color + ", " + c1.size);
		
		c1.powerOn();
		
		int result1 = c1.plus(10,20);
		System.out.println("plus(10,20) = " + result1 );
		
		double result2 = c1.divide(10, 20);
		System.out.println("divide(10,20) = " + result2);
		
		byte b1 = 10;
		byte b2 = 20;
		result2 = c1.divide(b1, b2);
		System.out.println("divide(10,20) = " + result2);
		
		c1.exec();
		
		int[] arr = {1,2,3,4,5};
		int sum1R = c1.sum1(arr);
		System.out.println("{1,2,3,4,5} = " + sum1R);
		
		int sum2R = c1.sum2(1,2,3);
		System.out.println("(1,2,3) = " + sum2R);
		
	    sum2R = c1.sum2(1,2,3,4,5);
		System.out.println("(1,2,3,4,5) = " + sum2R);
		
		c1.powerOff();
		
		//정적(static) 필드는 객체를 생성하지 않아도 접근이 가능하다.
		int radius = 8;
		double circleArea = Calculator.pi * radius * radius;
		System.out.println(circleArea);
		
		//정적 메소드도 객체를 생성하지 않아도 호출 가능
		int x = 8;
		int y = 7;
		System.out.println(Calculator.minus(x, y));
	}
}
