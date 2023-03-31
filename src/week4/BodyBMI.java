package week4;

import java.util.Scanner;

public class BodyBMI {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("이름을 입력하세요: ");
	    String name = sc.next();
		System.out.println("키(cm)를 입력하세요: ");
		int height = sc.nextInt();
		System.out.println("몸무게(kg)를 입력하세요:");
		int weight = sc.nextInt();
		
		double bmi = weight / (height/100.0 * height/100);
		String result = "";
		
		if(18.5 <= bmi && bmi < 23)
			result = "정상";
		else if(23 <= bmi && bmi < 25)
			result = "과체중";
		else if(25 <= bmi && bmi < 30)
			result = "비만";
		else if(30 <= bmi)
			result = "고도비만";
		
		System.out.printf("%s님의 키는 %dcm이고, 몸무게는 %dkg입니다.", name, height, weight);
		System.out.printf("BMI 지수는 %.2f이고 %s입니다.", bmi, result);
		
		sc.close();
	}
}
