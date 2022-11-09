import java.util.*;

public class ComprExample
{
	public static void main(String [] args)
	{	

		List<Integer> l = Arrays.asList(5, 7, 2, 9);
		System.out.println(l);
		System.out.println();

		Collections.sort(l);
		System.out.println(l);
		System.out.println();
		
		Collections.sort(l, (n1, n2)-> n2-n1); // Comparator Implementation
		System.out.println(l);
		System.out.println();

		Collections.sort(l);
		Collections.reverse(l);
		System.out.println(l);
		System.out.println();
		
		
		/*
		ArrayList<Student> al = new ArrayList<>();
		al.add(new Student(21, "Nagesh", "Java"));
		al.add(new Student(20, "Ashwini", "JavaScript"));
		al.add(new Student(18, "Rohith", "Python"));
		al.add(new Student(25, "Namda", "Blockchain"));
		System.out.println();
		
		System.out.println(al);
		System.out.println();
		*/

		/*Comparator<Student> com = new Comparator<>() // Inner class
		{
			@Override
			public int compare(Student s1, Student s2)
			{
				return s1.age - s2.age;
			}

		};
		*/
		/*
		Collections.sort(al,(s1,s2)->  s1.age - s2.age); //lambda expression
		System.out.println(al);
		System.out.println();

		Collections.sort(al,(s1,s2)->  s1.tech.length() - s2.tech.length()); //lambda expression
		System.out.println(al);
		System.out.println();
		*/

	}
}