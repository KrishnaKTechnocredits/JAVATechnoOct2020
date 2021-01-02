package technoCredits.collectionDemo;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx10 {
	
	static ArrayList<EmployeeDetails> getSortedEmpBasedOnSalary() {
		/// Excel
		ArrayList<EmployeeDetails> al = new ArrayList<EmployeeDetails>();
		al.add(new EmployeeDetails(2, "Nandini", 150000)); // 3
		al.add(new EmployeeDetails(1, "Vaibhav", 100000)); // 2
		al.add(new EmployeeDetails(4, "Raghav", 150000)); // 4
		al.add(new EmployeeDetails(3, "Maulik", 30000)); // 1
		
		Collections.sort(al); // first.compareTo(second)
		/*for(int index=0 ; index<al.size() ; index++) {
			for(int j=0; j<al.size() ; j++) {
				if(index != j) {
					EmployeeDetails e1 = al.get(index); //this 
					EmployeeDetails e2 = al.get(j);
					if(e1.compareTo(e2) == 0) {
						System.out.println("Both same");
					}else if(e1.compareTo(e2) <0) {
						System.out.println("e1 is smaller than e2");
					}else {
						System.out.println("e1 is bigger than e2");
					}
				}
			}
		}*/
		return al;
	}

	public static void main(String[] args) {

		System.out.println(getSortedEmpBasedOnSalary());
	}
}
