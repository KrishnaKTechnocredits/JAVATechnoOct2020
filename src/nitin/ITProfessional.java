/*	Date - 23-Oct-2020, Day 7
	Java Assignment 4 - Program:2

2. Create a class named as ITProfessional which contain below methods  
	a. empName()  
	b. doesPartyOnWeekend()  
	c. isAddictedToTea()  
	d. isAddictedToCoffee()  
	e. isAddictedToAlcohol() 
	f. displayInformation()
Hint: One String, 4 boolean variable needed
Note: In Console Print statement in a proper way. */
package nitin;

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
		System.out.println("Employee Name :: "+nameOfEmployee);
		if(partyAnimal)
			System.out.println("Weekend Status :: Engaged in Party.");
		else
			System.out.println("Weekend Status :: Sleeping.");
		if(coffeeLover)
			System.out.println(nameOfEmployee+" is a Coffee Lover !!");
		else
			System.out.println(nameOfEmployee+" doesn't like Coffee at all !!");
		if(alchohalic)
			System.out.println(nameOfEmployee+" is a Wine Connoisseur !!");
		else
			System.out.println(nameOfEmployee+" doesn't like Alcohal at all !!");
	}
	public static void main(String[] a){
		ITProfessional itProfessional = new ITProfessional();
		itProfessional.empName("Vicky kaushal");
		itProfessional.doesPartyOnWeekend(true);
		itProfessional.isAddictedToCoffee(false);
		itProfessional.isAddictedToAlcohol(true);
		itProfessional.displayInformation();
	}
}