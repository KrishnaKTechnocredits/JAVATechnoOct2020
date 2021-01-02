package technoCredits.stringExamples;

public class Freq1 {
	
	public static void main(String[] args) {
		String input = "abbbabcada";
		String[] temp = input.split("a");
		System.out.println(temp.length);
		System.out.println("---" + temp[0].length() + "----");
		System.out.println(temp[1]);
		
		/*//input = "techano"; // 2-1
		//input = "techanao"; // 3 // 2-1
		//input = "atechno"; // 2 [2-1] // ateachno
		input = "technoa"; // 1
		//input = "ateachno"; //3 [2-1]
		input = "teachnoa"; // 2
		//input = "atechnoa"; // 2
		input = "ateachnoa"; // 3
		
		int len = input.split("a").length;
		if(input.charAt(input.length()-1) == 'a') {
			System.out.println(len);
		}else
			System.out.println(len-1);
		}*/
		
		input = "this is java selenium technocredits oct2020 batch";
		char ch1 = 'a';
		int orgLength = input.length(); // 10
		input = input.replace(String.valueOf(ch1), ""); // techno
		int newLength = input.length(); // 6
		System.out.println("Total a's " + (orgLength-newLength));
		
		input = "technocredits";
		
		while(input.length()>0) {
			char ch = input.charAt(0); // t // e
			orgLength = input.length(); // 13
			input = input.replace(String.valueOf(ch), ""); // echnocredis
			newLength = input.length(); // 11
			System.out.println(ch + "-->" + (orgLength-newLength));// t --> 2
		}
		
	}
}
