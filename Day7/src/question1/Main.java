package question1;

public class Main {

	
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setName("Rupesh");
		employee.setAge(21);
		employee.setPhoneNumber("8757000652");
		employee.setAddress("saharsa,Bihar");
		employee.setSalary(100000.0);
	   employee.setSpecialization("Employee");;	
	   employee.setDepartment("sde1");;
		
		System.out.println("Name: "+employee.getName());
		System.out.println("Age: "+employee.getAge());
		System.out.println("Phone: "+employee.getPhoneNumber());
		System.out.println("Address: "+employee.getAddress());
//		System.out.println(employee.getSalary());
		employee.printSalary();
		System.out.println("Specialization: "+employee.getSpecialization());
		System.out.println("Department: "+employee.getDepartment());
		
		System.out.println("=====================");
//		================================================
		
		Manager manager = new Manager();
		manager.setName("Rupesh");
		manager.setAge(21);
		manager.setPhoneNumber("8757000652");
		manager.setAddress("saharsa,Bihar");
		manager.setSalary(2000000.0);
		manager.setSpecialization("HR");;	
		manager.setDepartment("sde3");

		
		System.out.println(manager.getName());
		System.out.println(manager.getAge());
		System.out.println(manager.getPhoneNumber());
		System.out.println(manager.getAddress());
//		System.out.println(manager.getSalary());
		manager.printSalary();
		System.out.println("Specialization: "+employee.getSpecialization());
		System.out.println("Department: "+employee.getDepartment());
		
	}
	
}

/* Q1) Create a class named 'Member' having the following members:
Name : String
Age : int
Phone number : String
Address : String
Salary : double
It also has a method named 'printSalary' which prints the salary of the members.
Create two classes 'Employee' and 'Manager' inherits the 'Member' class.
The 'Employee' and 'Manager' classes have data members such as. :
Specialization : String
Department : String
Now, create a Main class which has the main method in it and assign name, age, phone
number, address and salary to an employee and a manager by making an object of both
of these classes and print the same. */