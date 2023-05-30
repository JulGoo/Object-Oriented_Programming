package week10;

public class ClassB {
	ClassA c1 = new ClassA(true);
	ClassA c2 = new ClassA(1);
	//package가 같아도 private은 호출 불가(접근 제한)
	//ClassA c3 = new ClassA("abc");
}
