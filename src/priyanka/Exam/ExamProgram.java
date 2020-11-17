package priyanka.Exam;

/*Coding Exam 1: 8th Nov'2020 
1) print name having maximum length and print its length also.
Add Adv : if you can scanner class.
String[] name = {"Harsh","maulik","Technocredits","Krishna"};
output : Technocredits -> 13

	String getMaxLengthName(String[] arr){
	{
		return name;
	}

2) display method to print all even charcter of the name having maximum length.
   void display(String name){
   
   }*/

public class ExamProgram {

	void display(String[] names) {

		for (int index = 0; index < names.length; index++) {
			System.out.print(names[index] + " ");
		}

	}

	static String maxLength(String[] names) {

		String maxlength = names[0];
		for (int index = 0; index < names.length; index++) {
			if (names[index].length() > maxlength.length())
				maxlength = names[index];
		}
		System.out.println("The Maximum name length is : " + maxlength.length());
		return maxlength;
	}

	void evenCharFromMaxLenght(String name) {

		System.out.print("Even char from Maximum length name is : ");
		for (int index = 0; index < name.length(); index++) {
			if (index % 2 != 0)
				System.out.print(name.charAt(index));
		}
	}

	public static void main(String[] a) {
		ExamProgram examProgram = new ExamProgram();
		String[] names = { "Rama", "Sayali", "Priyanka", "Tiya", "Technocredit" };
		examProgram.display(names);
		System.out.println(" ");
		System.out.println("****************************************************************** ");
		String max = examProgram.maxLength(names);
		System.out.println("The Maximum length name is: " + max);
		examProgram.evenCharFromMaxLenght(max);
	}

}
