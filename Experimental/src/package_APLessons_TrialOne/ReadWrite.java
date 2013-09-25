/* 
 * Uses:
 * No Method Recall
 */

package package_APLessons_TrialOne;

import java.util.Scanner; //ALWAYS import BEFORE the class!!!

public class ReadWrite
{
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
    		
    		int firstNum, secondNum, sum, differ, mult, qot, remain;
            
            System.out.println();
            System.out.println("Trial " + (foo+1) + " integers: ");
            System.out.print("Please enter your first number: ");
            firstNum = readStuff.nextInt();
            System.out.print("Please enter your second number: ");
            secondNum = readStuff.nextInt();
            sum = firstNum + secondNum;
            differ = firstNum - secondNum;
            mult = firstNum * secondNum;
            
            
            System.out.println("The sum of " + firstNum + " and " + secondNum + " is " + sum);
            System.out.println("The difference of " + firstNum + " and " + secondNum + " is " + differ);
            System.out.println("The product of " + firstNum + " and " + secondNum + " is " + mult);
            
            if (secondNum == 0)
            	System.out.println("The quotient of " + firstNum + " and " + secondNum + " cannot be resolved. | (ERR: DIV/0)");
            else
            {
            	qot = firstNum / secondNum;
                remain = firstNum % secondNum;
            	System.out.println("The quotient of " + firstNum + " and " + secondNum + " is " + qot + "r" + remain);
            }
            	
            
            System.out.println();
            
            
            //section 2 of loop
    		
    		double firstNumd, secondNumd, sumd, differd, multd, qotd; //doubles
            
            System.out.println();
            System.out.println("Trial " + (foo+1) + " doubles: ");
            System.out.print("Please enter your first number: ");
            firstNumd = readStuff.nextDouble();
            System.out.print("Please enter your second number: ");
            secondNumd = readStuff.nextDouble();
            sumd = firstNumd + secondNumd;
            differd = firstNumd - secondNumd;
            multd = firstNumd * secondNumd;
            
            System.out.println("The sum of " + firstNumd + " and " + secondNumd + " is " + sumd);
            System.out.println("The difference of " + firstNumd + " and " + secondNumd + " is " + differd);
            System.out.println("The product of " + firstNumd + " and " + secondNumd + " is " + multd);
            
            
            if (secondNum == 0)
            	System.out.println("The quotient of " + firstNumd + " and " + secondNumd + " cannot be resolved. | (ERR: DIV/0)");
            else
            {
            	qotd = firstNumd / secondNumd;
            	System.out.println("The quotient of " + firstNumd + " and " + secondNumd + " is " + qotd);
            }
            
            System.out.println();
            
    	}
    	
    	
    	System.out.println("# # # # # # # # # # # # # # # # # # # #");
    	System.out.println("This program was run by " + varOne);
    	System.out.println("# # # # # # # # # # # # # # # # # # # #");
        readStuff.close();
        
    }
}