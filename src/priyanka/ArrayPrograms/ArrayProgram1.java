package priyanka.ArrayPrograms;

/*Assignment - 12 : 7th Oct'2020 
write a single program having different methods.
 
a) To find Min number from given array
b) To find Max number from given array
c) To find Avg of all numbers from give array
d) To display all numbers [0 to length]
e) To display all numbers [length to 0]
g) Method to find average of min and max number from array*/

public class ArrayProgram1 {

	int maximumNo(int numbers[]) {
		int max = numbers[0];
		for (int index = 0; index < numbers.length; index++) {
			if (numbers[index] > max)
				max = numbers[index];
		}
		return max;
	}

	int minimumNo(int numbers[]) {
		int min = numbers[0];
		for (int index = 0; index < numbers.length; index++) {
			if (numbers[index] < min)
				min = numbers[index];
		}
		return min;
	}

	double average(int numbers[]) {
		double sum = 0;
		for (int index = 0; index < numbers.length; index++) {
			sum = sum + numbers[index];
		}
		System.out.println("sum of numbers is " + sum);
		return sum / numbers.length;
	}

	void display0ToLength(int numbers[]) {
		for (int index = 0; index < numbers.length; index++) {
			System.out.print(numbers[index]+" ");
		}
	}

	void displayLenghtTo0(int numbers[]) {
		for (int index = numbers.length - 1; index >= 0; index--) {
			System.out.print(numbers[index]+" ");
		}
	}

	double avgOfMinAndMax(int numbers[]) {
		ArrayProgram1 arrayProgram1 = new ArrayProgram1();
		double avgOfMinAndMax = arrayProgram1.maximumNo(numbers) + arrayProgram1.minimumNo(numbers);
		return avgOfMinAndMax;
	}

	public static void main(String[] a) {

		ArrayProgram1 arrayProgram1 = new ArrayProgram1();
		int numbers[] = { 10, 23, 99, 145, 120, 87, 51, 90 };
		System.out.println("");
		System.out.println("Display  numbers of array");
		arrayProgram1.display0ToLength(numbers);
		System.out.println("");
		System.out.println("Display reverse numbers of array");
		arrayProgram1.displayLenghtTo0(numbers);
		System.out.println(" ");
		System.out.println("*********************************************************");
		System.out.println("Average of array numbers is " + arrayProgram1.average(numbers));
		int max = arrayProgram1.maximumNo(numbers);
		System.out.println("Maximum Number is :" + max);
		int min = arrayProgram1.minimumNo(numbers);
		System.out.println("Minimum  Number is :" + min);
				System.out.println("Average of Maximum and minimun numbers is " + arrayProgram1.avgOfMinAndMax(numbers) / 2);
	}

}
