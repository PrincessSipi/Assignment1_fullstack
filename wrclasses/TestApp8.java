class TestApp8
{
	public static void main(String [] args)
	{
		// == compares the reference

		Integer x = new Integer(10);
		Integer y = new Integer(10);
		System.out.println(x == y); 	// they point to different objects

		x++;
		System.out.println();

		System.out.println(x);
		System.out.println(y);
		System.out.println(x == y);	// false

		Integer a = new Integer(10);  // new object
		Integer b = 10;  			// Autoboxing new wrapper object
		System.out.println(a == b);   // false

		Integer c = new Integer(10); 	// new Object
		Integer d = c; 			// points to c same object
		System.out.println(c == d);	// true

		Integer e = 10; // Object reuse due to use of buffer by AutoBoxing
		Integer f = 10;
		System.out.println(e == f);	// true

		Integer g = 100;
		Integer h = 100;
		System.out.println(g == h);	// true
		
		Integer i = 1000;			// out of byte buffer range -128 -> + 127, different objects created
		Integer j = 1000;
		System.out.println(i == j);	// false

		
	}
}