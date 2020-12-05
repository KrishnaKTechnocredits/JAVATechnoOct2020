package suresh;
//verify number is palindrom or not.
public class NumberPalindromeCheck {
	void numericPlaindrome(int n) {
		int r,sum=0,temp;
		//int n=121121;  
		  
		  temp=n;    
		  while(n>0){    
		   r=n%10;  //getting remainder  
		   sum=(sum*10)+r;    
		   n=n/10;    
		   
		  }   
		  if(temp==sum)    
			   System.out.println(sum+":-> is a palindrome number ");    
			  else    
			   System.out.println("not palindrome"); 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberPalindromeCheck numberpalindrome = new NumberPalindromeCheck();
		numberpalindrome.numericPlaindrome(121121);
		   
	}

}
