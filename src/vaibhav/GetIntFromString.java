package vaibhav;

public class GetIntFromString {
	
	public static void getInt(String[] splittedString) {
		int sum = 0;
		for (int index = 0 ; index < splittedString.length; index++) {
			String temp = splittedString[index];
			for(int innerIndex = 0 ;innerIndex < temp.length();innerIndex++) {
				if(Character.isDigit(temp.charAt(innerIndex))) {
					sum += Integer.parseInt(temp);
					break;
				}
			}			
		}
		System.out.println("Sum of numbers from given String "+sum);		
	}	

	public static void main(String[] args) {
		String given = "I have 150 years and 2 months of experience";
		String [] splittedString = given.split(" ");
		GetIntFromString.getInt(splittedString);
	}	
}
