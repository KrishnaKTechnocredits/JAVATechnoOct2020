package sadhana;

//Coding exam_4

public class IdenticalNotIdenticalArray {

	void printData(String msg1, String msg2) {
		boolean flag = false;
		if (msg1.length() == msg2.length()) {
			for (int i = 0; i < msg1.length(); i++) {
				if (msg1.charAt(i) != msg2.charAt(i))
					flag = true;
			}
			if (!flag)
				System.out.println("Given String is identical");
			else
				System.out.println("Given String is not identical");
		} else
			System.out.println("String not found");
	}

	public static void main(String[] args) {
		IdenticalNotIdenticalArray identicalNotIdenticalArray = new IdenticalNotIdenticalArray();
		String str1 = "technoCredits";
		String str2 = "teChnoCreditS";
		String str3 = "Pune";
		String str4 = "Pune";
		identicalNotIdenticalArray.printData(str1, str2);
		identicalNotIdenticalArray.printData(str3, str4);

	}

}
