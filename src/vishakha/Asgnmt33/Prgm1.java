/*Program 1: return a reserve number.
input : 1234
output : 4321*/

package vishakha.Asgnmt33;

public class Prgm1 {
	
	void reverseNum(int num){
		int numRev = 0;
		while(num !=0){
			int n = num % 10;
			numRev = numRev * 10 + n;
			num = num/10;
		} 
		System.out.println("Reverse No : " +numRev);
	}

	public static void main(String[] args) {
		int num = 1234;
		System.out.println("Number : "+num);
		new Prgm1().reverseNum(num);
	}
}
