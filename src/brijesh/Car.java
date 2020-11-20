package brijesh;
class Car{
	String companyName;
	boolean isCarAutomatic;
	double carSpeed;
	void setcompanyName(String companyName){
		this.companyName=companyName;
	}
	void setIsCarAutomatic(boolean isCarAutomatic){
		this.isCarAutomatic=isCarAutomatic;
	}
	void setCarSpeed(double carSpeed){
		this.carSpeed=carSpeed;
	}
	void displaySpecification(){
		System.out.println("Company Name is: "+companyName);
		if(isCarAutomatic)
			System.out.println(companyName+" car is automatic");
		else
			System.out.println(companyName+" car is manual");
		System.out.println("Speed of car is: "+carSpeed);
	}
	public static void main(String[] args){
		Car car=new Car();
		car.setcompanyName("Maruti");
		car.setIsCarAutomatic(true);
		car.setCarSpeed(120);
		car.displaySpecification();
	}
}