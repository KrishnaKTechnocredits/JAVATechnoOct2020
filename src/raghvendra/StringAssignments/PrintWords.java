package raghvendra.StringAssignments;
/* Program 1: print all the words which does't have any digit. 
String[] input = {"Masgj3Pw", "r4fsjk","techno","sfjk44lk"};
output : techno*/
public class PrintWords {
	void printWordwithoutDigit(String[] st) {
		int count;
		System.out.println("Words without digit is: ");
		for(int index=0;index<st.length;index++) {
			String word=st[index];
			count=0;
			for(int inner=0;inner<word.length();inner++) {
				char ch=word.charAt(inner);
				if (Character.isDigit(ch)) {
					count++;
					break;
				}
			}
			if(count==0)
				System.out.println(st[index]+" ");
		}
	}

	public static void main(String[] args) {
		PrintWords printWords=new PrintWords();
		String[] input = {"Masgj3Pw", "r4fsjk","techno","sfjk44lk"};
		printWords.printWordwithoutDigit(input);
		String[] input1 = {"Masgj3Pw", "r4fsjk","techno","sfjkk","asx%%"};
		printWords.printWordwithoutDigit(input1);
	}

}
