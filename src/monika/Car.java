package monika;
class Car{
 
     String companyName;
	 boolean isCarAutomatic;
	 double carSpeed;
	 
	 void setCompanyName(String companyName){
	      this.companyName=companyName;
		  
	}

    void setIsCarAutomatic(boolean isCarAutomatic){
	      this.isCarAutomatic=isCarAutomatic; 
		  
	}

    void setCarSpeed(double carSpeed) {
         this.carSpeed=carSpeed;
    }
    void displaySpecification(){
	  System.out.println("Cars's campany name :"+companyName + "\n"+"Speed is "+carSpeed+ "\n");
	  if(isCarAutomatic ==false)
	     System.out.println("it is not automatic");
	  else
	    System.out.println("it is automatic");
	}
    public static void main(String []args){
               Car car=new Car();
			   car.setCompanyName("Nexa");
			   car.setIsCarAutomatic(true);
			   car.setCarSpeed(100);
			   car.displaySpecification();
			   
	}
}
	










