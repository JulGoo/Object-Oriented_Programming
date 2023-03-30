package week4;

public class IfElseEx {
	public static void main(String[] args) {
		int score = 85;
		
		if (score >= 90) {
			//true인 경우
			System.out.println("점수가 90점 이상입니다.");
			System.out.println("등급은 A입니다.");
		} else {	//false인 경우
			System.out.println("점수가 90점 미만입니다.");
		}
	}
}
