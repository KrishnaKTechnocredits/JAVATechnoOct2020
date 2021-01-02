package technoCredits.collectionDemo;

public class StringComparision {
	// A-Z --> 65 - 90
	// a-z --> 97 - 122
	// 0-9 --> 48 - 57
	
	public static void main(String[] args) {
		String str1 = "apple";
		String str2 = "apple";
		
		int temp = str1.compareTo(str2);
		System.out.println(temp);
	}
}
