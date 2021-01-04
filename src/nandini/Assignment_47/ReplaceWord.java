package nandini.Assignment_47;

public class ReplaceWord {
	
	void replaceSecondLastOccurance(String inputStr) {
		int lastIndex= inputStr.lastIndexOf("Hi");
		String subStr = inputStr.substring(0,lastIndex);
		int strIndex = subStr.lastIndexOf("Hi");
		String subStr1 = subStr.substring(strIndex);
		System.out.println(inputStr.substring(0,strIndex)+subStr1.replace("Hi", "Nandini")+inputStr.substring(lastIndex));
	}
	
	public static void main(String[] args) {
		new ReplaceWord().replaceSecondLastOccurance("Hi globant Hello Hi Hi globant Hi Hello Hello globant Hi Techno Credits Techno");
	}

}
