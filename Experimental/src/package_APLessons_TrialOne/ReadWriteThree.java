/* 
 * Uses:
 * Method Call
 * No Returns
 */

package package_APLessons_TrialOne;

import java.util.Scanner;

public class ReadWriteThree {

	public static void main(String args[])
    {
    	
    	//initialization
    	
    	System.out.println("This program was written by James Daniel");
    	System.out.println();
    	String varOne;
    	System.out.print("Enter your name: ");
    	Scanner readStuff = new Scanner(System.in);
        varOne = readStuff.nextLine();
        System.out.println();
    	
 
        
    	for (int foo = 0; foo < 4; ++foo) //ints
    	{
    		//section 1 of loop
    		
    		int firstNum, secondNum;
            
            System.out.println();
            System.out.println("Trial " + (foo+1) + " integers: ");
            System.out.print("Please enter your first number: ");
            firstNum = readStuff.nextInt();
            System.out.print("Please enter your second number: ");
            secondNum = readStuff.nextInt();
            sumVoid(firstNum, secondNum);
            diffVoid(firstNum, secondNum);
            prodVoid(firstNum, secondNum);
            qotVoid(firstNum, secondNum);
            
            System.out.println();
            
            
            //section 2 of loop
    		
    		double firstNumd, secondNumd; //doubles
            
            System.out.println();
            System.out.println("Trial " + (foo+1) + " doubles: ");
            System.out.print("Please enter your first number: ");
            firstNumd = readStuff.nextDouble();
            System.out.print("Please enter your second number: ");
            secondNumd = readStuff.nextDouble();
            
            sumVoidDub(firstNumd, secondNumd);
            diffVoidDub(firstNumd, secondNumd);
            prodVoidDub(firstNumd, secondNumd);
            qotVoidDub(firstNumd, secondNumd);
            
            System.out.println();
            
    	}
    	
    	
    	System.out.println("# # # # # # # # # # # # # # # # # # # #");
    	System.out.println("This program was run by " + varOne);
    	System.out.println("# # # # # # # # # # # # # # # # # # # #");
        readStuff.close();
        
    }

	///////////////////////////////////////////
	
	public static void sumVoid (int a, int b) {
		int out;
		out = a+b;
		System.out.println("The sum of " + a + " and " + b + " equals " + out);
	}
	
	public static void diffVoid (int a, int b) {
		int out;
		out = a-b;
		System.out.println("The difference of " + a + " and " + b + " equals " + out);
	}
	
	public static void prodVoid (int a, int b) {
		int out;
		out = a*b;
		System.out.println("The product of " + a + " and " + b + " equals " + out);
	}
	
	public static void qotVoid (int a, int b) {
		if (b == 0)
				System.out.println("The quotient of " + a + " and " + b + " cannot be resolved. | (ERR: DIV/0)");
		else
		{
			int out, out2;
			out = a/b;
			out2 = a%b;
			System.out.println("The quotient of " + a + " and " + b + " is " + out + "r" + out2);
		}
	}
	
	public static void sumVoidDub (double a, double b) {
		double out;
		out = a+b;
		System.out.println("The sum of " + a + " and " + b + " equals " + out);
	}
	
	public static void diffVoidDub (double a, double b) {
		double out;
		out = a-b;
		System.out.println("The difference of " + a + " and " + b + " equals " + out);
	}
	
	public static void prodVoidDub (double a, double b) {
		double out;
		out = a*b;
		System.out.println("The product of " + a + " and " + b + " equals " + out);
	}
	
	public static void qotVoidDub (double a, double b) {
		if (b == 0)
			System.out.println("The quotient of " + a + " and " + b + " cannot be resolved. | (ERR: DIV/0)");
		else
		{
			double out;
			out = a/b;
			System.out.println("The quotient of " + a + " and " + b + " is " + out);
		}
	}
	
}
