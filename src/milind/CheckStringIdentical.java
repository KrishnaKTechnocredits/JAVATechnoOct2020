package milind;

public class CheckStringIdentical {
	
	void getIdenticalString(String input1, String input2){
		if(input1.length() == input2.length()) {
			boolean flag = true;
			for(int index = 0; index < input1.length(); index++) {
				char ch1 = input1.charAt(index);
				char ch2 = input2.charAt(index);
				if(ch1 != ch2) {
					System.out.println("Both strings " + input1 + " & " + input2 + " are not identical");
					flag = false;
					break;
				}
			}
			if(flag) {
				System.out.println("Both strings " + input1 + " & " + input2 + " are identical");
			}
		}else {
			System.out.println("Both strings " + input1 + " & " + input2 + " are not identical");
		}
	}
	
	public static void main(String[] args) {
		String s1 = "technoCredits";
		String s2 = "teChnoCreditS";
		String s3 = "pune";
		String s4 = "pune";
		String s5 = "Milind";
		String s6 = "Bhairavi";
		CheckStringIdentical checkStringIdentical = new CheckStringIdentical();
		checkStringIdentical.getIdenticalString(s1, s2);
		checkStringIdentical.getIdenticalString(s3, s4);
		checkStringIdentical.getIdenticalString(s5, s6);
	}

}
