/**
 * Purpose: Prints a diamond shape of stars.
 * Author: Anvita Gupta
 * Created on: 05/10/19
 */

// Recursively prints a diamond of stars and extends Tree for the top half of the shape.
public class Diamond extends Tree
{
	// Initializes local variable. 
	public static int once = 0;
	
	// Calls the user input value of rows to print shape.
	public static void printDiamond(int count, int p)
	{	
		// Calls printTree to print the upper half of the diamond shape.
		if (once == 0)
		{
			printTree(count + 1, p);
			once++;
		}
		
		// If the user input for amount of rows is less than or equal to 0, no shape is displayed.
		if (count <= 0)
		{
			return;
		}
		
		// Calls helper method to print the correct amounts of spaces and stars.
		printSpaces(p + 1);
		printStars(2 * count - 1);
		System.out.println();
		
		// Determines the value of stars and spaces for each row.
		printDiamond(count - 1, p + 1);
	}
}
