public class TestApp3
{
	public static void main(String [] args)
	{
		// utility method to convert wrapper to primitive type
		Integer i = Integer.valueOf(130);
		
		System.out.println(i.byteValue()); // -128 to 128 byte range
		System.out.println(i.shortValue());
		System.out.println(i.longValue());
		System.out.println(i.doubleValue());
		System.out.println(i.floatValue());

		Character c = Character.valueOf('c');
		Boolean b = Boolean.valueOf("Nitin");

		System.out.println(c.charValue());
		System.out.println(b.booleanValue());
		
	}

} 