package week10;

public class AirplaneEx {
	public static void main(String[] args) {
		SonicAirplane sPlane = new SonicAirplane();
		sPlane.takeOff();
		sPlane.fly();
		sPlane.land();
		
		sPlane.flyMode = SonicAirplane.SUPERSONIC;
		sPlane.fly();	//재정의한 메소드가 실행된다.
		sPlane.flyMode = SonicAirplane.NORMAL;
		sPlane.fly();
		
		
	}

}
