package week9;

public class StaticBlock {
	int field1;
	void method1() {
	}
	
	static int field2;
	static void method2() {
	}
	
	static {
		//field1 = 10;
		//method1();
		
		field2 = 10;
		method2();
	}
	
	static void method3() {
		//field1 = 10;
		//method1();
		
		field2 = 10;
		method2();
		
		StaticBlock sb = new StaticBlock();
		sb.field1 = 10;
		sb.method1();
	}
}
