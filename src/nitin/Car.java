/*	Date - 23-Oct-2020, Day 7
	Java Assignment 4 - Program:1

1. Create a class named Car, which contains method like below
 	 a. setcompanyName()
 	 b. setIsCarAutomatic()
 	 c. setCarSpeed()
  	 d. displaySpecification()
  Hint: One String, one boolean and one double variable needed.  */
package nitin;
class Car{
	String automobileCompanyName;
	boolean transmissionOfCar;
	double speedOfCar;
	void setcompanyName(String automobileCompanyName){
		this.automobileCompanyName=automobileCompanyName;		
	}
	void setIsCarAutomatic(boolean transmissionOfCar){
		this.transmissionOfCar=transmissionOfCar;
	}
	void setCarSpeed(double speedOfCar){
		this.speedOfCar=speedOfCar;
	}
	void displaySpecification(){
		System.out.println("AutoMobile Company Name is "+automobileCompanyName);
		if(transmissionOfCar)
			System.out.println("Car is having Automatic Transmission");
		else
			System.out.println("Car is having Manual Transmission");
		System.out.println("Speed of the Car is "+speedOfCar+"Km/Hr");
	}
	public static void main(String[] a){
		Car car = new Car();
		car.setcompanyName("BMW");
		car.setIsCarAutomatic(false);
		car.setCarSpeed(200.5);
		car.displaySpecification();
	}

}