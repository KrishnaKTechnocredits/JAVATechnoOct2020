package yogita;

 public class Frequency {

	void findFrequency(String name) {
		System.out.println("String is :" + name);
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			int index = name.indexOf(name.charAt(i));
			if (i == index) {
				int cnt = 0;
				for (int j = 0; j < name.length(); j++) {
					if (name.charAt(i) == name.charAt(j))
						cnt++;
				}
				System.out.println("Character " + ch + " Occurance " + cnt + " times");
			}
		}
	}

	public static void main(String[] args) {
		Frequency countFrequency = new Frequency();
		countFrequency.findFrequency("aakannshha");
	}
}
