package surbhi;
class Car{
	
	String name;
	double carSpeed;
	boolean isCarAutomatic;
	
	void setCompantName(String name){
		this.name=name;
	}
	void setIscarAutomatic(boolean isCarAutomatic){
		this.isCarAutomatic=isCarAutomatic;
	}
	void setCarSpeed(double carSpeed){
		this.carSpeed=carSpeed;
	}
	void displaySpecification(){
		System.out.println("Comapnay Name is " + name);
		System.out.println("Car Speed is " + carSpeed);
		if(isCarAutomatic){
			System.out.println("Is car Automatic--Yes");
		}
		else{
			System.out.println("Is car Automatic--No");
		}
	}
	public static void main(String[] args){
		Car car=new Car();
		car.setCompantName("Honda");
		car.setIscarAutomatic(true);
		car.setCarSpeed(90.48);
		car.displaySpecification();
	}
}