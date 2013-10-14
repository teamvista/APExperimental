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
        
        for (int i = 0; i < 6; ++i)
        {
        	//declare vars
            double width, height, radius, side1, side2, side3;
            String transChar;
            
            System.out.println("========Iteration " + (i+1) + " of 6========");
            System.out.print("Please select a shape abstratus. | [r]ectangle | [t]riangle | [c]ircle | > ");
            transChar = inlet.next(); //transChar means transition to char
            char caseSelector = transChar.charAt(0);
            
            // <switch case>
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
            		System.out.println("The area of a rectangle with width " + width + " and height " + height + " is " + float2(rect));
            		System.out.println("The perimeter of the same rectangle is " + float2((2*width + 2*height)));
            		break;
            		
            	case 't':
            	case 'T':
            		System.out.println("Triangle chosen.");
            		System.out.print("Please enter side 1: ");
            		side1 = inlet.nextDouble();
            		System.out.print("Please enter side 2: ");
            		side2 = inlet.nextDouble();
            		System.out.print("Please enter side 3: ");
            		side3 = inlet.nextDouble();
            		
            		boolean checkIfValidTriangle = checkIfTriangle(side1, side2, side3);
            		
            		if (!checkIfValidTriangle)
            			System.out.println("Invalid triangle.");
            		else 
            		{
            			double trig = calcTriangle(side1, side2, side3);
            			System.out.println("The area of a triangle with sides " + side1 + ", " + side2 + ", and " + side3 + " is " + float2(trig));
            			System.out.println("The perimeter of the same triangle is " + float2((side1 + side2 + side3)));
            		}
            		break;
            		
            	case 'c':
            	case 'C':
            		System.out.println("Circle chosen.");
            		System.out.print("Please enter radius: ");
            		radius = inlet.nextDouble();
            		double circ = calcCircle(radius);
            		System.out.println("The area of a circle with radius " + radius + " is " + float2(circ));
            		System.out.println("The circumference of the same circle is " + float2(radius * (2*Math.PI)));
            		break;
        		default:
        			System.out.println("Invalid request.");
        			break;
            }
            
            System.out.println();
            // </switch>
        }
        
        
        System.out.println();
        System.out.println("# # # # # # # # # # # # # # # # # # # #");
    	System.out.println("This program was run by " + varOne);
    	System.out.println("# # # # # # # # # # # # # # # # # # # #");
        inlet.close();

	}
	
	public static String float2(double n) {
		DecimalFormat formatN = new DecimalFormat("#,###.00");
		String modifiedN = formatN.format(n);
		return modifiedN;
	}
	
	public static double calcRectangle (double w, double h) {
		double foo = w * h;
		return foo;
	}
	
	public static double calcTriangle (double s1, double s2, double s3) {
		double sumSides = (s1 + s2 + s3) /2;
		double heronFMLA = Math.sqrt(( (sumSides) * (sumSides - s1) * (sumSides - s2) * (sumSides - s3) ));
		return heronFMLA;
	}
	
	public static boolean checkIfTriangle (double s1, double s2, double s3) {
		if (!( (s1 + s2) > s3))
			return false;
		else if (!( (s1 + s3) > s2 ))
			return false;
		else if (!( (s2 + s3) > s1 ))
			return false;
		else return true;
	}
	
	public static double calcCircle (double r) {
		double baz = Math.PI * Math.pow(r, 2);
		return baz;
	}

}
