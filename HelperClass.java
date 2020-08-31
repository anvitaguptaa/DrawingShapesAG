/**
 * Purpose: Helper class to print correct number of spaces and stars for a shape.
 * Author: Anvita Gupta
 * Created on: 05/10/19
 */

// Prints stars and spaces for each shape.
public class HelperClass 
{
	// Prints spaces for each shape.
	public static void printSpaces(int count)
	{
		// If the user input for amount of rows is less than or equal to 0, nothing is displayed. 
		if (count <= 0)
		{
			return;
		}
		
		// Prints correct amount of spaces for each decrementing row.
		System.out.print(" ");
		printSpaces(count - 1);
	}
	
	// Prints stars for each shape.
	public static void printStars(int count)
	{
		// If the user input for amount of rows is less than or equal to 0, nothing is displayed. 
		if (count <= 0)
		{	
			return;
		}
		
		// Prints correct amount of stars for each decrementing row.
		System.out.print("*");
		printStars(count - 1);
	}
}
