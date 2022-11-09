import java.time.*;


public class ProgramOne
{
	public static void main(String [] args)
	{
		ZoneId zone = ZoneId.systemDefault();
		System.out.println(zone);

		ZoneId zim = ZoneId.of("Harare/Zimbabwe");
		ZoneId zw = ZoneDateTime.now(zim);
		System.out.println(zw);
	}

}

//there an error