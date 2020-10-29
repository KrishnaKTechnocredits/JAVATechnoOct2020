package suresh;

public class Car {
	String companyname;
	 boolean Automatic;
	 double speed;
	void setCompanyName(String companyname) {
		this.companyname = companyname; 

	}
	void setlsCarAutomatic(boolean Automatic) {
		this.Automatic = Automatic;
		
	}
	void setCarSpeed(double speed) {
		this.speed = speed;
		
	}
	void displaySpecification() {
		System.out.println("Car Specifications:" );
		System.out.println("Car Brand Name :" + companyname + " Company Ltd.");
		if(Automatic== true){
			
		System.out.println("Car is fully Automatic" );
	}
		else {
			System.out.println("Car is Manual");
		}
		System.out.println("Car Speed:" + speed + " Kms/hr.");
	}
				
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		car.setCompanyName("Tata");
		car.setlsCarAutomatic(true);
		car.setCarSpeed(100.223);
		car.displaySpecification();
		
	}

}
