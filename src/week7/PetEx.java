package week7;

public class PetEx {
	public static void main(String[] args) {
		Pet dog = new Pet("강아지", 8);
		Pet cat = new Pet("고양이", 13);
		Pet bird =new Pet("새", 6);
	
		System.out.printf("%s는 %d개월입니다\n", dog.type, dog.age);
		System.out.printf("%s는 %d개월입니다\n", cat.type, cat.age);
		System.out.printf("%s는 %d개월입니다\n", bird.type, bird.age);
		
		dog.leg = 4;
		cat.leg = 4;
		bird.leg =2;
		
		System.out.printf("%s의 다리는 %d개입니다\n", dog.type, dog.leg);
		System.out.printf("%s의 다리는 %d개입니다\n", cat.type, cat.leg);
		System.out.printf("%s의 다리는 %d개입니다\n", bird.type, bird.leg);
	}
}
