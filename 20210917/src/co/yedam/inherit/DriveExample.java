package co.yedam.inherit;
/*
 *  Bus -> Vehicle, Taxi -> Vehicle
 */

public class DriveExample {

	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		Bus b = new Bus();
		Taxi t = new Taxi();

		Driver driver = new Driver();
		driver.drive(v); // Vehicle <- Bus, Taxi
		driver.drive(b);
		driver.drive(t);
		
	// p.317, 337 
	//p. 273 instance, static: ScanUtil.readInt(null); 클래스이름.메소드(null);
	}

}
