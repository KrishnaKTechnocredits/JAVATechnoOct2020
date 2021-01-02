package technoCredits.exception;

public class Pub {
	void validateEntry(int age) throws AgeNotValidException{
		if(age < 18)
			throw new AgeNotValidException("User age is " + age + ", as per policy age should be >= 18");
		System.out.println("Welcome");
	}
	
	public static void main(String[] args) {
		try {
			new Pub().validateEntry(17);
		} catch (AgeNotValidException e) {
			System.out.println(e.getMessage());
		}
	}
}
