package question4;

public class Student extends Person{

	int studentId;
	String coursrEnrolled;
	int courseFee;
	

	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getCoursrEnrolled() {
		return coursrEnrolled;
	}
	public void setCoursrEnrolled(String coursrEnrolled) {
		this.coursrEnrolled = coursrEnrolled;
	}
	public int getCourseFee() {
		return courseFee;
	}
	public void setCourseFee(int courseFee) {
		this.courseFee = courseFee;
	}
	

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", coursrEnrolled=" + coursrEnrolled + ", courseFee=" + courseFee
				+ ", myaddress=" + myaddress + "]";
	}
	
}
