/*Java Program to Count the Number of Vowels in user defined string.

Input : technocredits
output : vowels are e , o, i */


package deepak;

public class findingVowelsUsingTwoForLoop {
	int vowelsCount=0;
	
	int findvowelsCount(char[] input, String inputString) {
		
		char[] ch1= inputString.toCharArray();
		
		for(int i=0; i < input.length; i++) {
			for(int j=0; j < ch1.length; j++) {
				
				if(input[i]==ch1[j]) {
					System.out.println(input[i]);
					vowelsCount++;
				}
			}
		}
		
		return vowelsCount;
	}
	
	public static void main(String[] args) {
		
		char ch[] = {'a', 'e', 'i', 'o', 'u'};
		String input = "technocredits";
		
		findingVowelsUsingTwoForLoop FindingVowelsUsingTwoForLoop = new findingVowelsUsingTwoForLoop();
		
		System.out.println("Vowels count is :"+ FindingVowelsUsingTwoForLoop.findvowelsCount(ch, input));
	}

}
