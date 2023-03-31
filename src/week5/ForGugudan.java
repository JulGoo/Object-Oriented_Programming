package week5;

import java.util.Scanner;

public class ForGugudan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("구구단 몇 단을 계산할까요?");
		
		int num = sc.nextInt();
		
		System.out.println("구구단 " + num + "단");
		
		for (int i=1; i<=9; i++) {
			System.out.println(num + " * " + i + " = " + (num*i));
		}
	sc.close();
	}
}
