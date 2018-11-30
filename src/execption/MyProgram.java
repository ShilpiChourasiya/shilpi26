package execption;

import java.util.logging.Logger;

public class MyProgram 
{
	public static void main(String args[])
	{
		System.out.println("  **************************** ");
		
		try{
			try 
		{
			int a[]=new int [5];
			a[6]= 36;
		}
			catch(Exception e)
			{
				
				System.out.print("Exception found   " +e);
			}
			finally 
			{
				System.out.println("Finally executing ");
			}
			try
			{
				int x = 50/0;

				System.out.print("Hello world "+x);
			}
		catch(Exception e)
		{
			//Logger.info(e);
			System.out.print(" ... Exception found2   " +e);
		}
		finally 
		{
			System.out.println("... Finally executing2 ");
		}
		}
		finally 
		{
			System.out.println("... Finally executing2 ");
		}
		System.out.println("  **************************** ");
	}
	
}