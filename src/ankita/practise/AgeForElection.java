package ankita.practise;

public class AgeForElection {
	
	void findPeopleEligibleForElection(String name,int age) {
		if(age>=18)
			System.out.println(name+" is Eligible to vote");
		else 
			System.out.println(name+" is not Eligible to vote");
	}
	public static void main(String [] args) {
		AgeForElection  ageForElection = new AgeForElection();
		ageForElection.findPeopleEligibleForElection("Ankita", 10);
	}
}
