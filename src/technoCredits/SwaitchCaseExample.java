package technoCredits;

public class SwaitchCaseExample {
		
	static void displayData(char ch) { 
		switch(ch) {
			case 'A':
			case 'a' :
				System.out.println("This is case a");
				break;
			case 'z' :
				System.out.println("This is case z");
				break;
			case 'q' :
				System.out.println("This is case q");
				break;
			default :
				System.out.println("This is default");
				
		}
	}
	
	static void displayNumData(int num) { 
		switch(num) {
			case 1:
				System.out.println("Monday");
			case 2:
				System.out.println("tuesday");
		}
	}
	
	static int balance = 1000;
	static void bankOptions(int choice) {
		switch(choice) {
			case 1:
				System.out.println("Checking your balance");
				if(balance >0)
					System.out.println("Your account is active");
				break;
			case 2:
				System.out.println("Dedict phone bill");
				if(balance >= 1000) {
					balance -= 100;
					System.out.println("now your balance is " + balance);
				}
				break;
		}	
	}
	
	static void start(String browerName) {
		switch(browerName) {
			case "FF":
				System.out.println("Open firefox");
				break;
			default:
				System.out.println("This is default");
				break;
			case "Chrome":
				System.out.println("Open Chrome");
				break;
			case "Safari":
				System.out.println("Open Safari");
				break;
		}
	}
	
	public static void main(String[] args) {
		//displayData('A');
		start("Safari");
		System.out.println("End");
	}
}
