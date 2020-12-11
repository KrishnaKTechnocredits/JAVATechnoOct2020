package priyanka;

public class ITProfessional {

	String empName;
	boolean addictedToTea;
	boolean addictedToCoffee;
	boolean addictedToAlcohol;
	boolean partyOnWeekend;

	void empName(String empName) {
		this.empName = empName;
	}

	void doesPartyOnWeekend(boolean partyOnWeekend) {
		this.partyOnWeekend = partyOnWeekend;
	}

	void setIsAddictedToTea(boolean addictedToTea) {
		this.addictedToTea = addictedToTea;
	}

	void setIsAddictedToCoffee(boolean addictedToCoffee) {
		this.addictedToCoffee = addictedToCoffee;
	}

	void setIsAddictedToAlcohol(boolean addictedToAlcohol) {
		this.addictedToAlcohol = addictedToAlcohol;
	}

	void displayInformation() {
		System.out.println("Employee Name is: " + empName);

		if (partyOnWeekend)
			System.out.println(empName + " does Party on Weekend ");
		else
			System.out.println(empName + " does not Party on Weekend");

		if (addictedToTea)
			System.out.println(empName + " is addicted to Tea");
		else
			System.out.println(empName + " is not addicted to Tea");

		if (addictedToCoffee)
			System.out.println(empName + " is addicted to Coffee");
		else
			System.out.println(empName + " is not addicted to Coffee");

		if (addictedToAlcohol)
			System.out.println(empName + " is addicted to Alcohol");
		else
			System.out.println(empName + " is not addicted to Alcohol");
	}

	public static void main(String[] args) {
		ITProfessional iTProfessional = new ITProfessional();
		iTProfessional.empName("Riya");
		iTProfessional.doesPartyOnWeekend(true);
		iTProfessional.setIsAddictedToTea(true);
		iTProfessional.setIsAddictedToCoffee(true);
		iTProfessional.setIsAddictedToAlcohol(false);
		iTProfessional.displayInformation();
	}

}
