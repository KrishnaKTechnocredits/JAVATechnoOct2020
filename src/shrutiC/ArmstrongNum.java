package shrutiC;

public class ArmstrongNum {

	void isArmstrongNum(int number) {
		int num = 0;
		int sumOfCubes = 0;

		String string = Integer.toString(number);
		for (int i = 0; i < string.length(); i++) {
			num = Integer.parseInt(Character.toString(string.charAt(i)));
			sumOfCubes += (num * num * num);
		}
		if(sumOfCubes==number)
			System.out.println(number+" is an Armstrong number");
		else
			System.out.println(number+" is not an Armstrong number");
		
	}

	public static void main(String[] args) {
		
		ArmstrongNum object = new ArmstrongNum();
		object.isArmstrongNum(153);
		object.isArmstrongNum(154);
	}

}
