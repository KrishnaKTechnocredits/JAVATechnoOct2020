package suvela;
class ITProfessional{
	String empName;
	boolean doesPartyOnWeekend;
	boolean isAddictedToTea;
	boolean isAddictedToCoffee;
	boolean isAddictedToAlcohol;
	void empName(String empName){
		this.empName = empName;
	}
	void doesPartyOnWeekend(boolean doesPartyOnWeekend){
		this.doesPartyOnWeekend = doesPartyOnWeekend;
	}
	void isAddictedToTea(boolean isAddictedToTea){
		this.isAddictedToTea = isAddictedToTea;
	}
	void isAddictedToCoffee(boolean isAddictedToCoffee){
		this.isAddictedToCoffee = isAddictedToCoffee;
	}
	void isAddictedToAlcohol(boolean isAddictedToAlcohol){
		this.isAddictedToAlcohol = isAddictedToAlcohol;
	}
	void displayInformation(){
		System.out.println("Employee name is: " +empName);
		if(doesPartyOnWeekend == true)
			System.out.println(empName +" " + "goes to party on weekend");
		else
			System.out.println(empName +" " + "does not go to party on weekend");
		if(isAddictedToTea == true)
			System.out.println(empName +" " + "drinks tea");
		else
			System.out.println(empName +" " + "does not drink tea");
		if(isAddictedToCoffee == true)
			System.out.println(empName +" " + "drinks coffee");
		else
			System.out.println(empName +" " + "does not drink coffee");
		if(isAddictedToAlcohol == true)
			System.out.println(empName +" " + "drinks alcohol");
		else
			System.out.println(empName +" " + "does not drink alcohol");
	}
	public static void main(String[] a){
		ITProfessional itprofessional = new ITProfessional();
		itprofessional.empName("Suvela");
		itprofessional.doesPartyOnWeekend(false);
		itprofessional.isAddictedToTea(false);
		itprofessional.isAddictedToCoffee(true);
		itprofessional.isAddictedToAlcohol(false);
		itprofessional.displayInformation();
	}
}