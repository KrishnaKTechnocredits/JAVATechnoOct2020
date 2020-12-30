/*Program 3:
return a list of employee name whose age is less than 30 and salary is greater than 75000.
Hint : List<String> filterEmployeeByAgeAndSalary(List<Employee> listOfEmployee, double salary, int age){}
*/
package ankita.assignment.collection;

import java.util.ArrayList;

public class EmployeeAge {

	public static ArrayList<Employee1> filterEmployeeByAgeAndSalary(ArrayList<Employee1> aL1) {
		ArrayList<Employee1> aL2 = new ArrayList<Employee1>();
		for (int i = 0; i < aL1.size(); i++) {
			if ((aL1.get(i).getAge() < 30) && (aL1.get(i).getSalary() > 75000))
				aL2.add(aL1.get(i));
		}
		return aL2;
	}

	public static void main(String[] args) {
		ArrayList<Employee1> aL1 = new ArrayList<Employee1>();
		Employee1 e1 = new Employee1("Ankita", "Mukund", "D", "aa", 26, 101, 50, 85000);
		Employee1 e2 = new Employee1("Rahul", "Ravi", "M", "bb", 27, 102, 51, 76000);
		Employee1 e3 = new Employee1("Suvela", "Sameer", "K", "aa", 36, 103, 55, 60000);
		Employee1 e4 = new Employee1("Arush", "Roohit", "T", "bb", 40, 110, 50, 90000);

		aL1.add(e1);
		aL1.add(e2);
		aL1.add(e3);
		aL1.add(e4);

		ArrayList<Employee1> aL2 = filterEmployeeByAgeAndSalary(aL1);
		for (int i = 0; i < aL2.size(); i++) {
			System.out.println(aL2.get(i));
		}
	}
}
