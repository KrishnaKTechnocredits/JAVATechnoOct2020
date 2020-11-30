package anjaliS;

public class PrintWordWithoutDigit {
	void DisplayWord(String arr[]) {
		for (int index = 0; index < arr.length; index++) {
			String word = arr[index];
			boolean flag = true;
			for (int index1 = 0; index1 < word.length(); index1++) {
				if (Character.isDigit(word.charAt(index1))) {
					flag = false;
					break;
				}
			}
			if (flag)
				System.out.print("Word without digit in array is-> " + word);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String array[] = { "Masgj3Pw", "r4fsjk", "techno", "sfjk44lk" };
		PrintWordWithoutDigit printwordwithoutdigit = new PrintWordWithoutDigit();
		printwordwithoutdigit.DisplayWord(array);
	}

}
