package anjaliP;

public class ITProfessional {
	String name;
	boolean doesParty;
	boolean tea;
	boolean coffee;
	boolean alcohol;
	
	void empName(String name) {
		this.name=name;
	}
	void doesPartOnWeekend(boolean doesParty) {
		this.doesParty=doesParty;
	}
	void isAddictedToTea(boolean tea) {
		this.tea=tea;
	}
	void isAddictedToCoffee(boolean coffee) {
		this.coffee=coffee;
	}
	void isAddictedToAlcohol(boolean alcohol) {
		this.alcohol=alcohol;
	}
	void displayInformation() {
		System.out.println("-------------IT Professionals Habits------------------");
		System.out.println("Employee name :  "+name);
		if(doesParty==true)
			System.out.println("Does Parties on :  "+doesParty);
		else
			System.out.println("Does Parties on :  "+doesParty);
		if(tea==true)
			System.out.println("Is Addicted to :  "+tea);
		else
			System.out.println("Is Addicted to :  "+tea);
		if(coffee==true)
			System.out.println("Is Addicted to :  "+coffee);
		else
			System.out.println("Is Addicted to :  "+coffee);
		if(alcohol==true)
			System.out.println("Is Addicted to :  "+alcohol);
		else
			System.out.println("Is Addicted to :  "+alcohol);	
	}
	public static void main(String[]a) {
		ITProfessional itProfessional = new ITProfessional();
		itProfessional.empName("Supriya");
		itProfessional.doesPartOnWeekend(true);
		itProfessional.isAddictedToTea(true);
		itProfessional.isAddictedToCoffee(false);
		itProfessional.isAddictedToAlcohol(false);
	}

}
