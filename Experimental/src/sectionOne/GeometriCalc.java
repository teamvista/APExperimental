package sectionOne;

import java.util.Scanner;
import java.text.DecimalFormat;

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
        
        //declare vars
        double width, height, base, radius;
        String transChar;
        
        System.out.print("Please select a shape abstratus. | [r]ectangle | [t]riangle | [c]ircle | >");
        transChar = inlet.nextLine(); //transChar means transition to char
        char caseSelector = transChar.charAt(0);
        
        switch(caseSelector)
        {
        	case 'r':
        	case 'R':
        		System.out.println("Rectangle chosen.");
        		System.out.print("Please enter width: ");
        		width = inlet.nextDouble();
        		System.out.print("Please enter height: ");
        		height = inlet.nextDouble();
        		double rect = calcRectangle(width, height);
        		System.out.println("The area of a rectangle with width " + width + " and height " + height + " is " + rect);
        		break;
        		
        	case 't':
        	case 'T':
        		System.out.println("Triangle chosen.");
        		System.out.print("Please enter base: ");
        		base = inlet.nextDouble();
        		System.out.print("Please enter height: ");
        		height = inlet.nextDouble();
        		double trig = calcRectangle(base, height);
        		System.out.println("The area of a rectangle with base " + base + " and height " + height + " is " + trig);
        		break;
        		
        	case 'c':
        	case 'C':
        		System.out.println("Circle chosen.");
        		System.out.print("Please enter radius: ");
        		radius = inlet.nextDouble();
        		double circ = calcCircle(radius);
        		System.out.println("The area of a circle with radius " + radius + " is " + circ);
        		break;
        }
        
        System.out.println();
        System.out.println("# # # # # # # # # # # # # # # # # # # #");
    	System.out.println("This program was run by " + varOne);
    	System.out.println("# # # # # # # # # # # # # # # # # # # #");
        inlet.close();

	}
	
	public static double calcRectangle (double w, double h) {
		double foo = w * h;
		return foo;
	}
	
	public static double calcTriangle (double b, double h) {
		double bar = (0.5*b) * h;
		return bar;
	}
	
	public static double calcCircle (double r) {
		double baz = r * (2*Math.PI);
		return baz;
	}

}
