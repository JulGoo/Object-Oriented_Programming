package week3;

public class BitShiftOperator {
	public static void main(String[] args) {
		//왼쪽 이동 연산자(<<)는 최종적으로 2의 3제곱을 곱한 결과와 동일
		System.out.println("1 << 3   = " + (1<<3));
		System.out.printf ("1        = %8s\n", Integer.toBinaryString(1));
		System.out.printf ("(1<<3)   = %8s\n", Integer.toBinaryString(1<<3));
		
		//오른쪽 이동 연산자(>>)는 최종적으로 2의 3제곱을 나눈 결과와 동일
		System.out.println("-8 >> 3  = " + (-8>>3));
		System.out.println("-9 >>> 3 = " + (-9>>>3));
	}
}
