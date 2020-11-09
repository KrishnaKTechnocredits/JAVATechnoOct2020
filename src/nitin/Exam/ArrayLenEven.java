package nitin.Exam;
import java.util.Scanner;
public class ArrayLenEven {
	
	String getMaxLengthName(String[] name) {
		int maxnumber=name[0].length();
		String maxname=name[0];
		for(int index=0;index<name.length;index++) {
			if(maxnumber<name[index].length())
				maxname=name[index];
		}
		return maxname;
	}
	void display(String name) {
		for(int index=0;index>name.length();index++) {
			if(index%2 !=0)
				System.out.println(name.charAt(index));
		}
	}
	public static void main(String[] args) {
		ArrayLenEven arrayLenEven = new ArrayLenEven();
		@SuppressWarnings("resource")// getting a resource leak warning on line 23 for sc, I use the contextual help & this line 22 got added itself and warning removed itself.
		Scanner sc = new Scanner(System.in);
		System.out.println("How many names would you like to enter : ");
		int length = sc.nextInt();
		String[] number=new String[length];
		for(int index=0;index<length;index++) {
			System.out.println("Enter name "+(index+1));
			number[index]=sc.next();
		}
		String maxLengthName = arrayLenEven.getMaxLengthName(number);
		System.out.println("Name with maximum length is \n" + maxLengthName + "-->" + maxLengthName.length());
		arrayLenEven.display(maxLengthName);
		}
}
