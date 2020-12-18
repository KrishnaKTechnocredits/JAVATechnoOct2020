/*Program 1: return true if UpperCase characters count are more than lowercase else return false.
input : TechnoCrediTS
output : false

*/
package ankita.assignment.string;

public class CaseCount {
	boolean isUppecaseCntMax(String str) {
		int upperCnt = 0;
		int lowerCnt = 0;
		System.out.println("Input :" + str);
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
				upperCnt++;
			} else if (str.charAt(i) >= 97 && str.charAt(i) <= 122) {
				lowerCnt++;
			}
		}

		if (upperCnt > lowerCnt)
			return true;
		else
			return false;

	}

	public static void main(String[] args) {
		CaseCount caseCount = new CaseCount();
		System.out.println(
				"Uppercase letters greater than lower case letters ? " + caseCount.isUppecaseCntMax("TechnoCrediTS"));
		System.out.println(
				"Uppercase letters greater than lower case letters ? " + caseCount.isUppecaseCntMax("TECHNnoCrediTS"));
	}
}
