/*Assignment : 43 

WAP to sum numbers from below String

input: I have 5.6 years of exp in automation and 2.3 in manual testing
output: 7.9
*/

package kajol.ExceptionHandling;

public class AddDoubleNumbers {
	void findSumOfAllNumbers(String inputString) {
		String[] array=inputString.split(" ");
		float sum=0;
		for(int index=0;index<array.length;index++) {
			char ch=array[index].charAt(0);
				if(Character.isDigit(ch)) {
					sum+= Double.parseDouble(array[index]);
				}
		}
		System.out.println("Given String is: "+inputString);
		System.out.println("Sum of Digts: "+sum);	
	}
	
	public static void main(String[] args) {
		String str="I have 5.6 years of exp in automation and 2.3 in manual testing";
		try {
		new AddDoubleNumbers().findSumOfAllNumbers(str);
		}
		catch(NumberFormatException e){
		System.out.println("Number Format Exception");
		}
	}
}
