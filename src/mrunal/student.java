	/*Assignment : 48
	Student class having attribute -> studentId, studentName, studentStd.
	A) Use comparable to sort all students based on studentName.*/

package mrunal;

public class student implements Comparable {

		private String studentName;
		private int studentId;
		private int studentStd;

		public student(String studentName, int studentId, int studentStd) {
			this.studentName = studentName;
			this.studentId = studentId;
			this.studentStd = studentStd;
		}

		private String getstudentName() {
			return studentName;
		}
		
		private int getstudentID() {
			return studentId;
		}

		private int getstudentStd() {
			return studentStd;
		}
		
		public int compareTo(Object arg0) {
			student std = (student) arg0;
			return this.studentName.compareTo(std.studentName);
		}
		public String toString() {

			return "\n " + "Student name  is:" + studentName +
					"\n " + "Student ID is : " + studentId +
					"\n " + "Student studying in : " + studentStd + "\n "  ;
		}

	}