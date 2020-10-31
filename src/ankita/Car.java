package ankita;

public class Car {
	String carName;
	boolean isCarAutomtic;
	double carSpeed;
	void setCompanyName(String name){
		carName = name;
	}
	void setIsCarAutomatic(boolean carIsAutomaticFlag){
		isCarAutomtic = carIsAutomaticFlag;
	}
	void setCarSpeed(double speed){
		carSpeed = speed;
	}
	void displaySpecification(){
		System.out.println("\nCar name : " + carName);
		
		if(isCarAutomtic == true)
			System.out.println("Automatic Car");
		else 
			System.out.println("Manual Car");
		
		System.out.println("Car Speed  : " + carSpeed);
	}
	public static void main(String[] args){
		Car car = new Car();
		car.setCompanyName("Amaze");
		car.setIsCarAutomatic(true);
		car.setCarSpeed(50);
		car.displaySpecification();
	}
}
