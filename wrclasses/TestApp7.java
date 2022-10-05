class TestApp7
{
	static Integer I = null;  // AutoBoxing(valueOf())
	// Integer I = Integer.valueOf(null);
	public static void main(String [] args)
	{
		int i = I;  // AutoUnboxing(intValue())
		// int i = I.intValue();
		System.out.println(i);  // NullPointerException

	}
}