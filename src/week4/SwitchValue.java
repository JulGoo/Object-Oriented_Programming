package week4;

public class SwitchValue {
	public static void main(String[] args) {
		String grade = "B";

		int score1 = 0;
		switch (grade) {
		case "A" -> score1 = 100;
		case "B" -> score1 = 100 - 20;
		default -> score1 = 60;
		}
		System.out.println(score1);

		int score2 = switch (grade) {
		case "A" -> 100;				//단일 값을 주는 경우
		case "B" -> {					//명령문을 추가하는 경우 중괄호 {} 사용
			int result = 100 - 20;
			yield result;				//yield 명령문으로 변수 값을 지정
		}
		default -> 60;					//default가 반드시 있어야 실행
		};								//중괄호 닫고 ;
		System.out.println(score2);
	}
}
