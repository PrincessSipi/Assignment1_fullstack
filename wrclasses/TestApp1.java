class TestApp1 
{
	public static void main(String [] args)
	{
		// constructor useage of wrapper class to create a wrapper object
		Integer i1 = new Integer(10);
		Integer i2 = new Integer("10");

		// useage of utility methods
		Integer i3 = Integer.valueOf(10);     // creates a wrapper object of a given primitive or 
		Integer i4 = Integer.valueOf("10");   // String without using the new keyword

		System.out.println(i1);
		System.out.println(i2);
		System.out.println();
		System.out.println(i3);
		System.out.println(i4);

		
	}
}