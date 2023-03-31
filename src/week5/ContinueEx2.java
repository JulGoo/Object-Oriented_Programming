package week5;

public class ContinueEx2 {
	public static void main(String[] args) {
		int sum = 0;
		
		for (int i=1; i<=100; i++) {
			//3의 배수를 제거
			if (i%3 == 0) {
				continue;
			}
			sum += i;
		}
		System.out.println("1~100까지 중 3의 배수를 제외한 값의 합 : "+sum);
		
		int sum2 = 0;
		for (int i=1; i<=100; i++) {
			if(i%3 == 0) {
				sum2 += i;
			}
		}
		System.out.println("1~100까지 중 3의 배수의 합 : "+sum2);
		
		System.out.printf("%d + %d = %d", sum, sum2, sum+sum2);
	}
}
