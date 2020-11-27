package suresh;
/*max repeating word with its freq.
input : Hi Hello Hi Techno Hello Hi
output : Hi -> 3
*/
public class WordCountMax {
	void wordCountCheck(String input) {
		String[] arr = input.split(" ");
		
		for(int i=0;i<arr.length;i++) {
			int count = 0;
			String word = arr[i];
			/*System.out.println("Array Index of " + word + " is "+i);
			System.out.println(word+ "index in a given string "+input.indexOf(word));*/
			if(i==input.indexOf(word)) {
			for(int j=0;j<arr.length;j++) {
				if(word.equals(arr[j]))
					count++;
			}
			System.out.println("Max Repeated word->"+word+ "->"+count);
		}
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Hi Hello Hi Techno Hello Hi";
		//WordCountMax wordcount = new WordCountMax();
		new WordCountMax().wordCountCheck(input);
		}

}
