package suvela.assignment33;

public class ArmstrongNum {
	void findArmstrongNum(int num) {
		System.out.println("Number given is:"+num);
		int ans=0;
		int temp=num;
		while(num>0) {
			int digit=num%10;
			ans=ans+(digit*digit*digit);
			num=num/10;
		}
		if(ans==temp)
			System.out.println("Number is armstrong");
		else
			System.out.println("Number is not armstrong");
	}
	public static void main(String[] args) {
		int num=370;
		ArmstrongNum numb= new ArmstrongNum();
		numb.findArmstrongNum(num);
		int n=145;
		numb.findArmstrongNum(n);
	}

}
