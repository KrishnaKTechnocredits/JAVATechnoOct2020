//optional program - Find first thirty prime numbers
package ankita.assignment.prime;

public class FirstThirtyPrimeNumber {
	void getFirstThirtyPrimeNumber() {
		int count = 1;
		int num=2;
		while(count<=30) {
			boolean flag =true;
			for(int j=2; j<=num/2;j++) {
				if(num%j==0) {
					flag = false;
					break;
				}
			}
			if(flag) { 
				System.out.println(count+":"+ num );
				count++;
			}
			num++;
		}
	}
	public static void main(String[] args) {
		new FirstThirtyPrimeNumber().getFirstThirtyPrimeNumber();
	}
}