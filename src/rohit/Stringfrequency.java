package rohit;

//To print the frequency count from the given String.
public class Stringfrequency {

	public void frequencycount(String str) {
		String[] arr = str.split(" ");
		for (int i = 0; i < arr.length; i++) {
			String word = arr[i];
			int count = 0;
			if (str.contains(word)) {
				for (int inner = 0; inner < arr.length; inner++) {
					if (word.equals(arr[inner]))
						count++;
				}
				System.out.println(word + " occurs " + count + " times");
				str = str.replace(word, "");
			}
		}
	}

	public static void main(String[] args) {
		Stringfrequency frequencycount = new Stringfrequency();
		String str = "Hi Hello Hi Techno Hello Hi";
		System.out.println("Input : " + str);
		frequencycount.frequencycount(str);
	}
}