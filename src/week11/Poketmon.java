package week11;

public abstract class Poketmon {
	abstract void name();
	abstract void attack();
	abstract void passive();

	public void introduce() {
		name();
		attack();
		passive();
	}
	
	

}
