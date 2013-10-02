package sectionOne;

import java.util.Scanner;

public class GeometriCalc {

	public static void main(String[] args) {
		//initialization
    	
    	System.out.println("This program was written by James Daniel");
    	System.out.println();
    	String varOne;
    	System.out.print("Enter your name: ");
    	Scanner inlet = new Scanner(System.in);
        varOne = inlet.nextLine();
        System.out.println();
        
        //do stuff
        
        System.out.println("# # # # # # # # # # # # # # # # # # # #");
    	System.out.println("This program was run by " + varOne);
    	System.out.println("# # # # # # # # # # # # # # # # # # # #");
        inlet.close();

	}

}
