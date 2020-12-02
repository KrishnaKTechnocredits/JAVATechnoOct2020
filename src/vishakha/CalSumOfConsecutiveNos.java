/* program 2 : sum of all numbers in a give string 
input: te123ch9kj8 
output : 123 + 9 + 8 = 140*/

package vishakha;

public class CalSumOfConsecutiveNos {
	String num = "";
	int sum;
	
	void calSum(){
		String input = "te123ch9kj8";
		for(int i=0; i<input.length();i++){
			char ch = input.charAt(i);
			if(Character.isDigit(ch)){
				num = num + ch;
			}else if(Character.isLetter(ch)){
				if(num.length() > 0){
					sum = sum+Integer.parseInt(num);
					num = "";
				}
			}
		}
		if(num.length()>0){
			sum = sum+Integer.parseInt(num);
			num = "";
		}
		System.out.println("Sum is "+sum);
	}

	public static void main(String[] args) {
		new CalSumOfConsecutiveNos().calSum();
	}
}
