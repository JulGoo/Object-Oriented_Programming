package week11;

public class AnimalEx {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("-------------");
		
		Animal animal = null;
		animal = new Dog();
		animal.sound();
		animal = new Cat();
		animal.sound();
		System.out.println("-------------");

		animalSound(new Dog());	
		System.out.println("-------------");
		animalSound(new Cat());		
	}

	private static void animalSound(Animal animal) {
		animal.sound();
		animal.breathe();
		//animal.dogLife();	Dog에만 선언
		
		if (animal instanceof Dog) {
			System.out.println("Dog 객체로 변환 가능");
			Dog dog = (Dog)animal;
			dog.dogLife();
		}else if (animal instanceof Cat){
			System.out.println("Cat 객체로 변환 가능");
			Cat cat = (Cat)animal;
			cat.catLife();
		}
	}

}
