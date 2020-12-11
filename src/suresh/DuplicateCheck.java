package suresh;

public class DuplicateCheck {
	
	void duplicates(int[] names) {
		 for (int i = 0; i < names.length; i++) {
		     for (int j = i + 1 ; j < names.length; j++) {
		          if (names[i]==(names[j])) {
		                   // got the duplicate element
		        	  System.out.println("Duplicate Number is :"+names[i]);
		          }
		     }
		 }
		 	 
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] names = {0, 3,1, 2, 3};
		//int[] names = {10,12,10,15,14,15};
		new DuplicateCheck().duplicates(names);
	}

}
