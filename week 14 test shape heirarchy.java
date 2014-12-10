package java_SAC;

import java.util.Scanner;

public class test_shape_heirarchy
{		
	void print ( String arg )
	{
		System.out.println(arg);
	}
	
	void tester ( )
	{
		print ( "Enter a number to be used as the dimension for all shapes.");
		Scanner input = new Scanner ( System.in );
		float dimension = input.nextFloat();
		
		shape [] myShapes = new shape[ 5 ];
		myShapes[0] = new rectangle ( dimension, dimension );
		myShapes[1] = new circle ( dimension );
		myShapes[2] = new right_triangle ( dimension, dimension );
		myShapes[3] = new box ( dimension, dimension, dimension );
		myShapes[4] = new sphere ( dimension );
		
		for ( shape currentShape : myShapes )
		{
			System.out.println ( currentShape );
		}
			
		for ( shape currentShape : myShapes )
		{
			System.out.println ( "Your current shape is a : "+currentShape.get_shape_name());
			System.out.print ( "The number of dimensions are : " );
			System.out.println ( currentShape.get_dimension_count() );
			System.out.print ( "The are of your shape is : ");
			System.out.println ( currentShape.area() );
			
			if ( currentShape instanceof three_dimensional_shape )
			{
				System.out.print( "The volume of your shape is : " );
				System.out.println ( ( ( three_dimensional_shape ) currentShape ).volume() );
			}
			System.out.println();
		}
	}
}
