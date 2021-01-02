package technoCredits.stringExamples;

public class Example3 {

	static String m1(String input) {
		String temp = "";
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i) <= 90 && input.charAt(i) >= 65) {
				int x = input.charAt(i) + 32;
				temp += (char)(x);
			}else
				temp += input.charAt(i);
		}
		return temp;
	}
	
	public static void main(String[] args) {
		String str1 = "maulik";
		String str2 = "Maulik";
		String str3 = "";
		
		for(int i=0;i<str2.length();i++) {
			if(str2.charAt(i) <= 90 && str2.charAt(i) >= 65) {
				int x = str2.charAt(i) + 32;
				str3 = str3.concat(String.valueOf((char)(x))).intern();
			}else
				str3  = str3.concat(String.valueOf(str2.charAt(i))).intern();
		}
		
		System.out.println(str3);
		System.out.println(str3 == str1);
	}
}
