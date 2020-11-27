package mrunal;
/* Assignment-22 : 18th Nov'2020 
Print all prime numbers between 2 to 100.*/

public class prim_2_to_100 
{
	void findPrimeNumber(int start,int end) 
	{
		System.out.println("Displaying prime numbers  : "+start+" to "+end+" are-");
		for(int index=start;index<end;index++) 
		{
			boolean flag=true;
			for(int innerIndex=2;innerIndex<Math.sqrt(index);innerIndex++) 
			{
				if(index%innerIndex==0) 
					flag=false;
			}
			if(flag)
				System.out.print("\n" + index+" ");
		}
	}
public static void main(String[] args) 
{
		new prim_2_to_100().findPrimeNumber(2,100);
}
}