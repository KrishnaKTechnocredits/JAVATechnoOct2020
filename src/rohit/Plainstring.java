package rohit;

/*Program 1: print all the words which does't have any digit.
String[] input = {"Masgj3Pw", "r4fsjk","techno","sfjk44lk"};
output : techno*/
public class Plainstring {

	void findplainstring(String[] str) {
		for (int i = 0; i < str.length; i++) {
			String str1 = str[i];
			boolean flag = false;
			for (int j = 0; j < str1.length(); j++) {
				if (Character.isDigit(str1.charAt(j))) {
					flag = true;
					break;
				}
			}
			if (!flag)
				System.out.println("Word which does't have any digit- " + str1);
		}
	}

	public static void main(String[] args) {
		String str[] = { "Masgj3Pw", "r4fsjk", "techno", "sfjk44lk" };
		new Plainstring().findplainstring(str);
	}
}