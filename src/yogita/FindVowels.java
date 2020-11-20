
//Java Program to Count the Number of Vowels in user defined string.

package yogita;

public class FindVowels {

	static int aCnt, eCnt, iCnt, oCnt, uCnt = 0;

	void chekcingVowels(String name) {
		System.out.println("String is:" + name);
		for (int index = 0; index < name.length(); index++) {
			char ch = name.charAt(index);
			switch (ch) {
			case 'a':
			case 'A':
				aCnt++;
				System.out.println(ch);
				break;
			case 'e':
			case 'E':
				eCnt++;
				System.out.println(ch);
				break;
			case 'i':
				iCnt++;
				System.out.println(ch);
				break;
			case 'o':
			case 'O':
				oCnt++;
				System.out.println(ch);
				break;
			case 'u':
			case 'U':
				uCnt++;
				System.out.println(ch);
			}
		}
	}

	public static void main(String[] args) {
		FindVowels vowels = new FindVowels();
		vowels.chekcingVowels("tEchnoOCrediits");
		if (aCnt == 0 && eCnt == 0 && iCnt == 0 && oCnt == 0 && uCnt == 0)
			System.out.println("No vowels are present in given String");
		else {
			int totalCnt = aCnt + eCnt + iCnt + oCnt + uCnt;
			System.out.println("Total Vowels are:" + totalCnt);
		}
	}
}
