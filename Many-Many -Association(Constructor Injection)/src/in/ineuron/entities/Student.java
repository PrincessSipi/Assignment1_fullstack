package in.ineuron.entities;


// Target Object
public class Student
{
	private Integer sid;
	private String sname;
	private Integer sage;
	
	// Has-a variable
	private Course []  courses;
	
	// Constructor Injection
	public Student(Integer sid, String sname, Integer sage, Course [] courses)
	{
		this.sid = sid;
		this.sname = sname;
		this.sage = sage;
		this.courses = courses;
	}
	
	public void getStudentDetails()
	{
		System.out.println("Student details are : : ");
		System.out.println("SID is    :: " + sid);
		System.out.println("SNAME is  :: " + sname);
		System.out.println("SAGE  is  :: " + sage);
		
		System.out.println("---------------------------------------");
		
		System.out.println("Course details are :: ");
		
		//Performing data navigation to access course details
		for(Course course : courses)
		{
		System.out.println("CID   is :: " + course.getCid());
		System.out.println("CNAME is :: " + course.getCname());
		System.out.println("COST is  :: " + course.getCost());
		}
		System.out.println("");
	}
}
