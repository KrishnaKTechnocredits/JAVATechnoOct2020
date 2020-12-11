/*Program 2: verify number is armstrong or not.
input : 153
output : 153 is an armstrong number.
input : 154 
output : 154 is an armstrong number.*/

package vishakha.Asgnmt33;

public class Prgm2 {
	
	void isArmstrongNum(int num){
		int finalNum=0, n=0, givenNo = num ;
		while(num>0){
			n = num%10;
			num = num/10;
			finalNum = finalNum + (n * n * n);
		}
		if(givenNo == finalNum)
			System.out.println(givenNo +" is an armstrong no");
		else
			System.out.println(givenNo +" is not an armstrong no");
	}
	
	public static void main(String[] args) {
		int num = 153;
		new Prgm2().isArmstrongNum(num);
	}
}
