package anjaliP;

public class Example1 {
	String m1() {
		int num = 32;
		if(num<30)
			return "Techno";
		return "Credits";
	}
	public static void main(String[]a) {
		Example1 emp1 = new Example1();
		String s = emp1.m1();
		System.out.println(s);
	}
}
