package monika;
class ITProfessional{
    
	String employeeName;
	boolean partyOnWeekend;
	boolean addictedToTea;
	boolean addictedToCoffee;
	boolean addictedToAlcohol;
	
    void empName(String employeeName){
	   this.employeeName = employeeName;
	   
	  }
	void doesPartyOnWeekend(boolean partyOnWeekend){
	   this.partyOnWeekend = partyOnWeekend;
	   
	   }
	 void isAddictedToTea(boolean addictedToTea){
	      this.addictedToTea = addictedToTea;
		 }
		 
	void isAddictedToCoffee(boolean addictedToCoffee){
	     this.addictedToCoffee = addictedToCoffee;
		 }
		 
	void isAddictedToAlcohol(boolean addictedToAlcohol){
	    this.addictedToAlcohol = addictedToAlcohol;
	   }
	   
	 void displayInformation(){
	    System.out.println("Employee name is " + employeeName);
		
		if(partyOnWeekend == true)
		{
		System.out.println("there is party on weekend");
		}
		else{
		System.out.println("there is no party");
		}
		
		if(addictedToTea == true)
		{
		System.out.println("Employee " + employeeName + " is addicted to tea ");
		}
		else {
		 System.out.println("Employee " + employeeName + " is not addicted to tea ");
		 }
		if(addictedToCoffee == true)
		{
		System.out.println("Employee " + employeeName + " is addicted to coffee ");
		}
		else{
		System.out.println("Employee " + employeeName + " is not addicted to coffe ");
		}
		if(addictedToAlcohol == true)
		{
		System.out.println("Employee " + employeeName + " is addicted to alcohol ");
		}
		else{
		  System.out.println("Employee " + employeeName + " is not addicted to alcohol ");
		}
		}
		 public static void main(String []args){
			
		         ITProfessional itProfessional = new ITProfessional();
				 itProfessional.empName("Monika");
				 itProfessional.doesPartyOnWeekend(true);
				 itProfessional.isAddictedToTea(false);
				 itProfessional.isAddictedToCoffee(true);
				 itProfessional.isAddictedToAlcohol(false);
				 itProfessional.displayInformation();
				 
	}
}
				 
				 
				 
				 
               
		
		 
		 




