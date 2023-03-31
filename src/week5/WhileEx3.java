package week5;

import java.util.Scanner;

public class WhileEx3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		int speed = 0;
		
		while(run) {
			System.out.println("-----------------------");
			System.out.println("1. 가속  2. 감속  3. 종료");
			System.out.println("-----------------------");
			System.out.println("메뉴 선택 >> ");
			
			int menu = sc.nextInt();
			
			if (menu == 1) {
				speed++;
				System.out.println("현재 속도 : "+speed);
			} else if( menu == 2) {
				speed--;
				System.out.println("현재 속도 : "+speed);
			} else if (menu == 3) {
				run = false;
				System.out.println("프로그램을 종료합니다.");
			} else {
				System.out.println("메뉴를 다시 선택해주세요.");
			}
		}
		sc.close();
	}
}
