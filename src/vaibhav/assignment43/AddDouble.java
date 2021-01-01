package vaibhav.assignment43;

/*Assignment : 43 [23rd Dec'2020]

WAP to sum numbers from below String

input: I have 5.6 years of exp in automation and 2.3 in manual testing
output: 7.9

hint: Double's parse method
use exception handling*/


public class AddDouble {
	
	private static void printSum(String str) throws NullPointerException,NumberFormatException {
		String [] split = str.split(" ");
		double sum = 0.0;
		for (int i = 0 ; i<split.length;i++) {
			char temp = split[i].charAt(0);			
			if(!Character.isLetter(temp)) {	
				sum += Double.parseDouble(split[i]);
			}
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		
		//String str = "hi 18L"; //for number format exception
		//String str = null; //null pointer exception
		String str = "I have 5.6 years of exp in automation and 2.3 in manual testing";
		
		try {
			AddDouble.printSum(str);
		}catch( NullPointerException ne) {
			System.out.println("Given String is null");
		}
		catch( NumberFormatException np) {
			System.out.println("No double present in the given string");
		}

	}
}
