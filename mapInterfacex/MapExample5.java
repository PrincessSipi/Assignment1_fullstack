import java.util.*;

class Temp
{
	@Override
	public String toString()
	{
		return "temp";
	}

	@Override 
	public void finalize()
	{
		System.out.println(" cleaning");
	}
}

public class MapExample5
{
	public static void main(String [] args)
	{
		WeakHashMap whm = new WeakHashMap();
		Temp t = new Temp();
		whm.put(t, "Murna");
		
		System.out.println(whm); // {temp = Murna}
		
		t = null; //Making eligible for garbage collection
		System.gc();  // triggering garbage collector thread to clean 't'
		try
		{
			Thread.sleep(5000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}

		System.out.println(whm);
	}
}