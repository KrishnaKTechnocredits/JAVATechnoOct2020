/*
 Coding Exam 1: 8th Nov'2020
1) print name having maximum length and print its length also.
Add Adv : if you can scanner class.
String[] name = {"Harsh","maulik","Technocredits","Krishna"};
output : Technocredits -> 13

String getMaxLengthName(String[] arr){
{
return name;
}

2) display method to print all even character of the name having maximum length.
void display(String name){

}
 */
package ritika.exams;

public class Exam1 {

	String getMaxLengthName(String[] arr) {
		String nameMax = null;
		int lengthMax = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].length() > lengthMax)
				nameMax = arr[i];
			lengthMax = nameMax.length();
		}
		System.out.println("Name of Max Length is: " + nameMax + " and its length is: " + lengthMax);
		return nameMax;
	}

	void display(String name) {
		System.out.println("Printing all even characters of Name of max length ");
		int i = 1;
		while (i <name.length()) {
			System.out.print(name.charAt(i));
			i = i + 2;
		}
	}

	public static void main(String[] args) {

		String[] name = { "Harsh", "Maulik", "Technocredits", "Krishna" };
		Exam1 exam1 = new Exam1();
		String nameOfMaxLength = exam1.getMaxLengthName(name);
		exam1.display(nameOfMaxLength);

	}
}
