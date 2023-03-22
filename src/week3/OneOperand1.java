package week3;

public class OneOperand1 {
	public static void main(String[] args) {
		int iV1 = +100;
		int iV2 = -100;
		double dV1 = +3.14;
		double dV2 = -10.5;
		
		int rs1 = +iV1;
		int rs2 = -iV1;
		System.out.println("rs1 = " + rs1);
		System.out.println("rs2 = " + rs2);
		
		short sV = 100;
		//int보다 크기가 작은 경우, 부호 연산자의 결과는 int타입이 된다.
		//short srs = -sV;
		int srs = -sV;
		System.out.println("srs = " + srs);
		
		byte bV = -100;
		int brs = -bV;
		System.out.println("bV = " + brs);
		
		//int보다 크면 그대로 써도 됨.
		long lV = 100;
		long lrs = -lV;
		System.out.println("lV = " + lrs);
		
		double drs = -dV1;
		System.out.println("dV = " + drs);
	}
}
