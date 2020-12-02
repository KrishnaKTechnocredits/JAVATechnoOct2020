package tejashree;
/*convert all capital letters to small and small to capitial.
String msg = "tE1GfrEsT";
output : Te1gFReSt*/

public class Assignment26 {
	public static void main(String[] args) {
		String msg = "tE1GfrEsT";
		char ch = msg.charAt(0);
		for (int index = 0; index < msg.length(); index++) {
			ch = msg.charAt(index);
			if (Character.isUpperCase(ch)) {
				ch = Character.toLowerCase(ch);
			} else if (Character.isLowerCase(ch)) {
				ch = Character.toUpperCase(ch);
			}
			System.out.print(ch);
		}
	}
}
