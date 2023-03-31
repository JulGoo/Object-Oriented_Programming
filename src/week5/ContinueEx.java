package week5;

public class ContinueEx {
	public static void main(String[] args) {
		for (int i=1; i<=100; i++) {
			if (i%2 == 1) {		//홀수
				continue;
			}
			System.out.println(i);
		}
	}
}
