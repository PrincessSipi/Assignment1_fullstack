package in.ineuron.test;

import in.ineuron.entities.Branch;
import  in.ineuron.entities.Student;

public class TestApp 
{
	
	// Driving code
	public static void main(String [] args)
	{
		// Creating a dependent object
		Branch branch = new Branch("IN01", "VJYNGR");
		
		// Creating a Target object
		Student s1 = new Student(10, "sachin", 49, branch);
		Student s2 = new Student(7, "dhoni", 41, branch);
		Student s3 = new Student(18, "kholi", 35, branch);
		
		s1.getStudentDetails();
		System.out.println();
		
		s2.getStudentDetails();
		System.out.println();
		
		s3.getStudentDetails();
		System.out.println();
		
	}

}
