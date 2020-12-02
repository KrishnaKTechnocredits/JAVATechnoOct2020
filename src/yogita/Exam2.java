/* Exam 2 : WAP for below given requirement. [30][45]
input : teCh@N12JCR#iT8s_B
output : letters -> 12
         uppercase -> 7
         lowercase -> 5
         digit -> 3
         special char -> 3  

*/

package yogita;

class Exam2 {

	int digiCnt, lowerCnt, upperCnt, letterCnt, specialCnt;

	void display(String arr) {

		for (int index = 0; index < arr.length(); index++) {
			char ch = arr.charAt(index);

			if (Character.isDigit(ch))
				digiCnt++;

			if (Character.isLetter(ch))
				letterCnt++;

			if (Character.isLowerCase(ch))
				lowerCnt++;

			if (Character.isUpperCase(ch))

				upperCnt++;

			if (!Character.isLetter(ch) && !Character.isDigit(ch))
				specialCnt++;

		}

		System.out.println("String Is :" + arr);
		System.out.println(digiCnt + " digits in the word " + arr);
		System.out.println(letterCnt + " letters in the word " + arr);
		System.out.println(lowerCnt + " lower case letters in the word " + arr);
		System.out.println(upperCnt + " upper case letters in the word " + arr);
		System.out.println(specialCnt + " Special Character in the word " + arr);
	}

	public static void main(String[] args) {
		Exam2 exam = new Exam2();
		String name = ("teCh@N12JCR#T8s_B");
		exam.display(name);
	}
}