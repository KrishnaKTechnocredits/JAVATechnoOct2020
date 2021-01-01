package prasad.ExceptionHandeling;

import java.util.ArrayList;

/*Assignment : 43 [23rd Dec'2020]

WAP to sum numbers from below String

input: I have 5.6 years of exp in automation and 2.3 in manual testing
output: 7.9

hint: Double's parse method
use exception handling*/

public class SumOfNosFrStrg {
	ArrayList<Double> findNos(String[] words) {
		ArrayList<Double> nos = new ArrayList<Double>();
		for (int index = 0; index < words.length; index++) {
			String str = words[index];

			try {
				Double no = Double.parseDouble(str);
				nos.add(no);
			} catch (NumberFormatException ne) {

			}
		}

		return nos;
	}

	double addNumbers(ArrayList<Double>list) {
		double sum = 0;
		for (int index = 0; index < list.size(); index++) {
			double num = list.get(index);
			sum += num;
		}
		return sum;
	}

	public static void main(String[] arg) {
		SumOfNosFrStrg sumOf = new SumOfNosFrStrg();
		String str = "I have 5.6 years of exp in automation and 2.3 in manual testing";
		System.out.println("String:-" + str);
		String[] words = str.split(" ");
		ArrayList<Double> output = sumOf.findNos(words);
		System.out.println("Numbers in given string:-" + output);
		double ans = sumOf.addNumbers(output);
		System.out.print("Addition of above numbers:-");
		System.out.printf("%.1f", ans);
	}
}
