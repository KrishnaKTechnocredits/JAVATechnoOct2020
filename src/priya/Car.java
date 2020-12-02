package priya;

public class Car {
	String companyName;
	boolean carAutomatic;
	double carSpeed;

	void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	void setCarAutomatic(boolean cartype) {
		this.carAutomatic = cartype;
	}

	void setCarSpeed(double carSpeed) {
		this.carSpeed = carSpeed;
	}

	void displaySpecification() {
		System.out.println("Company Name is: " + companyName);
		if (carAutomatic == true) {
			System.out.println(companyName + " is Automatic car");
		} else {
			System.out.println(companyName + " is Manual car");
		}
		System.out.println("Speed of car is : " +carSpeed);
	}

	public static void main(String[] args) {
		Car car = new Car();
		car.setCompanyName("Audi");
		car.setCarAutomatic(true);
		car.setCarSpeed(155);
		car.displaySpecification();
	}
}
