public class MutableStringFun
{
	public static void main(String [] args)
	{
		StringBuilder sb = new StringBuilder("sachin"); // 2 objects created(in the String Constant Pool and Heap Area)
		sb.append("tendulkar"); // 1 object(SCP)
		System.out.println(sb); // sachintendulkar

		StringBuffer s = new StringBuffer("sachin"); // 2 objects created(in the String Constant Pool and Heap Area)
		s.append("tendulkar"); // 1 object(SCP)
		System.out.println(s); // sachintendulkar

		
		StringBuffer s1 = new StringBuffer("sachin"); // 2 objects created(in the String Constant Pool and Heap Area)
		StringBuffer s2 = new StringBuffer("sachin"); ; // 1 object(SCP)
		System.out.println(s1.equals(s2)); // false
		System.out.println(s1 == s2); // compares the reference so => false
		
		System.out.println("******************************" );

		String ss1 = new String("sachin"); // 2 objects created(in the String Constant Pool and Heap Area)
		String ss2 = new String("sachin"); ; // 1 object(SCP)
		System.out.println(ss1.equals(ss2)); // true
		System.out.println(ss1 == ss2); // false

		System.out.println("******************************" );		

		StringBuilder sb1 = new StringBuilder("sachin"); // 2 objects created(in the String Constant Pool and Heap Area)
		StringBuilder sb2 = new StringBuilder("sachin"); ; // 1 object(SCP)
		System.out.println(sb1.equals(sb2)); // false
		System.out.println(sb1 == sb2); // false
		

	}

} 