package technoCredits.oops.overriding;

public class Manager {
	int managerId = 10;
	String managerName = "Techno";
	
	public String toString() {
		return "Maulik";
	}
	
	public static void main(String[] args) {
		Manager mng = new Manager();
		System.out.println(mng);
		
		Manager mng1 = new Manager();
		mng1.managerId = 2;
		mng1.managerName = "Apurva";
		
		System.out.println(mng1);
	}
}
