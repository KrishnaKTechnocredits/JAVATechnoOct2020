package ankita;

public class ITProfessional {
	String employeeName;
	boolean doesPartyOnWeekend,isAddictedToTea, isAddictedToCoffee,isAddictedToAlcohol;
	void empName(String name){
		employeeName = name;
	}
	void doesPartyOnWeekend(boolean doesPartyOnWeekendFlag){
		doesPartyOnWeekend = doesPartyOnWeekendFlag;
	}
	void isAddictedToTea(boolean isAddictedToTeaFlag){
		isAddictedToTea = isAddictedToTeaFlag;
	}
	void isAddictedToCoffee(boolean isAddictedToCoffeeFlag){
		isAddictedToCoffee = isAddictedToCoffeeFlag;
	}
	void isAddictedToAlcohol(boolean isAddictedToAlcoholFlag){
		isAddictedToAlcohol = isAddictedToAlcoholFlag;
	}
	void displayInformation(){
		System.out.println("Employee Name :" + employeeName);
		if(doesPartyOnWeekend)
			System.out.println(employeeName + " Party on weekend ");
		else 
			System.out.println(employeeName + " does not Party on weekend ");
		if(isAddictedToTea)	
			System.out.println(employeeName + " is addicted to  tea ");
		else 
			System.out.println(employeeName + " is not addicted to  tea  ");
		if(isAddictedToCoffee)
			System.out.println(employeeName + " is addicted to coffee ");
		else 
			System.out.println(employeeName + " is not addicted to coffee ");
		if(isAddictedToAlcohol)
			System.out.println(employeeName + " is addicted to alcohol ");
		else 
			System.out.println(employeeName + " is addicted to alcohol  ");		
	}
	public static void main(String[] args){
		ITProfessional iTProfessional = new ITProfessional();
		iTProfessional.empName("John");
		iTProfessional.doesPartyOnWeekend(true);
		iTProfessional.isAddictedToTea(true);
		iTProfessional.isAddictedToCoffee(false);
		iTProfessional.isAddictedToAlcohol(true);
		iTProfessional.displayInformation();
	}
}
