package sectionOne;

import java.util.Scanner;

public class TypeTester {

	public static void main(String[] args) {
		
		Scanner inlet = new Scanner(System.in);
		
		// printing integers, strings, booleans, and concatenation
		int ifoo = 10;
		int ibar = 10;
		System.out.print("Who is this? ");
		String user = inlet.nextLine();
		
		String dog;
		
		if (user.equals("dog"))
		{
			dog = "Yes, this is dog";
		}
		else
		{
			dog = "No, this is not dog";
		}
		
		System.out.println(dog);
		System.out.println("10 times 10 equals: " + ifoo*ibar);
		
		
		// prints an empty line to prepare for the next section
		System.out.println();
		
		// doubles (floating point numbers or decimal fractions)
		double dblfoo = 24.4;
		double dblbar = 42.2;
		System.out.println("Doubles down to: " + (dblfoo+dblbar));
		
		/* assignment operators
		 * Assignment operators simplify the typing needed to perform basic
		 * arithmetic functions on variables. For example
		 * 
		 * foo = foo+5;
		 * can be simplified into
		 * foo += 5;
		 * 
		 */
		dblfoo += 75.6;
		dblbar += 57.8;
		System.out.println("Doubles again to: " + (dblfoo+dblbar));
		
		System.out.println();
		
		// ++ and -- | shorthand for incrementing/decrementing 1
		for (int inc = 10; inc >= 0; --inc)
		{
			if (inc == 0)
			{
				System.out.println(inc + "!!!");
			}
			else
			{
				System.out.println(inc);
			}
		}
		
		System.out.println();
		
		/* ifoo = dblbar; // this code doesn't work b/c you can't assign
		 * double values to integers
		 * but by casting, you can do so albeit losing some data
		 */
		
		ifoo = (int)dblbar; // this is casting
							// now let's print both ifoo and dblbar to compare
		
		System.out.println("ifoo contains: " + ifoo); // value: 100
		System.out.println("dblbar contains: " + dblbar); // value: 100.0
		
		dblfoo = ibar; // this works though since you can assign integers to doulbes
					   // this is called automatic casting
					   // let's try printing both variables now
		
		System.out.println("dblfoo contains: " + dblfoo);
		System.out.println("ibar contains: " + ibar);
		
		inlet.close();
		
	}

}
