package priya;

public class ITProfessional {

	String empName;
	boolean doesPartyOnWeekend;
	boolean isAddictedToTea;
	boolean isAddictedToCoffee;
	boolean isAddictedToAlcohol;

	void empName(String empName) {
		this.empName = empName;
	}

	void doesPartyOnWeekend(boolean doesPartyOnWeekend) {
		this.doesPartyOnWeekend = doesPartyOnWeekend;
	}

	void isAddictedToTea(boolean isAddictedToTea) {
		this.isAddictedToTea = isAddictedToTea;
	}

	void isAddictedToCoffee(boolean isAddictedToCoffee) {
		this.isAddictedToCoffee = isAddictedToCoffee;
	}

	void isAddictedToAlcohol(boolean isAddictedToAlcohol) {
		this.isAddictedToAlcohol = isAddictedToAlcohol;
	}

	void displayInformation() {
		System.out.println("Name of Employee is: " + empName);
		if (doesPartyOnWeekend == true)
			System.out.println(empName + " does party on weekend");
		else
			System.out.println(empName + " does not like to party on weekend");
		if (isAddictedToTea == true)
			System.out.println(empName + " is addicted to Tea");
		else
			System.out.println(empName + " does not like tea");
		if (isAddictedToCoffee == true)
			System.out.println(empName + " is addicted to coffee");
		else
			System.out.println(empName + " does not like coffee");
		if (isAddictedToAlcohol == true)
			System.out.println(empName + " is addicted to Alcohol");
		else
			System.out.println(empName + " does not like Alcohol");
	}

	public static void main(String[] args) {
		ITProfessional itProfessional = new ITProfessional();
		itProfessional.empName("Ajit");
		itProfessional.doesPartyOnWeekend(true);
		itProfessional.isAddictedToTea(true);
		itProfessional.isAddictedToCoffee(true);
		itProfessional.isAddictedToAlcohol(false);
		itProfessional.displayInformation();
	}
}
