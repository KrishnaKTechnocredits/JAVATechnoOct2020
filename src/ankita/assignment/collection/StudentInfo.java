/*Assignment : 48

Student class having attribute -> studentId, studentName, studentStd.
A) Use comparable to sort all students based on studentName.
*/
package ankita.assignment.collection;

public class StudentInfo implements Comparable<StudentInfo>{
		int stdId;
		String name;
		int stdStd;
		
		public StudentInfo(int stdId, String name, int stdStd) {
			this.stdId = stdId;
			this.name =name;
			this.stdStd = stdId;
		}

		@Override
		public int compareTo(StudentInfo o) {
			return this.name.compareTo(o.name);
		}
		public String toString(){
			return stdId + ":" + name + ":" + stdStd ;
		}
}
