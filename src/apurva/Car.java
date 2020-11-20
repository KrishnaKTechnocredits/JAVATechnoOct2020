package apurva;

class Car {
	String name;
	boolean automatic;
	double speed;
	void setCompanyName(String name) {
		this.name = name;
	}

	void setIsCarAutomatic(boolean automatic) {
		this.automatic = automatic;
	}

	void SetCarSpeed(double speed){
		this.speed = speed;
			System.out.println("car speed: " + speed);
	}

	void displaySpecification(){
		System.out.println("car company name is: " + name);
	if (automatic == false){
		System.out.println("car is automatic");
	}else{	
		System.out.println("car is manual");
		}	
	}

	public static void main(String[] args) {
		Car car = new Car();
		car.setCompanyName("Honda");
		car.setIsCarAutomatic(true);
		car.SetCarSpeed(80);
		car.displaySpecification();
	}

}