/*Program 1:  return true if UpperCase characters count are more than lowercase else return false.
input : TechnoCrediTS
output : false
*/
package suvela.assign32;

public class UpperCaseCount {
	boolean getCount(String word) {
		int Ucount = 0;
		int Lcount = 0;
		for (int index = 0; index < word.length(); index++) {
			char ch = word.charAt(index);
			if (ch >= 65 && ch <= 90)
				Ucount++;
			else if (ch >= 97 && ch <= 122)
				Lcount++;
		}
		System.out.println("Uppercase count:"+Ucount);
		System.out.println("Lowercase count:"+Lcount);
		System.out.println("Returning false if value of Uppercase count is lower than Lowercse value else return true");
		System.out.println("Returned ans is:");
		if (Ucount > Lcount)
			return true;
		return false;
	}

	public static void main(String[] args) {
		String word = "TechnoCrediTS";
		UpperCaseCount count = new UpperCaseCount();
		boolean count1 = count.getCount(word);
		System.out.println(count1);
	}

}
