package suresh;
/*return true if UpperCase characters count are more than lowercase else return false.
input : TechnoCrediTS
output : false
*/
public class UppercharCheckwithLowerCase {
	String lowerCase = "", upperCase = "";
	int count = 1;
	int sum = 0;

	void uppercheck(String data) {
		for (int index = 0; index < data.length(); index++) {
			char ch = data.charAt(index);

			if (Character.isLowerCase(ch)) {
				lowerCase += ch;
				sum = index++;

			} else if (Character.isUpperCase(ch)) {
				upperCase += ch;
				count++;
			}

		} /*
			 * System.out.println("Upper case:" + count); System.out.println("Lower case:" +
			 * sum);
			 */
		if (sum > count) {
			System.out.println("False");
			
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = "TechnoCrediTS";
		UppercharCheckwithLowerCase uppercheckwithlowercheck = new UppercharCheckwithLowerCase();
		uppercheckwithlowercheck.uppercheck(data);
	}

}
