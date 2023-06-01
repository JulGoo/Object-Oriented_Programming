package week11;

public class PoketmonEx {
	public static void main(String[] args) {
		Poketmon[] mon = new Poketmon[3];
		
		mon[0] = new Pikachu(); 
		mon[1] = new Pairi();
		mon[2] = new Purin();
		
		for(Poketmon pm : mon) {
			pm.introduce();
		}
	}

}
