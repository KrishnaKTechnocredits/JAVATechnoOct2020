package nandini;

public class Exam1 {

	 String getMaxLengthName(String[] arr){
		int i =0; 
		int length = 0;
		int maxLengthName = arr[0].length();
		for(int index = 1; index < arr.length; index++) {
			
			if(arr[index].length() > maxLengthName) {
				i = index;
				maxLengthName = arr[index].length();
			}
			    
		}

		length = arr[i].length();
		System.out.println("length of the longest Name is :" + length);
		
		return arr[i];
	}
	 
	 void display(String name) {
		 
		 String evenCharcters = "";
		 for(int index = 1; index < name.length(); index++) {
			  
			if(index % 2 == 0)
				evenCharcters += name.charAt(index);
			
		 }
		 
		 System.out.println("Even Characters from given name are : " + evenCharcters);
		 
		 
	 }
	 
	
	public static void main(String [] args) {
		
		Exam1 exam1 = new Exam1();
		String [] name = {"Nandini","Abhimanyu","Leena","Suman","Angel"};
		String longestName = exam1.getMaxLengthName(name);
		System.out.println("Longest Name is : "+ longestName);
		exam1.display(longestName);
		
	}
			
		
}
