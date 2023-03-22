package week3;

public class OneOperand2 {
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		//++연산자 : 피연산자의 기존 값에 1을 더애 자기자신에게 그 결과를 저장한다.
		
		//피연산자의 오른쪽에 위치 시, 명령 수행 후 1을 더함.
		System.out.println("x++ = " + x++);
		System.out.println(x);
		System.out.println();
		
		//피연산자의 왼쪽에 위치 시, 1 증가 후에 명령 실행
		System.out.println("++x = " + ++x);
		System.out.println(x);
		System.out.println();
		
		z = x++;
		System.out.println("z = " + z + ", x = " + x);
		System.out.println();
		
		z = ++x + y--;
		System.out.println("z = " + z);
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}
}
