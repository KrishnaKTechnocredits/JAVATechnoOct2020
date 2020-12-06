/*Program 1: verify string is palindrom or not.  
input : naman
output : naman is a palindrom string.
input : techno
output : techno is not a palindrom string.
*/
package ankita.assignment.string;

public class PalindromString {
	void checkPalindrom1(String str) {
		System.out.println("==Method 1==");
		String str1 = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			str1 = str1 + str.charAt(i);
		}
		if (str1.equals(str))
			System.out.println(str + " is Palidrom");
		else
			System.out.println(str + " is not Palidrom");
	}

	void checkPalindrom2(String str) {
		System.out.println("==Method 2==");
		boolean flag = true;
		for (int i = 0, j = str.length() - 1; j > i; i++, j--) {
			if (str.charAt(i) != str.charAt(j)) {
				flag = false;
				break;
			}
		}
		if (flag)
			System.out.println(str + " is palindrom");
		else
			System.out.println(str + " is not palindrom");
	}

	void checkPalindrom3(String str) {
		System.out.println("==Method 3==");
		System.out.println("By Ignoring cases..");
		char ch1 = ' ';
		char ch2 = ' ';
		boolean flag = true;
		for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
			if (Character.toUpperCase(str.charAt(i)) != Character.toUpperCase(str.charAt(j))) {
				flag = false;
				break;
			}
		}
		if (flag)
			System.out.println(str + " is palindrom");
		else
			System.out.println(str + " is not palindrom");

	}

	void checkPalindrom4(String str) {
		System.out.println("==Method 4==");
		System.out.println("By Ignoring cases..");
		String str1 = str.toUpperCase();
		boolean flag = true;
		for (int i = 0, j = str1.length() - 1; i < j; i++, j--) {
			if (str1.charAt(i) != str1.charAt(j)) {
				flag = false;
				break;
			}
		}
		if (flag)
			System.out.println(str + " is palindrom");
		else
			System.out.println(str + " is not palindrom");

	}

	void checkPalindrom5(String str) {
		System.out.println("==Method 5==");
		System.out.println("Without using inbuilt function & ignoring cases");

		String temp = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 97 && str.charAt(i) <= 122) {
				temp = temp + (char) (str.charAt(i) - 32);
			} else
				temp = temp + str.charAt(i);
		}
		boolean flag = true;
		for (int i = 0, j = temp.length() - 1; i < j; i++, j--) {
			if (temp.charAt(i) != temp.charAt(j)) {
				flag = false;
				break;
			}
		}
		if (flag)
			System.out.println(str + " is palindrom");
		else
			System.out.println(str + " is not palindrom");
	}

	void checkPalindrom6(String str) {
		System.out.println("==Method 6==");
		System.out.println("Without using inbuilt function & ignoring cases");
		boolean flag = true;
		for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
			if (str.charAt(j) >= 97 && str.charAt(j) <= 122) {
				if (!((str.charAt(i) == str.charAt(j)) || (str.charAt(i) == (char) (str.charAt(j) - 32)))) {
					flag = false;
					break;
				}
			} else {
				if (!((str.charAt(i) == str.charAt(j)) || (str.charAt(i) == (char) (str.charAt(j) + 32)))) {
					flag = false;
					break;
				}
			}
		}
		if (flag)
			System.out.println(str + " is palindrom");
		else
			System.out.println(str + " is not palindrom");
	}

	public static void main(String[] args) {
		PalindromString palindromString = new PalindromString();

		palindromString.checkPalindrom1("naman");
		palindromString.checkPalindrom1("Naman");
		palindromString.checkPalindrom1("techno");

		palindromString.checkPalindrom2("naman");
		palindromString.checkPalindrom2("techno");

		palindromString.checkPalindrom3("Naman");
		palindromString.checkPalindrom3("techno");

		palindromString.checkPalindrom4("Naman");
		palindromString.checkPalindrom4("techno");

		palindromString.checkPalindrom5("Naman");
		palindromString.checkPalindrom5("techno");

		palindromString.checkPalindrom6("Naman");
		palindromString.checkPalindrom6("techno");

	}
}