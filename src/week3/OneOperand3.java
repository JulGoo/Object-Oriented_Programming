package week3;

public class OneOperand3 {
	public static void main(String[] args) {
		int var1 = 10;
		int var2 = ~var1;		//~:보수
		int var3 = ~var1 + 1;
		
		System.out.println("var1 = " + var1);
		System.out.println("var2 = " + var2);
		System.out.println("var3 = " + var3);
		
		System.out.printf("십진수(%d) : %32s\n", var1, Integer.toBinaryString(var1));	//4바이트는 32비트
		System.out.printf("십진수(%d) : %32s\n", var2, Integer.toBinaryString(var2));	
		System.out.printf("십진수(%d) : %32s\n", var3, Integer.toBinaryString(var3));	
		
		String str1 = "JDK" + 6.0;
		String str2 = str1 + " 특징";
		System.out.println(str2);
		
		String str3 = "JDK" + 3 + 3.0;
		String str4 = 3 + 3.0 + "JDK";
		System.out.println(str3);
		System.out.println(str4);
	}
}
