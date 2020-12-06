package suresh;
//Verify number is armstrong or not.
public class ArmStrongCheck {

	void armStrong(int n) {
		int c=0,a,temp;  
	     temp=n;  
	    while(n>0)  
	    {  
	    a=n%10;  
	    n=n/10;  
	    c=c+(a*a*a);  
	    }  
	    if(temp==c)  
	    System.out.println("armstrong number"+temp);   
	    else  
	        System.out.println("Not armstrong number");   
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArmStrongCheck armstrongcheck = new ArmStrongCheck();
		armstrongcheck.armStrong(153);
		armstrongcheck.armStrong(99);
	}

}
