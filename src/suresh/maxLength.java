package suresh;
public class maxLength {

	String[] arr = {"Harsh,","Maulik","Technocredits","krisna"};
	static String getmaxLength(String[] arr) {
		int maxLength = 0;
	      String longestString = null;
		
		for(String s : arr)
			
			if(s.length()> maxLength) {
				maxLength = s.length();
				longestString = s;
			}
		return longestString;
	} 
	public static void main(String[] args) {
		
		maxLength maxlenth = new maxLength();
		String[] arr = {"Harsh,","Maulik","Technocredits","krisna"};
		
		String longestString = getmaxLength(arr);
		
		System.out.format("longest string: '%s'\n", longestString);
		
		System.out.format("String length", longestString.length());
		
		int count = 0;    
         
        for(int i = 0; i < longestString.length(); i++) {    
            if(longestString.charAt(i) != ' ')    
                count++;    
        }    
                
        System.out.println("Total number of characters in a string: " + count); 
	}

}
