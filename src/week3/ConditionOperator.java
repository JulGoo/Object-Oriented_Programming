package week3;

public class ConditionOperator {
	public static void main(String[] args) {
		int num1 = 35;
		int num2 = 47;
		String rs;
		
		rs = (num1 > num2)? "num1이 num2보다 크다" : "num1이 num2보다 작다";
		System.out.println(rs);
		
		boolean brs;
		brs = (num1 > num2)? true : false;
		System.out.println(brs);
	}
}
