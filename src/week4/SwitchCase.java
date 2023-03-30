package week4;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1년 중 일수를 알고 싶은 달을 입력하세요 >>");
		int month = sc.nextInt();
		
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31일입니다. ");
			break;
		case 2:
			System.out.println("28일 입니다.");
			break;
		case 4, 6, 9, 11:
			System.out.println("30일입니다.");
			break;
		default :
			System.out.println("달을 입력해주세요");
			
		}
	}
}
