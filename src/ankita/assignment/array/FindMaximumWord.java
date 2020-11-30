/*
 * 1) print name having maximum length and print its length also.
Add Adv : if you can scanner class.
String[] name = {"Harsh","maulik","Technocredits","Krishna"};
output : Technocredits -> 13

	String getMaxLengthName(String[] arr){
	{
		return name;
	}

2) display method to print all even charcter of the name having maximum length.
   void display(String name){
   
   }
 */
package ankita.assignment.array;

public class FindMaximumWord {
	String findMaxWord(String[] arr) {
		String maxWord=arr[0];
		for(int index=1;index<arr.length;index++) {
			if(maxWord.length()<arr[index].length()) {
				maxWord=arr[index];
			}
		}
		return maxWord;
	}
	void displayEvenCharacter(String name) {
		System.out.print("Even character of name having maximum length:");
		for(int i =0;i<name.length();i++) {
			if(i%2!=0)
				System.out.print(name.charAt(i));
		}
	}
	public static void main(String[] args) {
		FindMaximumWord findMaximumWord=new FindMaximumWord();
		String[] name= {"Harsh","maulik","Technocredits","Krishna"};
		String maximumWord= findMaximumWord.findMaxWord(name);
		System.out.println("Name having maximum length :" + maximumWord);
		findMaximumWord.displayEvenCharacter(maximumWord);
	}
}