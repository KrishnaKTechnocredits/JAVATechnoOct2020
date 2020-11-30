package nitin;
/* Assignment 18 - Program : 1 - 
max repeating word with its freq.
input : Hi Hello Hi Techno Hello Hi
output : Hi -> 3 */

public class MaxWordFrequency {
	int maxCount=0;
	String maxFrequencyWord=null;
	void maxCountOfWords(String inputArr) {
		System.out.println("Sentence : "+inputArr);
		String[] arr=inputArr.split(" ");
		for(int index=0;index<arr.length;index++) {
			int count =0;
			String word=arr[index];
			for(int inner=0;inner<arr.length;inner++){
				if(word.equals(arr[inner]) && index==word.indexOf(word))
					count++;
				if(maxCount<count) {
					maxCount=count;
					maxFrequencyWord=word;
				}
			}
		}
		System.out.println("'"+maxFrequencyWord+"'"+" : This word is coming maximum time -> "+maxCount+" times, in the above Sentence.");
	}
	public static void main(String[] args) {
		String word= ("Hi Hello Hi Techno Hello Hi");
		new MaxWordFrequency().maxCountOfWords(word);
	}
}
