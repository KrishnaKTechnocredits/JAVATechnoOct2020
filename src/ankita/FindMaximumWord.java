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
package ankita;

public class FindMaximumWord {
	String findMaxWord(String[] arr) {
		int max =0;
		String maxWord=arr[0];
		for(int index=0;index<arr.length;index++) {
			String name = arr[index];
			int cnt=0;
			for(int i =0;i<name.length();i++) {
				cnt = cnt +1;
			}
			if(max<cnt) {
				max=cnt;
				maxWord=arr[index];
			}
		}
		return maxWord;
	}
	void displayEvenCharacter(String name) {
		for(int i =0;i<name.length();i++) {
			if(i%2!=0)
				System.out.print(name.charAt(i));
		}
	}
	public static void main(String[] args) {
		FindMaximumWord findMaximumWord=new FindMaximumWord();
		String[] name= {"Harsh","maulik","Technocredits","Krishna"};
		String maximumWord= findMaximumWord.findMaxWord(name);
		System.out.println("Maximum word :" + maximumWord);
		findMaximumWord.displayEvenCharacter(maximumWord);
	}
}
