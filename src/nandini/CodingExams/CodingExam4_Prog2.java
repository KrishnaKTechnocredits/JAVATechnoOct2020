package nandini.CodingExams;
//WAP to find two String are identical or not
public class CodingExam4_Prog2 {
	
	void notIdenticalStrings(String str1, String str2) {
				if((str1.equals(str2)))
					 System.out.println("Strings are Identical");
				else
					System.out.println("String are not identical");
			}
		
	void identicalStrings(String inputStr, String inputstr1) {
		if((inputStr.equals(inputstr1)))
			 System.out.println("Strings are Identical");
		else
			System.out.println("String are not identical");	
	}
	
	public static void main(String args[]) {
		CodingExam4_Prog2 codingE4Prog2 = new CodingExam4_Prog2();
		String s1 = "technoCredits";
		String s2 = "teChnoCreditS";
		codingE4Prog2.notIdenticalStrings(s1, s2);
		String input1 = "pune";
		String input2 = "pune";
		codingE4Prog2.identicalStrings(input1, input2);
		

	}

}
