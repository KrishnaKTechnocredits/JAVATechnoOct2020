/*Assignment - 26: 23rd Nov'2020  
convert all capital letters to small and small to capitial.

String msg = "tE1GfrEsT";
output : Te1gFReSt

Hint : isUpperCase(), isLowerCase(), toUpperCase(), toLowerCase()*/

package Himali_Assignment26;

public class Assignment26 {
	void converLetteres(String word) {
		char[] arr=word.toCharArray();
		for(int i=0;i<word.length();i++) {
			char ch=arr[i];
			if(Character.isDigit(ch)) {
				
			}
			if(Character.isUpperCase(ch)) {
				 arr[i]=Character.toLowerCase(ch);
				
			}
			if(Character.isLowerCase(ch)) {
				 arr[i]=Character.toUpperCase(ch);
			}
			
			
		}
		System.out.println(new String(arr));
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg="tE1GfrEsT";;
		Assignment26 assignment26=new Assignment26();
		assignment26.converLetteres(msg);
	}

}
