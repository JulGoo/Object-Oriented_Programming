package week4;

public class IfDice {
	public static void main(String[] args) {
		//Math.random() 함수는 0.0 ~ 1.0보다 작은 실수를 반환
		double num = Math.random();
		System.out.println("랜덤 숫자 : " + num);
		
		//1 ~ 6 사이의 숫자를 랜덤하게 얻기 위해서 --> 랜덤 숫자 * 6 + 1
		int number = (int)((num * 6) + 1);
		System.out.println("주사위를 던져서 나온 숫자 : " + number);
	}
}
