package week2;

public class Print3 {
	public static void main(String[] args) {
		System.out.println(17+35);			//52
		System.out.println("17+35");		//17+35
		System.out.println("17+35="+17+35);	//17+35=1735
		System.out.println("17+35="+(17+35));	//17+35=52 괄호로 묶으면 문자취급안하겠다는 뜻
		
		//printf : 문자열 출력 포멧
		//%s     : 문자열 출력 포멧
		//%d     : 숫자 출력 포멧
		
		System.out.printf("이름 : %s, %s\n", "자바", "이클립스", "hello");
		//System.out.printf("이름 : %s, %s\n", "자바");		//error 포멧보다 적으면 오류
		System.out.printf("더하기 : 53 + 17 = %d\n", (53+17));
	}
}
