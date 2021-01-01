package milind;

public class SecondLastHiReplaceWithName {
	
	void hiReplaceWithName(String input, String word){
		String[] splitInput = input.split(" ");
		int count = 0;
		for(int index = splitInput.length - 1; index >= 0; index--) {
			if(splitInput[index].equalsIgnoreCase(word)) {
				count++;
				if(count == 2) {
					splitInput[index] = "Milind";
					break;
				}
			}
		}
		for(int index = 0; index < splitInput.length; index++) {
			System.out.print(splitInput[index] + " ");
		}	
		
		/*System.out.println();
		String output = String.join(" ", splitInput);
		System.out.println(output);*/
	}
	
	public static void main(String[] args) {
		String input = "Hi globant Hello Hi Hi globant Hi Hello Hello globant Hi Techno Credits Techno";
		SecondLastHiReplaceWithName secondLastHiReplaceWithName = new SecondLastHiReplaceWithName();
		secondLastHiReplaceWithName.hiReplaceWithName(input,"Hi");
	}
}
