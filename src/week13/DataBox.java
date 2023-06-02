package week13;

public class DataBox {
	private String data;

	public synchronized String getData() {
		if(this.data == null) {
			try {
				wait();
			} catch (InterruptedException e) {}
		}
		
		String returnValue = this.data;
		System.out.println("Consumer 스레드가 읽은 데이터 : " + returnValue);
			
		this.data = null;
		notify();
		return data;
	}

	//생산자가 처리하는 부분
	public synchronized void setData(String data) {
		if(this.data != null) {
			try {
				wait();
			} catch (InterruptedException e) {	}
		}
		this.data = data;
		System.out.println("Producer 스레드가 생산한 데이터 : " + this.data);
		notify();
	}
}
