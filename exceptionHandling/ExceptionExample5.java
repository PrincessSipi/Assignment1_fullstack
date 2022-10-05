public class ExceptionExample5
{
	public static void main(String [] args) throws InterruptedException
	
	// Concept of ducking an Exception
	{
		System.out.println("First line");
		Thread.sleep(5000);
		System.out.println("Second line");
	}
}