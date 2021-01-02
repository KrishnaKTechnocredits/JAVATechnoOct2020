package technoCredits.oops.p1;

public class CharAscii {
	public static void main(String[] args) {
		int d = 'A';
		char ch = 'A';
		System.out.println(d); // 65
		System.out.println(ch); // 'A'
		
		char temp = (char)(ch + 32); // 65 + 32 = 97
		
		System.out.println(temp); // a
		
	}
}
