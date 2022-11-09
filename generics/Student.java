class Student 
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

	
}