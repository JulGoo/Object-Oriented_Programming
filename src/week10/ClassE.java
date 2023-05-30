package week10;

public class ClassE {
	public ClassE() {
		ClassD d1 = new ClassD();
		d1.field1 = 10;
		d1.field2 = 10;
		//d1.field3 = 10;	private은 자기 안에서만 가능
		
		d1.method1();
		d1.method2();
		//d1.method3();
	}

}
