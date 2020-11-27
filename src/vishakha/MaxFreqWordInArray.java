/*Program : 1
max repeating word with its freq.
input : Hi Hello Hi Techno Hello Hi
output : Hi -> 3*/

package vishakha;

public class MaxFreqWordInArray {

	void maxRepeatinWord(){
		String[] arr = {"Hi", "Hello", "Hi", "Techno", "Hi"};
		int max=0, count=1;
		String word =null;
		for(int i=0; i<arr.length; i++){
			max = 0;
			for(int j=i+1; j<arr.length; j++){
				if(arr[i].equals(arr[j])){
					count++;
					arr[j].replace(arr[j], "");				
				}					
			}
			if(max < count){
				max = count;
				word = arr[i];
			}
		}
		System.out.println(word + " with frequency - " +count);
	}

	public static void main(String[] args) {
		new MaxFreqWordInArray().maxRepeatinWord();
	}
}
