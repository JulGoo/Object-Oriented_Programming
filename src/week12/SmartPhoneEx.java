package week12;

import java.util.Scanner;

public class SmartPhoneEx {
	public static void main(String[] args) {
		System.out.println("====== 스마트폰으로 음악 재생하기 ======");
		
		Scanner sc = new Scanner(System.in);
		
		int select;
		
		SmartPhone sp = new SmartPhone();
		Earphone ep = null;
		
		while(true) {
			System.out.println("\n연결할 이어폰을 선택하세요.\n1.Airpods \n2.Buds \n3.Tonfree \n4.종료 \n>>");
			select = sc.nextInt();
			
			if (select == 4)
				break;
			
			switch(select) {
			case 1:
				ep = new Airpods();
				break;
			case 2:
				ep = new Buds();
				break;
			case 3:
				ep = new Tonfree();
				break;
			}
			
			sp.musicOn(ep);
			sp.musicOff(ep);
		}
		System.out.println("프로그램 종료");
		sc.close();
	}

}
