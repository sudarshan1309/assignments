package question4;

//import java.util.Scanner;

public class Main {
	
	
	public static Person generatePerson(Person person) {
		
		if(person instanceof Student) {
			  Student student =(Student)person;
				student.setName("Harshit");
				student.setGender("Male");
				student.setStudentId(1);
				student.setCoursrEnrolled("JA111");
				student.setCourseFee(30000);
				
				Address myaddress = new Address();
				myaddress.setCity("Patna");
				myaddress.setState("Bihar");
				myaddress.setPincode("852106");
				
				student.setMyaddress(myaddress);
				
				return student;

		}
		
		else {
			Instructor instructor= (Instructor)person;
			instructor.setName("Ratan ");
			instructor.setGender("Male");
			instructor.setInstructorId(456);
			instructor.setSalary(456000);
			
			Address myaddress = new Address();
			myaddress.setCity("Banglore");
			myaddress.setState("Karnataka");
			myaddress.setPincode("852100");
			
            instructor.setMyaddress(myaddress);
            
            return instructor;
		}
		
	}
	
	
  public static void main(String[] args) {
	

	 Person newStudent = generatePerson(new Student());
	 Person newTeacher = generatePerson(new Instructor());
	 
	 System.out.println(newStudent);
	 System.out.println("==============================================================");
	 System.out.println(newTeacher);
	 
     }
	
}
