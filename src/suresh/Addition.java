package suresh;

public class Addition {
	
	void AddNumbers(int number1,int number2) {
	int sum = number1+number2;
	System.out.println("Sum of Two Integer Numbers : "+sum);
	}

	void AddFloatNumbers(double d,double e) {
		double sum = d+e;
		System.out.println("Sum of Two Float Numbers : "+sum);
		}
	
	void Addnames(String firstname,String lastname) {
		String fullname = firstname +lastname;
		System.out.println("Full Name is :" + fullname);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition add = new Addition();
		add.AddNumbers(10, 20);
		add.AddFloatNumbers(11.10, 21.20);
		add.Addnames("Suresh kumar ", "Chukka");
	}

}
