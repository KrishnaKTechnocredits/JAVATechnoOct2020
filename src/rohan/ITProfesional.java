package rohan;

class ITProfesional{
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
			System.out.println(empName + " is a weekend party animal");
		else
			System.out.println(empName + " is not a weekend party animal");
	}
	public static void main(String[] a){
		ITProfesional itProfesional = new ITProfesional();
		itProfesional.setEmployeeName("Rohan");
		itProfesional.determineTeaAddiction(true);
		itProfesional.determineCoffeeAddiction(true);
		itProfesional.determineAlcoholAddiction(false);
		itProfesional.determinePartyAnimal(false);
		itProfesional.displayInformation();
		System.out.println("-----------------------------------------");
		ITProfesional itProfesional1 = new ITProfesional();
		itProfesional1.setEmployeeName("Vaibhav");
		itProfesional1.determineTeaAddiction(false);
		itProfesional1.determineCoffeeAddiction(false);
		itProfesional1.determineAlcoholAddiction(true);
		itProfesional1.determinePartyAnimal(true);
		itProfesional1.displayInformation();
	}
}