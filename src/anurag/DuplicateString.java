package anurag;

public class DuplicateString {

	
	static void display() {
	String[] names = {"Techno","Credits", "Techno", "Hi", "Hello", "Hi" };
	
	for (int i = 0; i <names.length; i++) {
		int count=0;
		for (int j = i; j<names.length; j++) {
			if (names[i]==names[j])
				count++;
		}
		if(count>1)
			System.out.println(names[i]);
	
	}
	
	}


		public static void main(String[] args) {
			
			display();
			
			
			
		}
		
}
		

