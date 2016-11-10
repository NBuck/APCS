package returnlabs;

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class MilesPerHour
{
	private double distance, hours, minutes, mph;


	public MilesPerHour()
	{
		setNums(0,0,0);
		mph=0.0;
	}

	public MilesPerHour(double dist, double hrs, double mins)
	{
		distance=dist;
		hours=hrs;
		minutes=mins;

	}

	public void setNums(double dist, double hrs, double mins)
	{
		distance=dist;
		hours=hrs;
		minutes=mins;


	}

	public void calcMPH()
	{
		mph=distance/(hours+minutes)/60;
		

	}

	public void print()
	{System.out.println("Distance in hours is"+hours+"and minutes"+minutes+"at"+mph+"mph");


	}
}