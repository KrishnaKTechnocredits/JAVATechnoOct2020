package prem.assignment31;


/*
Program 2:
Do Sum of all numbers and Convert Uppercase into lowercase, lowercase into uppercase using ASCII.
Given String = "Te1ch8n9oC6reDi5TS1"
Expected String = "30tECHNOcREdIts" */


public class ConvertUpperLowerCase {

	
	void convertCaseUsingAscii(String string) {
		System.out.println("Given String: "+string);
		String newString="";
		int sum=0;
		boolean flag=false;
		for(int index=0; index<string.length(); index++) {
			char character=string.charAt(index);
			if(character>=65 && character<=90)
				newString+=(char)(character+32);
			else if(character>=97 && character<=122)
				newString+=(char)(character-32);
			else if(character>=48 && character <=57) {
				sum+=Integer.parseInt(String.valueOf(character));
				flag=true;
			}
			else
				newString+=character;
		}
		
		if(flag)
			newString=String.valueOf(sum)+newString;
		System.out.println("Updated String: "+newString);
	}

	public static void main(String[] args) {
		ConvertUpperLowerCase convertUpperLowerCase = new ConvertUpperLowerCase();
		convertUpperLowerCase.convertCaseUsingAscii("Te1ch8n9oC6reDi5TS1");
	}
}

