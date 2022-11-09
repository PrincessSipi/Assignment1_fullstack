import java.util.*;

class Student implements Comparable<Student>
{
	int age;
	String name;
	String tech;

	public Student(int age, String name, String tech)
	{
		this.age = age;
		this.name = name;
		this.tech = tech;
	}

	@Override
	public String toString()
	{
		return "Student [age = "+ age + " ,name = " +name+ " tech = " +tech +"]";
	}

	@Override
	public int compareTo(Student that)
	{
		//return that.age - this.age;
		return this.name.compareTo(that.name);
	}
}

public class CompExample
{
	public static void main(String [] args)
	{	
		
		ArrayList<Student> al = new ArrayList<>();
		al.add(new Student(21, "Nagesh", "Java"));
		al.add(new Student(20, "Ashwini", "JavaScript"));
		al.add(new Student(18, "Rohith", "Python"));
		al.add(new Student(25, "Namda", "Blockchain"));
		
		System.out.println(al);
		System.out.println();

		Collections.sort(al);
		System.out.println(al);
		System.out.println();

	}
}