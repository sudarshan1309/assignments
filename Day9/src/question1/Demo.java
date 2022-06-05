package question1;



public class Demo {

	public static void main(String[] args) {
		
		
		int x=1;
		
		while(x<=2) {
			Student student = new Student();
			student.displayDetails();
			System.out.println(student);
			System.out.println("=================================");
			x++;
		}
	}

}
