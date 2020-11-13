package ankita;

public class CalculateCharacterExam2 {
	public static void main(String[] args) {
		String str = "teCh@N12JCR#iT8s_B";
		int ltrCnt = 0, upperCaseCnt = 0, lowerCaseCnt = 0, digitCnt = 0, specialCharCnt = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isLetter(str.charAt(i))) {
				ltrCnt++;
			}
			if (Character.isUpperCase(str.charAt(i))) {
				upperCaseCnt++;
			}
			if (Character.isLowerCase(str.charAt(i))) {
				lowerCaseCnt++;
			}
			if (Character.isDigit(str.charAt(i))) {
				digitCnt++;
			}
			if (!Character.isLetter(str.charAt(i)) && !Character.isDigit(str.charAt(i))) {
				specialCharCnt++;
			}
		}
		System.out.println("letters : " + ltrCnt);
		System.out.println("uppercase letter : " + upperCaseCnt);
		System.out.println("lowercase letters : " + lowerCaseCnt);
		System.out.println("digit : " + digitCnt);
		System.out.println("special char : " + specialCharCnt);

	}
}