package technoCredits.stringExamples;

public class Example5 {

	public static void main(String[] args) {
		String str1 = "Maulik Kanani";
		String str2 = "Aashvi Maulik Kanani";
		String str3 = str2.replace("Aashvi ", "");
		
		System.out.println(str3); // Maulik Kanani
		System.out.println(str1 == str3);
	}
}
