package suresh;

/*Convert UpperCase into a LowerCase using ASCII 
Given String = "TechnoCreditS"
Expected String = "technocredits"
*/
public class AsciiCharsCheck {
	void Stringdata(String s) {
		int i,n;
		String z ="";
		z = "";
		char c;
		for (i = 0; i<s.length(); i++) {
			c = s.charAt(i);
			if (c >= 65 && c<= 90) 
			{
				n = c + 32;
				c = (char) n;
			}
			z = z + c;
		}
		System.out.println("\nLower Case: " + z);
		
	}

	public static void main(String[] args) {
		
		String s = "TechnoCreditS";
		System.out.println("Actual String: "+s);
		AsciiCharsCheck asciicheck = new AsciiCharsCheck();
		asciicheck.Stringdata(s);
		
		}
	}


