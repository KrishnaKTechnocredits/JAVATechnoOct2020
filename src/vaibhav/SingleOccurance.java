package vaibhav;

//This program will display the Occurance of single character in a string 


public class SingleOccurance {
	
	static void findFrequency(String givenString) {
		for (int index = 0; index < givenString.length();index++) {
			int count=0;
			char temp = givenString.charAt(index);
			if (givenString.indexOf(temp) == index) {
				for(int innerIndex = 0; innerIndex < givenString.length(); innerIndex++) {
					if(	givenString.charAt(innerIndex) == temp)
						count++;				
				}
				System.out.println("Character "+temp+" present "+count+" times in "+givenString+" Word");			
			}			
		}		
	}

	public static void main(String[] args) {
		String str = "TEchnocredits";
		String givenString=str.toUpperCase();//converting string to upper case,so if incase user inputs word in lower case it will be capitalised 
		SingleOccurance.findFrequency(givenString);		
	}
}
