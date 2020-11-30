package Himali_Assignment24;

public class Program2 {
	void getNumberSum(String a) {
		String s = "";
		int sum = 0;
		for (int i = 0; i < a.length(); i++) {
			char ch = a.charAt(i);

			if (Character.isDigit(ch)) {
				s = s + ch;

			} else if (s.isEmpty()) {
				continue;

			} else {
				sum = sum + Integer.parseInt(s);
				s = "";
			}

		}
		int sum1 = Integer.parseInt(s);
		int res = sum + sum1;
		System.out.println("total " + sum);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program2 program2 = new Program2();
		program2.getNumberSum("Ni12yt334y6");

	}

}
