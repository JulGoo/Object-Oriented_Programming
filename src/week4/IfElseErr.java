package week4;

public class IfElseErr {
	public static void main(String[] args) {
		int score = 85;
		char grade;

		if (score >= 90) {
			System.out.println("점수가 90점 이상");
			grade = 'A';
		}
		if (score >= 80) {
			System.out.println("점수가 80점 이상");
			grade = 'B';
		}
		if (score >= 70) {
			System.out.println("점수가 70점 이상");
			grade = 'C';
		}
		if (score >= 60) {
			System.out.println("점수가 60점 이상");
			grade = 'D';
		} else {
			System.out.println("점수가 60 미만");
			grade = 'F';
		}

		System.out.println("등급은 " + grade);
	}
}