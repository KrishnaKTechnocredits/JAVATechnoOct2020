package anjaliP;

public class CarSpecification {
	String companyName;
	boolean automatic;
	double speed;
	void setCompanyName(String companyName) {
		this.companyName=companyName;
	}
	void setIsCarAutomatic(boolean automatic) {
		this.automatic=automatic;
	}
	void setCarSpeed(double speed) {
		this.speed=speed;
	}
	void displaySpecification() {
		System.out.println("----------Car Specification------------------");
		System.out.println("Car Name is - " +companyName);
		if(automatic==true)
			System.out.println("Car is Automatic ");
		else
			System.out.println("Car is Manual ");
		System.out.println("Car Speed is :  "+speed+" Km/hr");
		
	}
	public static void main(String[]a) {
		CarSpecification car = new CarSpecification();
		car.setCompanyName("Renault");
		car.setIsCarAutomatic(true);
		car.setCarSpeed(120.3);
		car.displaySpecification();
	}
}
