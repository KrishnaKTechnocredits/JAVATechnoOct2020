package technoCredits.oops.p1;

public class Test1 {

	// Hello --> not match
	
	public static void main(String[] args) {
		char ch = 'a';
		char ch1 = 's';
		char ch2 = 'S';
		
		
		
		/*if(!(ch == ch1 || ch == ch2))
			System.out.println("Not match");
		else
			System.out.println("------");
		*/
		
		if(ch != ch1 && ch != ch2)
			System.out.println("Not match");
		
	}
}
