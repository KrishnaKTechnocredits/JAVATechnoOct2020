package ruby;

/*Assignment - 38 : 11th Dec'2020 
Verify number is in Fibonacci series or not..
output : 0, 1, 1, 2, 3, 5, 8, 13, 21, 34*/
public class Assignment38 {

	boolean verifyNumInFibonacci(int n) {
		int index = 0, temp1 = 0, temp2 = 1, sum = 0;
		boolean flag = false;
		while (index <= n) {
			sum = temp1 + temp2;
			temp1 = temp2;
			temp2 = sum;
			index++;
			if (sum == n) {
				flag = true;
			}
			if (flag) {
				return true;
			}else if (n == 0 || n == 1)
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Assignment38 assign = new Assignment38();
		int num = 143;
		boolean flag = assign.verifyNumInFibonacci(num);
		if (flag)
			System.out.println("Number "+num+" is in Fibonacci Series");
		else
			System.out.println("Number "+num+" is not in Fibonacci Series");
	}
}
