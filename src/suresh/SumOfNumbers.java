package suresh;

public class SumOfNumbers {
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
		System.out.println("Sum of Numberic Values in a String: "+sum);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = "I have 15 years and 2 months of experience.";
		SumOfNumbers digitsinastring = new SumOfNumbers();
		digitsinastring.stringDisplay(data);
	}

}
