package brijesh;
class ITProfessional {
	String employeeName;
	boolean empDoesPartyOnWeekend;
	boolean empIsAddictedToTea;
	boolean empIsAddictedToCoffee;
	boolean empIsAddictedToAlcohol;
	void empName(String employeeName){
		this.employeeName=employeeName;
	}
	void doesPartyOnWeekend(boolean empDoesPartyOnWeekend){
		this.empDoesPartyOnWeekend=empDoesPartyOnWeekend;
	}
	void isAddictedToTea(boolean empIsAddictedToTea){
		this.empIsAddictedToTea=empIsAddictedToTea;
	}
	void isAddictedToCoffee(boolean empIsAddictedToCoffee){
		this.empIsAddictedToCoffee=empIsAddictedToCoffee;
	}
	void isAddictedToAlcohol(boolean empIsAddictedToAlcohol){
		this.empIsAddictedToAlcohol=empIsAddictedToAlcohol;
	}
	void displayInformation(){
		System.out.println("Employee name is: "+employeeName);
		if(empDoesPartyOnWeekend)
			System.out.println(employeeName+" does party on weekend");
		else
			System.out.println(employeeName+" does not party on weekend");
		if(empIsAddictedToTea)
			System.out.println(employeeName+" is tea addictive");
		else
			System.out.println(employeeName+" is not tea addictive");
		if(empIsAddictedToCoffee)
			System.out.println(employeeName+" is coffee addictive");
		else
			System.out.println(employeeName+" is not coffee addictive");
		if(empIsAddictedToAlcohol)
			System.out.println(employeeName+" is alcohol addictive");
		else
			System.out.println(employeeName+" is not alcohol addictive");
	}
	public static void main(String[] args){
		ITProfessional itProfessional = new ITProfessional();
		itProfessional.empName("Raj");
		itProfessional.doesPartyOnWeekend(true);
		itProfessional.isAddictedToTea(true);
		itProfessional.isAddictedToCoffee(true);
		itProfessional.isAddictedToAlcohol(false);
		itProfessional.displayInformation();
	}
}