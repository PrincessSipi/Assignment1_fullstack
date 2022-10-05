public class MlthrdExample1
{
	public static void main(String [] args)
	{
		System.out.println("Hello focus here");
		Thread t = Thread.currentThread();
		System.out.println(t);
		System.out.println("Thread is executing this");
		t.setName("Sipi's code");
		t.setPriority(4);

		String name = Thread.currentThread().getName();
		System.out.println(name);

		System.out.println(t);
	}
}