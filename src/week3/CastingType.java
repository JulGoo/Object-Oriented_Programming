package week3;

public class CastingType {
	public static void main(String[] args) {
		int iData = 65;
		
		char cData = (char)iData;
		System.out.printf("cData = %c\n", cData);
		
		long lData = 500;
		iData = (int)lData;
		System.out.printf("iData = %d\n", iData);
		
		double dData = 3.14;
		iData = (int)dData;
		System.out.printf("iData = %d\n", iData);
		
		int iV = 128;
		byte bV = (byte)iV;
		System.out.printf("iV = %d\n", bV);
		
		if (iV >= Byte.MIN_VALUE && iV <= Byte.MAX_VALUE) {
			bV = (byte)iV;
			System.out.printf("bV = %d\n", bV);
		} else {
			System.out.println("Casting 하고자하는 변수의 값을 확인하세요.");
			System.out.println("데이터의 범위를 벗어납니다.");
		}
	}
}
