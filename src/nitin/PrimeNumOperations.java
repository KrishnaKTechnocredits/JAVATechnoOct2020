package nitin;
/*Assignment_23 : 20th Nov'2020 -
1) Find count of prime numbers between 2-100.
2) find sum of all prime numbers between 2-100.
3) find average of all prime numbers between 2-100. */
public class PrimeNumOperations {
	void operationsOnPrimeNumber(int start,int end) {
		System.out.println("Prime numbers between "+start+" to "+end+" are :");
		int count=0; double sum=0;
		for(int index=start;index<end;index++) {
			boolean flag=true;
			for(int inner=2;inner<Math.sqrt(index);inner++){
				if(index%inner==0) {
					flag=false;
				break;
				}
			}
			if(flag) {
				count+=1;
				System.out.print(index+" ");
				sum+=index;
			}
		}
		System.out.println("");
		System.out.println("Total Count of Prime Numbers in the given range are : "+count);
		System.out.println("Sum of all prime numbers are : "+sum);
		System.out.println("Average of all prime numbers are : "+(sum/count));
	}
	public static void main(String[] args) {
		new PrimeNumOperations().operationsOnPrimeNumber(2,100);
	}
}
