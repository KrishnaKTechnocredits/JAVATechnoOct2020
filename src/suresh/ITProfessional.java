package suresh;

public class ITProfessional {
	
	String ename;
	boolean party;
	boolean tea;
	boolean Coffee;
	boolean alcohol;
	
	void empName(String ename){
		this.ename = ename;		
	}
	void doesPartyOnWeekend(boolean party){
		this.party = party;
	}
	void isAddictedToTea(boolean tea){
		this.tea = tea;	}
	void isAddictedToCoffee(boolean Coffee){
		this.Coffee = Coffee;
	}
	void isAddictedToAlcohol(boolean alcohol){
		this.alcohol = alcohol;
	}
	void displayInformation(){
		System.out.println("IT Employee Details");
		System.out.println("IT Professinal Name is :" + ename);
		if(party) {
			System.out.println(ename +" Party on weekend");
		}
		else {
			
			System.out.println(ename +" Doesnt Party on weekend");
		}
		if(tea) {
			System.out.println(ename +"  is a Tea Addictive");
		}
		else {
			
			System.out.println(ename +" is not a Tea Addictive");
		}
		if(Coffee) {
			System.out.println(ename +"  is a Coffee Addictive");
		}
		else {
			
			System.out.println(ename +" is not a Coffee Addictive");
		}
		if(alcohol) {
			System.out.println(ename +"  is a alcohol Addictive");
		}
		else {
			
			System.out.println(ename +" is not a alcohol Addictive");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ITProfessional itprofessional = new ITProfessional();
		itprofessional.empName("Suresh");
		itprofessional.doesPartyOnWeekend(true);
		itprofessional.isAddictedToTea(true);
		itprofessional.isAddictedToCoffee(true);
		itprofessional.isAddictedToAlcohol(true);
		itprofessional.displayInformation();
	}

}
