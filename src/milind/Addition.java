package milind;

class Addition
{
	int a = 10;
	int b = 20;
	int c;
	
	void add()
	{
		c = a+b;
		System.out.println(c);
	}
	
	public static void main(String[] args)
	{
		Addition a1 = new Addition();
		a1.add();
	}
}