package week4;

import java.util.Scanner;

public class ConditionIf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("당신이 태어난 연도를 입력하세요 >> ");

		int year = sc.nextInt();
		int age = 2023 - year;

		if ((age <= 26) && (age >= 20)) {
			System.out.println("대학생");
		} else if (age >= 17) {
			System.out.println("고등학생");
		} else if (age >= 14) {
			System.out.println("중학생");
		} else if (age >= 8) {
			System.out.println("초등학생");
		} else {
			System.out.println("학생이 아닙니다.");
		}
		
		sc.close();
	}
}
