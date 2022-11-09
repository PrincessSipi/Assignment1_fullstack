public class Test
{

	public static void main(String [] args)
	{
		// to use Date in general  operations like printing the date and time
		java.util.Date utilDate = new java.util.Date();
		System.out.println(utilDate);

		System.out.println();
		long l = utilDate.getTime();  // It is giving the information of utilDate in milliseconds from 1970
		System.out.println(l + "ms");

		System.out.println();
		// to use Date in Database operations like insert, update, delete query we use sqlDate

		java.sql.Date sqlDate = new java.sql.Date(l);
		System.out.println(sqlDate);
	}
}