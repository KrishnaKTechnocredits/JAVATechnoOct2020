package tejashree;

class Assignment22{

	public static void main (String a[]){
	new Assignment22().isPrimeCheck();

}
void isPrimeCheck(){
	System.out.println("Prime no.s between 2 to 100 are:");
	for(int i=2;i<=100;i++){
	boolean isPrime = true;
	for(int j=2;j<i;j++){
		if(i%j==0){
		isPrime=false;
		break;
		}
	      }if(isPrime){
			System.out.print(i+" ");
	      }	
	}
    }
}