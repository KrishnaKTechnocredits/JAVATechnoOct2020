package priyanka;

//Program Car Name

class Car{
	String companyName;
	double carSpeed;
	boolean isCarAutomatic;
	
	void setCompanyName(String companyName){
		this.companyName=companyName;	
	}
	
	void setCarSpeed(double carSpeed){
		this.carSpeed=carSpeed;	
	}
	
	void setIsCarAutomatic(boolean isCarAutomatic){
		this.isCarAutomatic=isCarAutomatic;	
	}
	
	void displaySpecification(){
		System.out.println(" Car's company name is : "+companyName);
		System.out.println(" Speed of car is : "+ carSpeed);
		if(isCarAutomatic == false)
			System.out.println(" Car is automatic");
		else
			System.out.println(" Car is not automatic");
	}	
	public static void main(String[] args){
		Car car = new Car();
		car.setCompanyName("Honda");
		car.setCarSpeed(100);
		car.setIsCarAutomatic(true);
		car.displaySpecification();	
	}	
}
	
