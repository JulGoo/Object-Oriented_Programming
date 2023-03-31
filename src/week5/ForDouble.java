package week5;

public class ForDouble {
	public static void main(String[] args) {
		for(int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				System.out.println("i = "+i+" ,j = "+j);
				//System.out.println("안쪽 for문 끝");
			}
			//System.out.println("바깥쪽 for문 끝");
		}
	}
}
