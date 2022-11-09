import java.util.*;

class Employee
{
	@ Override
	public void finalize()
	{
		System.out.println("Cleaning the object");
	}

}


public class MapExample4
{
	public static void main(String [] args)
	{
		Employee e = new Employee();
		
		;;;;
		;;;;

		e = null; // Garbage object
		System.gc(); // Informing JVM to active GC thread to clean garbage

		try
		{
			Thread.sleep(5000);
		}
		catch(InterruptedException f)
		{
			f.printStackTrace();
		}

		System.out.println();
	}
}