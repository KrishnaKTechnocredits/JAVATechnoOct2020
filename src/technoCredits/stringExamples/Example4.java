package technoCredits.stringExamples;

public class Example4 {
	public static void main(String[] args) {
		String str1 = "maulik kanani";
		String str2 = "maulik";
		
		String str3 = str1.substring(0,6);
		System.out.println(str2 == str3); // false
	}
}
