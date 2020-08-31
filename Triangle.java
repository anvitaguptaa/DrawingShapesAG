/**
 * Purpose: Prints a right-angled triangle of stars.
 * Author: Anvita Gupta
 * Created on: 05/10/19
 */

// Recursively prints a right-angled triangle of stars.
public class Triangle 
{
	// Calls the user input value of rows to print shape.
	public static String printStars (int count) 
	{
		// If the user input for amount of rows is less than or equal to 0, no shape is displayed. 
		if (count <= 0) 
		{
			return "";
		}

	    // Determines amount stars in each row that must be printed. 
	    String p = printStars(count - 1);
	    
	    // Prints according number of stars in each row.
	    p = p + "*";
	    System.out.println(p);
	    return p;
	 }
}
