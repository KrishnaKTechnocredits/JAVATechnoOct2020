package shrutiS;

public class ITProfessional {
	String name;
	boolean partyOnWeekend;
	boolean addictedToTea;
	boolean addictedToCoffee;
	boolean addictedToAlcohol;

	void empName(String name){
		this.name = name;
	}
	void doesPartyOnWeekend(boolean partyOnWeekend){
		this.partyOnWeekend =partyOnWeekend;
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
		System.out.println("Name of the employee is "+name);
		if(partyOnWeekend == true)
			System.out.println(name+" do party on weekend");
		else
			System.out.println(name+" do shopping on weekend");
		if(addictedToTea == true)
			System.out.println(name+" is addicted to Tea");
		else 
			System.out.println(name+" is not addicted to Tea");
		if(addictedToCoffee == true)
			System.out.println(name+" likes Coffee");
		else
			System.out.println(name+" is hate Coffee");
		if(addictedToAlcohol == true)
			System.out.println(name+" is addicted to Alcohol");
		else
			System.out.println(name+" is not addicted to Alcohol");
	}
	public static void main(String[] a){
		ITProfessional iTprofessional = new ITProfessional();
		iTprofessional.empName("Shikha");
		iTprofessional.doesPartyOnWeekend(false);
		iTprofessional.isAddictedToTea(true);
		iTprofessional.isAddictedToCoffee(true);
		iTprofessional.isAddictedToAlcohol(false);
		iTprofessional.displayInformation();
	}
}
