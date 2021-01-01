package nandini.stringPrograms;

public class PalindromeString {
	
	 boolean isPalindrome(String str) 
	 {
        int i = 0, j = str.length() - 1; 
        while (i < j) { 
            if (str.charAt(i) != str.charAt(j)) 
                return false; 
            i++; 
            j--; 
        } 
        return true; 
    }  
    public static void main(String args[]) {
		PalindromeString palindromestr = new PalindromeString();
		boolean flag = palindromestr.isPalindrome("naman");
		if(flag)
			System.out.println("String is Palindrome");
		else
			System.out.println("String is not Palindrome");	
	}
}
