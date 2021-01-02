package technoCredits.oops.overriding;

public class RaghavD {
	void printWordwithoutDigit(String[] st) {
		int count;
		boolean flag = false;
		System.out.println("Words without digit is: ");
		for (int index = 0; index < st.length; index++) {
			String word = st[index];
			count = 0;
			flag = false;
			
			for (int inner = 0; inner < word.length(); inner++) {
				char ch = word.charAt(inner);
				if (Character.isDigit(ch)) {
					//count++;
					flag = true;
					break;
				}
			}
			if (!flag)
				System.out.println(st[index] + " ");
		}
	}

	public static void main(String[] args) {
		RaghavD printWords = new RaghavD();
		String[] input = { "Masgj3Pw", "r4fsjk", "techno", "sfjk44lk" };
		printWords.printWordwithoutDigit(input);
		String[] input1 = { "Masgj3Pw", "r4fsjk", "techno", "sfjkk", "asx%%" };
		printWords.printWordwithoutDigit(input1);
	}
}
