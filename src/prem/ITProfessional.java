
package prem;

class ITProfessional{
	String nameOfEmployee;
	boolean partyAnimal;
	boolean coffeeLover;
	boolean alchohalic;
	void empName(String nameOfEmployee){
		this.nameOfEmployee=nameOfEmployee;
	}
	void doesPartyOnWeekend(boolean partyAnimal){
		this.partyAnimal=partyAnimal;
	}
	void isAddictedToCoffee(boolean coffeeLover){
		this.coffeeLover=coffeeLover;
	}
	void isAddictedToAlcohol(boolean alchohalic){
		this.alchohalic=alchohalic;
	}
	void displayInformation(){
		System.out.println("Employee Name : "+nameOfEmployee);
		if(partyAnimal)
			System.out.println("Weekend Status : Party.");
		else
			System.out.println("Weekend Status : Sleeping.");
		if(coffeeLover)
			System.out.println(nameOfEmployee+" likes Coffee!");
		else
			System.out.println(nameOfEmployee+" doesn't like Coffee at all !!");
		if(alchohalic)
			System.out.println(nameOfEmployee+" does not like alchohal");
		else
			System.out.println(nameOfEmployee+" doesn't like Alcohal at all !!");
	}
	public static void main(String[] a){
		ITProfessional itProfessional = new ITProfessional();
		itProfessional.empName("MohanBhargav");
		itProfessional.doesPartyOnWeekend(true);
		itProfessional.isAddictedToCoffee(false);
		itProfessional.isAddictedToAlcohol(true);
		itProfessional.displayInformation();
	}
}