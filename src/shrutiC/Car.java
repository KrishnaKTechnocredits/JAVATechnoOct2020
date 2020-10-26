package shrutiC;

class Car{
	
	String companyName;
	double carSpeed;
	boolean isCarAutomaticFlag;
	
	void setCompanyName(String companyName){
		this.companyName=companyName; //this operator is used to store the companyName in the instance variable of class
	}
	
	void setIsCarAutomatic(boolean isCarAutomaticFlag){
		this.isCarAutomaticFlag=isCarAutomaticFlag;
	}
	
	void setCarSpeed(double carSpeed){
		this.carSpeed=carSpeed;
	}
	
	void displaySpecification(){
		System.out.println("The car Specifications are as mentioned below :- ");
		System.out.println("Company Name : "+companyName);
		System.out.println("Car speed : " + carSpeed + " kmph");
		
		if(isCarAutomaticFlag)
			System.out.println("Is car Automatic : Yes");
		else
			System.out.println("Is car Automatic : No");
	}
	
	public static void main(String[] args){
		
		Car car = new Car();
		car.setCompanyName("Honda");
		car.setCarSpeed(90.8);
		car.setIsCarAutomatic(false);
		car.displaySpecification();
	}
	
	
	
}