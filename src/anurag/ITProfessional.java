package anurag;

public class ITProfessional {

	String empname;
	// boolean partyOnWeekend;
	// boolean addictedToTea;
	// boolean addictedToCoffee;
	// boolean addictedToAlcohol;
	String flag1;
	String flag2;
	String flag3;
	String flag4;

	void empname(String empname) {
		this.empname = empname;
	}

	void doesPartyOnWeekend(boolean partyOnWeekend) {
		// this.partyOnWeekend=partyOnWeekend;
		if (partyOnWeekend == true) {
			flag1 = "Employee parties on weekend";
		} else
			flag1 = "Employee does not party on weekend";
	}

	void isaddictedToTea(boolean addictedToTea) {
		// this.addictedToTea=addictedToTea;
		if (addictedToTea == true) {
			flag2 = "Employee is addicted to tea";
		} else
			flag2 = "Employee is not addicted to tea";

	}

	void isAddictedToCoffee(boolean addictedToCoffee) {
		// this.addictedToCoffee=addictedToCoffee;
		if (addictedToCoffee == false) {
			flag3 = "Employee is addicted to coffee";
		} else
			flag3 = "Employee is not addicted to coffee";
	}

	void isaddictedToAlcohol(boolean addictedToAlcohol) {
		// this.addictedToAlcohol=addictedToAlcohol;
		if (addictedToAlcohol == true) {
			flag4 = "Employee is addicted to Alcohol";
		} else
			flag4 = "Employee is not addicted to not  Alcohol";

	}

	void printdisplayInformation() {
		System.out.println("Employee name is :" + empname);
		System.out.println("Weekend Routine : " + flag1);
		System.out.println("Tea addiction: " + flag2);
		System.out.println("Coffee addiction: " + flag3);
		System.out.println("Alcohol addiction: " + flag4);
	}

	public static void main(String[] args) {
		ITProfessional itProfessional1 = new ITProfessional();
		itProfessional1.empname("Komal");
		itProfessional1.doesPartyOnWeekend(true);
		itProfessional1.isaddictedToTea(true);
		itProfessional1.isAddictedToCoffee(true);
		itProfessional1.isaddictedToAlcohol(false);
		itProfessional1.printdisplayInformation();
	}
}
