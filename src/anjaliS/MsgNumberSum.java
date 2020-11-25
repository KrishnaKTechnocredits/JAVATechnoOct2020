package anjaliS;

public class MsgNumberSum {
	void messageNumSum(String msg) {
		System.out.println("Message: " + msg);
		int sum = 0;
		String dig = "";
		for (int index = 0; index < msg.length(); index++) {
			char ch = msg.charAt(index);
			if (Character.isDigit(ch)) {
				dig = dig + ch;
			} else if (dig.length() > 0) {
				sum += Integer.parseInt(dig);
				System.out.println("Number is : " + dig);
				dig = "";
			}
		}
		if (dig.length() > 0) {
			sum += Integer.parseInt(dig);
		}
		System.out.println("Sum of numbers is " + sum);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MsgNumberSum msgnumbersum = new MsgNumberSum();
		msgnumbersum.messageNumSum("I have 15 years and 2 months of experience");

	}

}
