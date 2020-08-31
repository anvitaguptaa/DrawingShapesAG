/**
 * Purpose: Prints an upside-down right-angled triangle of stars.
 * Author: Anvita Gupta
 * Created on: 05/10/19
 */

// Recursively prints an upside-down right-angled triangle of stars.
public class InverseTriangle 
{
	// Calls the user input value of rows to print shape.
	public static String printTriangle (int count, String p) 
	{
		// If the user input for amount of rows is less than or equal to 0, no shape is displayed. 
		if (count <= 0)
		{
			return "";
		}
	   
		// Prints rows of stars.
		p = p + "*";
		
		// Decrements rows as printTriangle is called.
		printTriangle(count - 1, p);
		System.out.println(p);
		return p;   
	}
}
