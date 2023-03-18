package week2;

public class DataType4 {
	public static void main(String[] args) {
		byte bData = 127;//128			//byte는 -128 ~ 127
		char cData = 90; //-90			//char 양수만
		float fData = 3.14f;
		long lData = 10000000000L;		//L 대소문자 상관없지만 가독성위해 보통 대문자 사용 
		boolean boolData = true;
		
		System.out.println("bData = " + bData);
		System.out.println("cData = " + cData);
		System.out.println("fData = " + fData);
		System.out.println("lData = " + lData);
		System.out.println("boolData = " + boolData);
	}
}
