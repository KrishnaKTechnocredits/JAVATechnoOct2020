package technoCredits.exception;

public class ExampleEx5 {
		
	static void m1() {
		String input = "technocredits";
		char ch = ' ';
		try {
			ch = input.charAt(15);
		}catch(StringIndexOutOfBoundsException se) {
			try {
				ch = input.charAt(14);
			}catch(StringIndexOutOfBoundsException se1) {
				ch = input.charAt(0);
			}finally {
				ch = input.charAt(1);
			}
		}finally {
			try {
				ch = input.charAt(input.length());
				ch = input.charAt(0);
			}catch(StringIndexOutOfBoundsException se) {
				ch = input.charAt(input.length()-1);
			}finally {
				ch = input.charAt(0);
			}
		}
		System.out.println(ch); /// t
	}
	
	public static void main(String[] args) {
		m1();
	}
}
