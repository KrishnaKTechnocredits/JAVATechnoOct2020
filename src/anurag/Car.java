package anurag;

class Car{
	String companyname;
	//boolean cartype;
	double carspeed;
	String flag;
	
	void setcompanyName(String companyname){
	  this.companyname=companyname;  
	}
	void setIscarAutomatic(boolean cartype ){
	//  this.cartype=cartype;
	  if(cartype == false){
	  flag = "Manual";
      }
	  else
      flag= "Automatic";    	  
	}
    void setCarSpeed(double carspeed){
	  this.carspeed=carspeed;
	}
	void displaySpecification(){
	  System.out.println("Company name is :" +companyname);
	  System.out.println("Car Type is :" +flag);
	  System.out.println("Car Speed in km/hr :" +carspeed);
	} 
	
    public static void main(String[] args){
	  Car car1 = new Car();
	  car1.setcompanyName("Toyota");
	  car1.setIscarAutomatic(false);
	  car1.setCarSpeed(500);
	  car1.displaySpecification();
    }
	
}
	   
	   
	   
	
	 