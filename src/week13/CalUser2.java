package week13;

public class CalUser2 extends Thread{
	private Calculator calc;
	
	public void setCalculator(Calculator calc) {
		setName("User2");
		this.calc = calc;
	}

	@Override
	public void run() {
		try {
			calc.setMemory(50);
		} catch (InterruptedException e) {
			
		}
	}
}
