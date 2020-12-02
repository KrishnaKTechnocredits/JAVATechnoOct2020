/* Assignment 17 : 13th Nov'2020 

Same as Assignment 16 but each frequency should be printed single time.
input : aakanksha
output : a -> 4
              k -> 2
              n -> 1
              s -> 1
              h -> 1 */

package milind;

import java.util.Scanner;

public class CharFrequencyFromStringSingleTime {
	
	void characterFrequencyCheck(String input) {
		
		for(int index = 0; index < input.length(); index++) {
			int count = 0;
			for(int index1 = 0; index1 < input.length(); index1++) {
					if(input.charAt(index) == input.charAt(index1)) {
						if(index > index1) {
							break;
						}else {
							count++;
						}
					}
				}
			if(count > 0) {
			System.out.println("Character " + input.charAt(index) + " frequency is : " +count);
			}
		}
		
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter string for check character frequency : " );
		String stringForCharacterCheck = scanner.nextLine();
		CharFrequencyFromStringSingleTime charFrequencyFromStringSingleTime = new CharFrequencyFromStringSingleTime();
		charFrequencyFromStringSingleTime.characterFrequencyCheck(stringForCharacterCheck);
		scanner.close();
	}

}
