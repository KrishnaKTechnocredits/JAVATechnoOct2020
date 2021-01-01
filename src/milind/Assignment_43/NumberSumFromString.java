package milind.Assignment_43;

public class NumberSumFromString {
	
	public void sumOfNumFromString(String input) {
		String[] sorted = input.split(" ");
		double sum = 0;
		for(int index = 0; index < sorted.length; index++) {
			char ch = sorted[index].charAt(0);
			if(Character.isDigit(ch)) {
				double num = Double.parseDouble(sorted[index]);
				sum = sum + num;
			}
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		String input = "I have 5.6 years of exp in automation and 2.3 in manual testing";
		NumberSumFromString numberSumFromString = new NumberSumFromString();
		numberSumFromString.sumOfNumFromString(input);
	}

}
