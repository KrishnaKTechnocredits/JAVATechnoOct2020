package suvela.assignment39.prog4;

public class Addition {
	void add(int a,int b) {
		int ans=a+b;
		System.out.println("Method 1 addition:"+ans);
	}
	void add(double a,double b) {
		double ans=a+b;
		System.out.println("Method 2 addition:"+ans);
	}
	void add(String a,String b) {
		String ans=a+b;
		System.out.println("Method 3 addition:"+ans);
	}
	public static void main(String[] args) {
		Addition ad= new Addition();
		ad.add(5, 10);
		ad.add(5.4, 7.3);
		ad.add("A", "B");

	}

}
