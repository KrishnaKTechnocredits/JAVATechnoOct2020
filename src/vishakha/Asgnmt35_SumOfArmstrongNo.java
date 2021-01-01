/*return sum of all Armstrong number from given array.
input : [153, 111, 124, 371]
output : 524*/

package vishakha;

public class Asgnmt35_SumOfArmstrongNo {
	
	void calSumOfArmstrongNo(int[] numArr){
		int temp = 0, n = 0, sum = 0;
		for(int i=0; i<numArr.length; i++){
			int num = numArr[i], sqRt = 0;
			temp = num;
			while(num>0){
				n = num%10;
				num /= 10;
				sqRt += n*n*n;
			}
			if(temp == sqRt){
				System.out.println(sqRt+ " is an armstrong no");
				sum += sqRt;
			}
		}
		System.out.println("Sum of armstrong number is "+sum);
	}

	public static void main(String[] args) {
		int[] numArr = {153, 111, 124, 371}; 
		new Asgnmt35_SumOfArmstrongNo().calSumOfArmstrongNo(numArr);
	}
}
