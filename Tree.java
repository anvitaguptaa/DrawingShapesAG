/**
 * Purpose: Prints an equilateral triangle/"tree" shape of stars.
 * Author: Anvita Gupta
 * Created on: 05/10/19
 */

// Recursively prints an equilateral triangle of stars and extends helper class.
public class Tree extends HelperClass
{	
	// Calls the user input value of rows to print shape.
	public static void printTree(int count, int p)
	{
		// If the user input for amount of rows is less than or equal to 0, no shape is displayed. 
		if (count <= 0)
		{
			return;
		}
		
		// Determines the value of stars and spaces for each row.
		printTree(count - 1, p + 1);
		
		// Calls helper method to print the correct amounts of spaces and stars.
		printSpaces(p);
		printStars(2 * count - 1);
		System.out.println();
	}
}