package week4;

public class SwitchEx {
	public static void main(String[] args) {
		char grade = 'A';

		switch (grade) {
		case 'A':
			System.out.println("A 등급입니다.");
			break;
		case 'B':
			System.out.println("B 등급입니다.");
			break;
		default:
			System.out.println("기타 등급입니다.");
		}
	}
}
