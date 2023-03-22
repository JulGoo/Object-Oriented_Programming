package week3;

public class LogicalOperator {
	public static void main(String[] args) {
		int charCode1 = 'A';
		if (charCode1 >= 65 && charCode1 <= 90) {
			System.out.println((char)charCode1 + "는 알파벳 대문자입니다.");
		}
		
		int charCode2 = 'b';
		if (charCode2 >= 97 && charCode2 <= 122) {
			System.out.println((char)charCode2 + "는 알파벳 소문자입니다.");
		}
		
		int charC3 = '9';
		if (!(charC3 < 48) && !(charC3 > 57)) {
			System.out.println((char)charC3 + "는 0~9 사이의 숫자입니다.");
		} 
		
		int iV = 4;
		if (iV%2 == 0 || iV%3 == 0) {
			System.out.println(iV + "는 2 또는 3의 배수입니다.");
		}
	}
}
