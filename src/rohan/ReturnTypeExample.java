package rohan;

public class ReturnTypeExample {
	String name;
	int addition(int x, int y) {
		return x+y;
	}
	
	String findName(String firstName, String lastName) {
		name = firstName+lastName;
		return name;
	}
	
	static boolean checkFirstName(String name) {
		//ReturnTypeExample rte = new ReturnTypeExample();
		if(name.equalsIgnoreCase(name))
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		ReturnTypeExample rte = new ReturnTypeExample();
		int sum = rte.addition(10, 20);
		System.out.println("Addition of 2 numbers is:"+sum);
		String fullName = rte.findName("Rohan", "Mahadik");
		System.out.println("Full Name is:"+fullName);
		boolean flag = checkFirstName("RohanMahadik");
		if(flag)
			System.out.println("First Name matches");
		else
			System.out.println("First Name does not match");
	}
}

