package raghvendra.prime;
//Find count,sum,Average of prime numbers from 2 to 200
public class CountSumAvgPrime {
	void printCountSumAvgPrime() {
		int count=0;;
		int sum=0;
		boolean flag=false;
		for(int index=2;index<=200;index++) {
			flag=false;
			for(int inner=2;inner<=Math.sqrt(index);inner++) {
				if(index%inner==0) {
					flag=true;
					break;
				}
			}
			if(!flag) {
			count++;
			sum=sum+index;
			}
		}
		System.out.println("Count of Primr numbers from 2 to 200:"+count);
		System.out.println("Sum of Primr numbers:"+sum);
		System.out.println("Average of Primr numbers:"+(sum/count));
	}
	public static void main(String[] args) {
		CountSumAvgPrime countSumAvgPrime=new CountSumAvgPrime();
		countSumAvgPrime.printCountSumAvgPrime();
	}
}
