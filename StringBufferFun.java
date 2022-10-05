public class StringBufferFun
{
	public static void main(String [] args)
	{
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());  // 16

		sb.append("abcdefghijklmno");
		System.out.println(sb.capacity()); // 16

		sb.append("q");
		System.out.println(sb.capacity());// (16 +1 )*2

		sb.append("rstuvwxyz");
		System.out.println(sb.capacity());// 34
	}
}