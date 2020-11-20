package anjaliP;
/*Assignment-22 : 18th Nov'2020 
Print all prime numbers between 2 to 100.
 */
public class PrimeNumber {
	
	public void findPrimeNumber(int start,int end) {
		System.out.println("Prime Numbers Between : "+start+" to "+end+" are -->");
		for(int index=start;index<end;index++) {
			boolean flag=true;
			for(int innerIndex=2;innerIndex<Math.sqrt(index);innerIndex++) {
				if(index%innerIndex==0) 
					flag=false;
			}
			if(flag)
				System.out.print(index+" ");
		}
	}
	public static void main(String[] args) {
		new PrimeNumber().findPrimeNumber(2,100);
	}
}
