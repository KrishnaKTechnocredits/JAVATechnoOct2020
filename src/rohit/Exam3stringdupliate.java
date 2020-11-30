package rohit;
//find duplicate from given array.
public class Exam3stringdupliate {

	void findduplicatevalue(String[] names) {
		for (int i = 0; i < names.length - 1; i++) {
			for (int j = i + 1; j < names.length; j++) {
				if ((names[i].equals(names[j])) && (i != j)) {
					System.out.println("Duplicate Element is : " + names[j]);
				}
			}
		}
	}

	public static void main(String[] args) {
		Exam3stringdupliate exam3stringdupliate = new Exam3stringdupliate();
		String[] names = { "Techno", "Credits", "Techno", "Hi", "Hello", "Hi" };
		exam3stringdupliate.findduplicatevalue(names);
	}
}