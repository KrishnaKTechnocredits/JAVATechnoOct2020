/*
 * Assignment - 47 : 27th Dec'2020
Replace second last occurance of "Hi" with your name.
String msg = "Hi globant Hello Hi Hi globant Hi Hello Hello globant Hi Techno Credits Techno";
output : Hi globant Hello Hi Hi globant Maulik Hello Hello globant Hi Techno Credits Techno
 */

package deepak.assignment47;

public class Program {
	
	void processData(String input) {
		
		String temp="";
		
		String[] arr = input.split(" ", input.length());
		
		int count=0;
		String comp="Hi";
		
		for(int i=arr.length-1; i>=0; i--) {
			
			String myString = arr[i];
			
			if(myString.equalsIgnoreCase(comp)) {
				
				count++;
				
				if(count==2) {
					
					arr[i]="Deepak";
				}
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			
			temp = temp + " "+ arr[i];
			
		}
		System.out.println("Input String is :"+ input);
		System.out.println("Output String is :"+ temp);
	}
		
	public static void main(String[] args) {
		
		String str = "Hi globant Hello Hi Hi globant Hi Hello Hello globant Hi Techno Credits Techno";
		
		Program refVar = new Program();
		refVar.processData(str);
	}

}
