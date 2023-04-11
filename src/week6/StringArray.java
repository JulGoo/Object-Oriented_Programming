package week6;

public class StringArray {
	public static void main(String[] args) {
		String[] sArray = new String[3];
		sArray[0] = "java";
		sArray[1] = "java";
		sArray[2] = new String("java");
		
		boolean bVal = (sArray[0] == sArray[1]);
		System.out.println("sArray[0], [1] : " + (bVal?"참조가 같다":"참조가 다르다"));
		
		bVal = (sArray[0] == sArray[2]);
		System.out.println("sArray[0], [2] : " + (bVal?"참조가 같다":"참조가 다르다"));
		
		if(sArray[0].equals(sArray[2])) {
			System.out.println("sArray[0], [2] : 문자열이 동일하다.");
		}else {
			System.out.println("sArray[0], [2] : 문자열이 다르다.");
		}
	}
}
