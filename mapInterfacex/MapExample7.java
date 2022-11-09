import java.util.*;
import java.io.*;


public class MapExample7
{
	public static void main(String [] args) throws Exception
	{
		Properties p = new Properties();
		
		//creating a file input stream to read the data from a file called database.properties
		FileInputStream fis = new FileInputStream("database.properties");

		// data loaded into properties object through fis
		p.load(fis);

		System.out.println();
		System.out.println(p);
		System.out.println();

		System.out.println("*************************************");
		System.out.println("URL IS     : : " + p.getProperty("url"));
		System.out.println("USERNAME IS: : " + p.getProperty("username"));
		System.out.println("PASSWORD IS: : " + p.getProperty("password"));

		System.out.println();
		p.setProperty("iNeuron", "NavinReddy");

		//creating a file out stream to write the data to a file called database.properties
		FileOutputStream fos = new FileOutputStream("database.properties");
		p.store(fos, "MAP operation got concluded"); //Added like a comment
		
		System.out.println();
		System.out.println(p);
		System.out.println();

		System.out.println("*************************************");
		System.out.println("URL IS     : : " + p.getProperty("url"));
		System.out.println("USERNAME IS: : " + p.getProperty("username"));
		System.out.println("PASSWORD IS: : " + p.getProperty("password"));
		System.out.println("iNEURON IS : : " + p.getProperty("iNeuron"));



	}
}