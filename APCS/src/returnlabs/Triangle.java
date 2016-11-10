package returnlabs;

import java.util.Scanner; 
import java.lang.Math.*;

public class Triangle
{
	private int sideA, sideB, sideC;
	private double perimeter;
	private double theArea;

	public Triangle()
	{
	   setSides(0,0,0);
	   perimeter=0;
	   theArea=0;
	}

	public Triangle(int a, int b, int c)
	{   sideA=a;
		sideB=b;
		sideC=c;
	}


	public void setSides(int a, int b, int c)
	{	sideA=a;
		sideB=b;
		sideC=c;

	}

	public void calcPerimeter( )
	{
		perimeter= sideA + sideB + sideC;


	}

	public void calcArea( )
	{
		double s;
		
		s=perimeter/2.0;
		theArea= Math.sqrt(s*(s-sideA)*(s-sideB)*(s-sideC));
	}

	public void print( )
	{
	System.out.println("The side lenghts were"+ sideA +(",") +sideB+(",")+sideC);
	System.out.println("The Area is =="+ theArea);

		System.out.println("\n\n");
	}
}