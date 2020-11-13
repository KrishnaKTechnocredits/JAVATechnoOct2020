package poojap;

public class Car {

	String carName;
	boolean isCarAutomic;
	double carspeed;
	
	void setCompanyName(String carName) {
		this.carName=carName;
	}
	void setisCarAutomic(boolean isCarAutomic) {
		this.isCarAutomic=isCarAutomic;
	}
	void setCarSpeed(double carspeed) {
		this.carspeed= carspeed;
	}
	void displaySpecification() {
		
		System.out.println("Car Company Name " +carName);
		System.out.println("car speed is " +carspeed);
		if(isCarAutomic)
			System.out.println("car is automatic");
		else
			System.out.println("car is not automatic");
	}
	
	public static void main(String[] args) {
		
		Car car=new Car();
		car.setCompanyName("Honda");
		car.setisCarAutomic(false);
		car.setCarSpeed(110);
		car.displaySpecification();
	}
}
