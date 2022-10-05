class TestApp6
{
	static Integer I = 10; // Autoboxing (valueOf()) primitive -> wrapper type

	public static void main(String [] args)
	{
		int i = I;  // Autounboxing (intValue()) -> wrapper type to primitive automatically done by compiler
		System.out.println(i);
	}
}