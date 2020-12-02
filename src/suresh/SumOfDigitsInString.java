package suresh;
/*program 1: sum of all digits from a given string  
input: te1ch9kj8 
output:= 18*/
public class SumOfDigitsInString {
	
	String digit = "";
	void stringDisplay(String data) {
		for (int index = 0; index < data.length(); index++) {
			char ch = data.charAt(index);
			if (Character.isDigit(ch))
				digit += ch;
				
		}
		int x = Integer.parseInt(digit);
			String number = String.valueOf(x);
		int sum = 0;
		for(int i = 0; i < number.length(); i++) {
			
		    int j = Character.digit(number.charAt(i), 10);
		    sum = sum + j;
		   }
		System.out.println(sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = "te1ch9kj8";
		
		SumOfDigitsInString digitsinastring = new SumOfDigitsInString();
		digitsinastring.stringDisplay(data);
	}

}
