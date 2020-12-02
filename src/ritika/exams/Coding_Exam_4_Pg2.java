package ritika.exams;

/*Coding Exam 4

Program 2: WAP to find two String are idential or not

input 1:
String s1 = "technoCredits";
String s2 = "teChnoCreditS";

output 1: both string are not idential

input 2:
String s1 = "pune";
String s2 = "pune";

output 2: both string are idential
*/
public class Coding_Exam_4_Pg2 {

	static void findIfTwoStringsIdentical(String s1, String s2) {
		System.out.println("Input--> s1: " + s1 + " and s2:" + s2);
		if (s1.compareTo(s2) == 0)
			System.out.println("Output --> Both strings are idential");
		else
			System.out.println("Output --> Both strings are not identical");
	}

	public static void main(String[] args) {
		Coding_Exam_4_Pg2.findIfTwoStringsIdentical("technoCredits", "teChnoCreditS");
		System.out.println("===================================================");
		Coding_Exam_4_Pg2.findIfTwoStringsIdentical("pune", "pune");
	}
}
