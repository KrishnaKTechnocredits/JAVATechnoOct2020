package nagendra;

class ITProfessional{
	String empName;
	boolean doesPartyOnWeekend;
	boolean isAddictedToTea;
	boolean isAddictedToCoffee;
	boolean isAddictedToAlcohol;
	
	void empName(String name){
		empName=name;
	}
	void doesPartyOnWeekend(boolean doPartyOnWeekend){
		doesPartyOnWeekend=doPartyOnWeekend;
	}
	void isAddictedToTea(boolean teaAddict){
		isAddictedToTea=teaAddict;
	}
	void isAddictedToCoffee(boolean coffeeAddict){
		isAddictedToCoffee=coffeeAddict;
	}
	void isAddictedToAlcohol(boolean alcoholAddict){
		isAddictedToAlcohol=alcoholAddict;
	}
	void displayInformation(){
	    System.out.println("Name of Employee is: "+empName);
		if(doesPartyOnWeekend==true)
		System.out.println("Employee " +empName+  " does Party is Weekends");
	    else
		System.out.println(" Employee " +empName+ " does not do  Party is Weekends");
	   if(isAddictedToTea==true)
		System.out.println("Employee " +empName+ " Is Addicted To Tea");
	    else
		System.out.println("Employee " +empName+ " Is not Addicted To Tea");
	   if(isAddictedToCoffee==true)
		System.out.println("Employee " +empName+  " Is Addicted To Coffee");
	    else
		System.out.println("Employee " +empName+ " Is not Addicted To Coffee");
	   if(isAddictedToAlcohol==true)
		System.out.println("Employee " +empName+ " Is Addicted To Alcohol");
	    else
		System.out.println("Employee " +empName+ " Is not Addicted To Alcohol");
	}
	public static void main(String[] args){
		ITProfessional professional=new ITProfessional();
		professional.empName("Erik Boolean");
		professional.doesPartyOnWeekend(true);
		professional.isAddictedToTea(false);
		professional.isAddictedToCoffee(true);
		professional.isAddictedToAlcohol(false);
		professional.displayInformation();
	}
}