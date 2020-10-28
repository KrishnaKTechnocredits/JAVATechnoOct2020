package raghvendra;

class Car{
	
	String companyName;
	boolean transmission;
	double speed;
	
	void setCompanyName(String companyName){
		this.companyName=companyName;
	}
	
	void setIsCarAutomatic(boolean transmission){
		this.transmission=transmission;
	}
	
	void setCarSpeed(double speed){
		this.speed=speed;
	}
	
	void displaySpecification(){
		System.out.println("Car name is: "+companyName);
		
		if(transmission==true)
			System.out.println("Car transmission is Automatic");
		else
			System.out.println("Car transmission is Manual");

		System.out.println(companyName+" top speed is: "+speed);
	}
	
	public static void main (String[] args){
		Car car=new Car();
		car.setCompanyName("Honda Civic");
		car.setIsCarAutomatic(true);
		car.setCarSpeed(212.50);
		car.displaySpecification();
		
	}
	
}