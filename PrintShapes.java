/**
 * Purpose: Displays shape options for user to select from and prints selected shape to console.
 * Author: Anvita Gupta
 * Created on: 05/10/19
 */

// Imports the Scanner class from java.util package.
import java.util.Scanner;

// Displays user options and selected shapes in console.
public class PrintShapes 
{
	// Initializes field.
	public static int count;
	
	public static void main(String[] args)
	{
		// Initializes local variables.
		int shape;
		Scanner n = new Scanner(System.in);
		
		// Displays the program instructions and prompts the user to select a shape.
		System.out.println("Below are your shape options:");
		System.out.println("1. Right Triangle");
		System.out.println("2. Inverse Right Triangle");
		System.out.println("3. Tree");
		System.out.println("4. Diamond");
		System.out.println();
		System.out.print("Type the option number for the shape you would like to print: ");
		shape = n.nextInt();
		
		// If the user inputs a valid shape value, prompts user to select number of rows, represented by count
		if (shape > 0 && shape < 5)
		{
			System.out.print("How many rows would you like your shape to be: ");
			count = n.nextInt();
			n.close();
		}
		
		// If the user selects option 1, Triangle.java is called and given the parameter for number of rows. 
		if(shape == 1)
		{
			System.out.println();
			Triangle.printStars(count);
		}
		
		// If the user selects option 2, InverseTriangle.java is called and given the parameter for number of rows. 
		if(shape == 2)
		{
			System.out.println();
			InverseTriangle.printTriangle(count, "");
		}
		
		// If the user selects option 3, Tree.java is called and given the parameter for number of rows. 
		if(shape == 3)
		{
			System.out.println();
			Tree.printTree(count, 0);
		}
		
		// If the user selects option 4, Diamond.java is called and given the parameter for number of rows. 
		if(shape == 4)
		{
			// If the inputted value for number of rows is even, it is made odd for the diamond shape to display correctly.
			if(count % 2 == 0)
			{
				count += 1;
			}
			
			System.out.println();
			Diamond.printDiamond(count / 2, 0);
		}
		
		// If the inputted value of shape is invalid, message is displayed and program is terminated.
		if(shape > 4 || shape < 0)
		{
			System.out.println();
			System.out.println("Sorry, that is an invalid shape option. Please try again.");
			System.exit(0);
		}
	}
}




