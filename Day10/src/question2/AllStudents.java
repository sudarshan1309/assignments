package question2;

import java.util.Scanner;

public class AllStudents {
	
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			
//			====================ScienceStudent==================================================

			
			
			System.out.println("Enter Student Name");
			String name = scan.next();
			
			System.out.println("Enter Student Address");
			String address = scan.next();
			
			System.out.println("Enter Physics Mark");
			int physics = scan.nextInt();
			
			System.out.println("Enter Chemistry Mark");
			int chemistry =  scan.nextInt();
			
			System.out.println("Enter Maths Mark");
			int maths =  scan.nextInt();
			
			Student student  = new ScienceStudent(name,address,physics,chemistry,maths);
			
//		ScienceStudent ss = (ScienceStudent)student;        //downcasting from Student to ScienceStudent

			double per = student.getPercentage();
			System.out.println(name+"'s Total Percentage = "+per+"%");
			
			System.out.println("===================================================");
//		======================HistoryStudent====================================================
			
			
			System.out.println("Enter Student Name");
			String name2 = scan.next();
			
			System.out.println("Enter Student Address");
			String address2 = scan.next();
			
			System.out.println("Enter History Mark");
			int historyMarks = scan.nextInt();
			
			System.out.println("Enter Civics Mark");
			int civicsMarks =  scan.nextInt();
			
			Student HistoryStudent  = new HistoryStudent(name2,address2,historyMarks,civicsMarks);
			
//		HistoryStudent hs = (HistoryStudent)HistoryStudent;    //downcasting from Student to HistoryStudent
			double per2=HistoryStudent.getPercentage();
			System.out.println(name2+"'s Total Percentage = "+per2+"%");
		}
		

	}

}
