package week3;

public class BitOperator {
	public static void main(String[] args) {
		byte num1 = 45;
		byte num2 = 25;
		int rs = num1 & num2;
		System.out.println("num1  = " + num1);
		System.out.println("num2  = " + num2);
		System.out.println("rs    = " + rs);
		System.out.printf("num1  = %6s\n", Integer.toBinaryString(num1));
		System.out.printf("num2  = %6s\n", Integer.toBinaryString(num2));
		System.out.printf("rs(&) = %6s\n", Integer.toBinaryString(rs));
		
		rs = num1 | num2;
		System.out.printf("rs(|) = %6s\n", Integer.toBinaryString(rs));
		
		rs = num1 ^ num2;
		System.out.printf("rs(^) = %6s\n", Integer.toBinaryString(rs));
		
		rs = ~num1;
		System.out.printf("~num1 = %6s\n", Integer.toBinaryString(rs));
	}
}
