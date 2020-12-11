package technoCredits.stringExamples;

public class Example1 {
	
	public static void main(String[] args) {
		String msg = "Hi Hello Hello Good Techno Hello Good Morning";
		System.out.println(msg.contains("Goo"));
		msg = msg.replace("Good", "");
		System.out.println(msg);
	}
}
