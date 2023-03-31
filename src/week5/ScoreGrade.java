package week5;

import java.util.Scanner;

public class ScoreGrade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int score = sc.nextInt();	오류!! --> while안에서 입력받도록해야 매번 새로운 수가 적용된다!
		int score;
		char grade;
		
		System.out.println("=================");
		System.out.println("  SCORE   GRADE  ");
		System.out.println("=================");
		
		while (true) {
			score = sc.nextInt();
			if(score < 0) {
				break;
			} else if (score >= 90) {
				grade = 'A';
			} else if (score >= 80) {
				grade = 'B';
			} else if (score >= 70) {
				grade = 'C';
			} else if (score >= 60) {
				grade = 'D';
			} else {
				grade = 'F';
			} 
			System.out.printf("   %d       %c", score, grade);
		}
		
		sc.close();
	}
}
