import java.time.*;


class Test2
{

	public static void main(String [] args)
	{
		LocalTime time = LocalTime.now();
		
		int h = time.getHour();
		int m = time.getMinute();
		int s = time.getSecond();
		int n = time.getNano();

		System.out.printf("\n%d:%d:%d:%d", h,s,m,n);

		LocalDateTime dt = LocalDateTime.now();
		System.out.println("\n" + dt);

		//LocalDateTime dt1 = LocalDateTime.of(1995,Month.April,28,12,45);
		//System.out.println("\n" + dt1);

		LocalDateTime dt2 = LocalDateTime.of(1995,04,28,12,45);
		System.out.println("\n" + dt2);

	}

}