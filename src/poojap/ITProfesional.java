package poojap;

public class ITProfesional {
	
	String empName;
	boolean isAddictedToTea;
	boolean isAddictedToCoffee;
	boolean isAddictedToAlcohol;
	boolean doesPartyOnWeekend;
	
	void setEmployeeName(String empName){
		this.empName = empName;
	}
	void determineTeaAddiction(boolean isAddictedToTea){
		this.isAddictedToTea = isAddictedToTea;
	}
	void determineCoffeeAddiction(boolean isAddictedToCoffee){
		this.isAddictedToCoffee = isAddictedToCoffee;
	}
	void determineAlcoholAddiction(boolean isAddictedToAlcohol){
		this.isAddictedToAlcohol = isAddictedToAlcohol;
	}
	void determinePartyAnimal(boolean doesPartyOnWeekend){
		this.doesPartyOnWeekend = doesPartyOnWeekend;
	}
	void displayInformation(){
		
		if(isAddictedToTea)
			System.out.println(empName + " is addicted to Tea");
		else
			System.out.println(empName + " is not addicted to Tea");
		if(isAddictedToCoffee)
			System.out.println(empName + " is addicted to Coffee");
		else
			System.out.println(empName + " is not addicted to Coffee");
		if(isAddictedToAlcohol)
			System.out.println(empName + " is addicted to Alcohol");
		else
			System.out.println(empName + " is not addicted to Alcohol");
		if(doesPartyOnWeekend)
			System.out.println(empName + " do party on weekend");
		else
			System.out.println(empName + "does not party on weekend");
	}
	
	public static void main(String[] args){
		
		ITProfesional itProfesional = new ITProfesional();
		itProfesional.setEmployeeName("Pooja");
		itProfesional.determineTeaAddiction(true);
		itProfesional.determineCoffeeAddiction(false);
		itProfesional.determineAlcoholAddiction(false);
		itProfesional.determinePartyAnimal(true);
		itProfesional.displayInformation();
	}
}
