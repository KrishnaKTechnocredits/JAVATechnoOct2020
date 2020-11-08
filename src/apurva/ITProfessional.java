package apurva;

class ITProfessional {
	String empName;
	boolean partyonweekend;
	boolean addictedtotea;
	boolean addictedtocoffee;
	boolean addictedtoalcohol;
	void empName(String empName) {
		this.empName = empName;
	}

	void doesPartyOnWeekend(boolean partyonweekend) {
		if (partyonweekend == false){
			System.out.println("Party on weekend");
		}
	}

	void isAddictedToTea(boolean addictedtotea){
		if (addictedtotea == false){
			System.out.println("Addicated to tea");
		}
	}

	void isAddictedToCoffee(boolean addictedtocoffee){
		if (addictedtocoffee == false){
			System.out.println("Addicated to coffee");
		}
	}

	void isAddictedToAlcohol(boolean addictedtoalcohol){
		if (addictedtoalcohol == false){
			System.out.println("Addicated to alcohol");
		}
	}

	void displayInformation(){
		System.out.println("employ name: " + empName);
	}

	public static void main(String[] args) {
		ITProfessional itprofessional = new ITProfessional();
		itprofessional.empName("Odiyon");
		itprofessional.doesPartyOnWeekend(false);
		itprofessional.isAddictedToTea(true);
		itprofessional.isAddictedToCoffee(false);
		itprofessional.isAddictedToAlcohol(true);
		itprofessional.displayInformation();
	}
}