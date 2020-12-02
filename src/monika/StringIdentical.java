
package monika;
//import java.util.Arrays;

/*Program 2: WAP to find two String are identical or not

input 1: 
String s1 = "technoCredits";
String s2 = "teChnoCreditS";

output 1: both string are not identical

input 2:
String s1 = "pune";
String s2 = "pune";

output 2: both string are identical

*/

class StringIdentical {

	void findIdenticalArray(String str1, String str2) {

		System.out.println("input 1 :" + str1);
		System.out.println("input 2 :" + str2);

		boolean flag = false;
		if (str1.length() == str2.length()) {
			for (int i = 0; i < str1.length(); i++) {
				if (str1.charAt(i) != str2.charAt(i)) {
					flag = true;
					break;
				}
			}

			if (flag)
				System.out.println("String Are Not Identical:Mismatch Contents");

			else

				System.out.println("String Are Identical:Length and also Contents Matches");

		} else
			System.out.println("Strings Are not identical: Mismatch Length");

	}

	public static void main(String[] args) {
		StringIdentical stringidentical = new StringIdentical();
		//int[] array1 = { 10, 12, 55, 32, 17 };
		//int[] array2 = { 10, 12, 55, 32, 17 };
		//int[] array1  = [1, 2, 5, 5, 8, 9, 7, 10]
                String str1 ="technoCredits";
                String str2 ="teChnoCredits";
                stringidentical.findIdenticalArray(str1,str2);
               // String s3 ="Pune";
                //String s4 ="Pune";
                //StringIdentical.findIdenticalArray(s3,s4);
                

        //int[] array2  = [1, 0, 6, 15, 6, 4, 7, 0]
		//arrayidentical.findIdenticalArray(array1, array2);

	}
} 
