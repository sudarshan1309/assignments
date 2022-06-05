package question2;

public class ScienceStudent extends Student{

	int phisicsMarks;
	int chemistryMarks;
	int mathsMarks;


	public ScienceStudent(String name, String address, int phisicsMarks, int chemistryMarks, int mathsMarks) {
		super(name, address);
		this.phisicsMarks = phisicsMarks;
		this.chemistryMarks = chemistryMarks;
		this.mathsMarks = mathsMarks;
	}
	
	
	public ScienceStudent() {
		
	}
	
	@Override
	public double getPercentage() {
		double total = (this.phisicsMarks + this.chemistryMarks + this.chemistryMarks);
		double per = ((total/300)*100);
		
		System.out.println("Student Name: "+ name);
		System.out.println("Student Stream: Science Student");
		
		return per;
		
	}

}
