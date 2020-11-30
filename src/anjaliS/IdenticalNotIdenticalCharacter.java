package anjaliS;

public class IdenticalNotIdenticalCharacter {
	void displayCharacter(String word1, String word2) {
		boolean flag = false;
		if (word1.length() == word2.length()) {
			for (int i = 0; i < word1.length(); i++) {
				if (word1.charAt(i) != word2.charAt(i))
					flag = true;
			}
			if (!flag)
				System.out.println("String is identical");
			else
				System.out.println("String is Not identical");
		} else
			System.out.println("String is Not identical");
	}

	public static void main(String[] args) {
		String s1 = "Pune";
		String s2 = "Pune";
		String s3 = "technoCredits";
		String s4 = "teChnoCreditS";

		IdenticalNotIdenticalCharacter identicalnotidenticalcharacter = new IdenticalNotIdenticalCharacter();
		identicalnotidenticalcharacter.displayCharacter(s1, s2);
		identicalnotidenticalcharacter.displayCharacter(s3, s4);

	}

}
