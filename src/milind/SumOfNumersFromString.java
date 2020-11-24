package milind;

public class SumOfNumersFromString {
	
	void numberSum(String input) {
		int numberSum = 0;
		String str = "";
		for(int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if(Character.isDigit(ch)) {
					str = str + input.charAt(index);
			}else if(Character.isLetter(ch)){
				if(str.length() > 0 ) {
				numberSum = numberSum + Integer.parseInt(str);
				str = "";
				}
			}
		}
		if(str.length() > 0 ) {
			numberSum = numberSum + Integer.parseInt(str);
			str = "";
		}
		System.out.println("Number sum from String : " + numberSum);
	}
	
	public static void main(String[] args) {
		String input = "te123ch9kj8";
		SumOfNumersFromString sumOfNumersFromString = new SumOfNumersFromString();
		sumOfNumersFromString.numberSum(input);
	}

}
