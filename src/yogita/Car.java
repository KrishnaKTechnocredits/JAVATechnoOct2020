package yogita;

public class Car{
     String companyName;
	 boolean isAutomaticCar;
	 double speed;
	 
    void setcompanyName(String carName){
	  companyName = carName;
	}
	void setIsCarAutomatic(boolean isAutomatic){
	  isAutomaticCar = isAutomatic;
	}
	void setCarSpeed(double carSpeed){
	  speed = carSpeed;
	}
	void displaySpecification(){
	  System.out.println("The Name Of Car iS:" +companyName);
	     if(isAutomaticCar == true)
		    System.out.println("The Car is Automatic");
	     else
		    System.out.println("The Car iS Not Automatic");
	  System.out.println("The Speed Of Car iS:" +speed);
	}
	
 public static void main(String [] arr){
       Car car = new Car();
	   car.setcompanyName("Mercedes");
	   car.setIsCarAutomatic(true);
	   car.setCarSpeed(90.20);
	   System.out.println("-----------Car's Specifications Are ----------");
	   car.displaySpecification();
    }
 }

