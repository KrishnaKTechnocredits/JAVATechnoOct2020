package surbhi;

class ITProfessional {
	String empname;
	boolean doesPartyOnWeekend;
	boolean isAddicatedToTea;
	boolean isAddicatedtoCoffee;
	boolean isAddicatedToAlcohol;

  void employeeName(String empname){
		this.empname=empname;
	}
	void partOnweekend(boolean doesPartyOnWeekend){
		this.doesPartyOnWeekend=doesPartyOnWeekend;
	}
	void addicatedToTea(boolean isAddicatedToTea){
		this.isAddicatedToTea=isAddicatedToTea;
	}
	void addicatedtoCoffee(boolean isAddicatedtoCoffee){
		this.isAddicatedtoCoffee=isAddicatedtoCoffee;
	}
	void addicatedToAlcohol(boolean isAddicatedToAlcohol){
		this.isAddicatedToAlcohol=isAddicatedToAlcohol;
	}
	void displaySimplication(){
		System.out.println("Employee Name is "+ empname);
		if(doesPartyOnWeekend){
			System.out.println("Party is weekend " + doesPartyOnWeekend);
		}
		if(isAddicatedToTea){
			System.out.println("Additced to tea " + isAddicatedToTea);
		}
		if(isAddicatedtoCoffee){
			System.out.println("Additced to coffess " + isAddicatedtoCoffee);
		}
		if(isAddicatedToAlcohol){
			System.out.println("Additced to Alcohol " + isAddicatedToAlcohol);
		}
	}

	void employeeName(String empname) {
		this.empname = empname;
	}

	void partOnweekend(boolean doesPartyOnWeekend) {
		this.doesPartyOnWeekend = doesPartyOnWeekend;
	}

	void addicatedToTea(boolean isAddicatedToTea) {
		this.isAddicatedToTea = isAddicatedToTea;
	}

	void addicatedtoCoffee(boolean isAddicatedtoCoffee) {
		this.isAddicatedtoCoffee = isAddicatedtoCoffee;
	}

	void addicatedToAlcohol(boolean isAddicatedToAlcohol) {
		this.isAddicatedToAlcohol = isAddicatedToAlcohol;
	}

	void displaySimplication() {
		System.out.println("Employee Name is " + empname);
		if (doesPartyOnWeekend) {
			System.out.println("Party is weekend " + doesPartyOnWeekend);
		}
		if (isAddicatedToTea) {
			System.out.println("Additced to tea " + isAddicatedToTea);
		}
		if (isAddicatedtoCoffee) {
			System.out.println("Additced to coffess " + isAddicatedtoCoffee);
		}
		if (isAddicatedToAlcohol) {
			System.out.println("Additced to Alcohol " + isAddicatedToAlcohol);
		}
	}

	public static void main(String[] args) {
		ITProfessional ITPro = new ITProfessional();

		ITPro.employeeName("Surbhi");
		ITPro.partOnweekend(true);
		ITPro.addicatedToTea(true);
		ITPro.addicatedtoCoffee(true);
		ITPro.addicatedToAlcohol(true);
		ITPro.displaySimplication();
	}
}