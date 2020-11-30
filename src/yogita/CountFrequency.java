package yogita;

public class CountFrequency {

	void findFrequency(String name) {
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			int cnt = 0;
			for (int index = 0; index < name.length(); index++) {
				if (name.charAt(index) == ch)
					cnt++;
			}
			System.out.println("Character " + ch + " Occurance:" + cnt + " times");
		}
	}

	public static void main(String[] args) {
		CountFrequency countFrequency = new CountFrequency();
		countFrequency.findFrequency("technocreditss");
	}
}
