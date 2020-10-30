package mrunal;

public class ItProfessional {
	
	    String  empname = "Hridayam" ;
	    boolean weekendparty;
	    boolean teaaddicted;
	    boolean coffeeaddicted;
	    boolean alcoholaddicted;

	 void empName(){
	   System.out.println("Employee name is "  +empname);
	}
	 void doesPartyOnWeekend(){
	   if(true)
	     System.out.print("He does party on weekend");
	}
	 void isAddictedToTea() {
	    if(true)
	      System.out.print(" , addicted to tea");
	}
	 void isAddictedToCoffee() {
	   if(true)
	      System.out.print(" , addicted to coffee");
	}
	 void isAddictedToAlcohol(){
	    if(alcoholaddicted !=false)
	      System.out.print(" , addicted to alcohol");
	    else 
	    System.out.print(" , not addicted to alcohol");
	}
	 void displayInformation(){
	     System.out.print("\n" + "Habbits of  Hridayam are : ");

	}
	 public static void main(String[]args){
		 ItProfessional itprofessional = new ItProfessional();  
	      itprofessional.empName();      
	      itprofessional.displayInformation();
	      itprofessional.doesPartyOnWeekend();
	      itprofessional.isAddictedToTea();
	      itprofessional.isAddictedToCoffee();
	      itprofessional.isAddictedToAlcohol();

	}

	} 


