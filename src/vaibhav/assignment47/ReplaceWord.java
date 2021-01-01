package vaibhav.assignment47;

/*Assignment - 47 : 27th Dec'2020

Replace second last occurance of "Hi" with your name.
String msg = "Hi globant Hello Hi Hi globant Hi Hello Hello globant Hi Techno Credits Techno";
output : Hi globant Hello Hi Hi globant Maulik Hello Hello globant Hi Techno Credits Techno*/


public class ReplaceWord {
	
	public void changeWord(String str) {
		String [] splitArray = str.split(" ");
		int count = 0;
		for (int i = splitArray.length-1 ; i >= 0 ; i--) {
			if(splitArray[i].contains("Hi"))
				count++;
			if( count == 2) {
				splitArray[i] = "Vaibhav";
				break;
			}
		}		
		String str1 = String.join(" ", splitArray);
		System.out.println(str1);
	}

	public static void main(String[] args) {		
		String msg = "Hi globant Hello Hi Hi globant Hi Hello Hello globant Hi Techno Credits Techno";
		ReplaceWord replaceWord = new ReplaceWord();
		replaceWord.changeWord(msg);
		
	}

}
