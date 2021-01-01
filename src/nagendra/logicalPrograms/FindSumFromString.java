package nagendra.logicalPrograms;

/*
WAP to sum numbers from below String
input: I have 5.6 years of exp in automation and 2.3 in manual testing
output: 7.9
*/

public class FindSumFromString {

	void getTotalSum(String input) {
		String[] temp = input.split(" ");
		float number = 0;

		
			for (int index = 0; index < temp.length; index++) {
				String a = temp[index];
				try{if (Character.isDigit(a.charAt(0))) {
					number += Double.parseDouble(a);
				}}catch(NumberFormatException ne){
					System.out.println("Number format exception");
				}
			}
		
		System.out.println("Output is :" + number);
	}

	public static void main(String[] args) {
		FindSumFromString object = new FindSumFromString();
		String input = "5.6 d 2.3";
		object.getTotalSum(input);
	}
}
