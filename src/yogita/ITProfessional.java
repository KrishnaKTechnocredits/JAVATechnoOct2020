package yogita;

public class ITProfessional{
	String name;
	boolean partyOnWeekend;
	boolean addictedToTea;
	boolean addictedToCoffe;
	boolean addictedToAlcohol;

  void empName(String name) {
	 this.name = name;
  }
  void doesPartyOnWeekend(boolean partyOnWeekend){
	 this.partyOnWeekend = partyOnWeekend;
  }
  void isAddictedToTea(boolean addictedToTea){
	 this.addictedToTea = addictedToTea;
  }
  void isAddictedToCoffee(boolean addictedToCoffe){
	 this.addictedToCoffe = addictedToCoffe;
  }
  void isAddictedToAlcohol(boolean addictedToAlcohol){
	 this.addictedToAlcohol = addictedToAlcohol;
  }
  
  void displayInformation(){
	  System.out.println("Tha Name Of Employee Is:" + name);
	  	if(partyOnWeekend == true)
	  		System.out.println( name + " Does Party On Weekend");
	  	else
	  		System.out.println( name + " Does not Party On Weekend");

	  	if(addictedToTea == true)
	  		System.out.println( name +" Is Addicted To Tea");
	  	else
	  		System.out.println( name +" Is Not  Addicted To Tea");
 
	  	if(addictedToCoffe == true)
	  		System.out.println( name + " Is Addicted To Coffe");
	  	else
	  		System.out.println( name + " Is Not Addicted To Coffe");
 
	  	if(addictedToAlcohol == true)
	  		System.out.println( name + " Is Addicted To Alcohol");
	  	else
	  		System.out.println( name + " Is Not Addicted To Alcohol");
  }
  
 public static void main(String [] arr){
	 ITProfessional itProfessional = new ITProfessional();
	 System.out.println("-------------- Employee's Information ------------");
	 itProfessional.empName("Ritesh");
	 itProfessional.doesPartyOnWeekend(false);
	 itProfessional.isAddictedToTea(true);
	 itProfessional.isAddictedToCoffee(true);
	 itProfessional.isAddictedToAlcohol(false);
	 itProfessional.displayInformation();
 }
}





    
