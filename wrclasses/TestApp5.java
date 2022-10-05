class TestApp5 {
	public static void main(String [] args)
	{
		int i1  = Integer.valueOf("10");
		System.out.println(i1); // 10 in String format
		//System.out.println(i1.toString()); this is giving me an error Compilation failed

		String s1  = Integer.toString(10);
		System.out.println(s1);  // 10 in String format

		String s2  = Boolean.toString(true);
		System.out.println(s2);  // true in String format

		String s3 = Character.toString('a');
		System.out.println(s3);
	}
}