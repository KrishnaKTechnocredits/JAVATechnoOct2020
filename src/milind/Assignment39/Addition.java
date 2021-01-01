package milind.Assignment39;

public class Addition {
	
	int add(int num1, int num2) {
	  int add = num1 + num2;
	  return add;
	}
	
	float add(float num1, float num2) {
		float add = num1 + num2;
		return add;
	}
	
	String add(String s1, String s2) {
		String add = s1 + s2;
		return add;
	}
	
	public static void main(String[] args) {
		Addition addition = new Addition();
		System.out.println("Addition of integer : " + addition.add(10, 20));
		System.out.println("Addition of decimal : " + addition.add(12.50f, 15.75f));
		System.out.println("Addition of String is : " + addition.add("techno", "credits"));
	}

}
