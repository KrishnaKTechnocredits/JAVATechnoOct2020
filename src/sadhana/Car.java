package sadhana;

class Car {

	String companyName;
	boolean carAutomatic;
	double carSpeed;

	void setcompanyName(String name) {
		companyName = name;
	}

	void setIsCarAutomatic(boolean carType) {
		carAutomatic = carType;
	}

	void setCarSpeed(double speed) {
		carSpeed = speed;
	}

	void displaySpecification() {
		System.out.println("------Car specifivations are------");
		System.out.println("Company name is: " + companyName);
		if (carAutomatic)
			System.out.println("It is automatic car");
		else
			System.out.println("It is not automatic car");
		System.out.println("Speed of car is: " + carSpeed + " kmph");
	}

	public static void main(String[] args) {
		Car car = new Car();
		car.setcompanyName("BMW");
		car.setIsCarAutomatic(true);
		car.setCarSpeed(15.50);
		car.displaySpecification();
	}
}
