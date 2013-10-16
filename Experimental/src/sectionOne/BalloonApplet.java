package sectionOne;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;//import java.awt.event.*;  goes with ActionListener and actionPerformed

public class BalloonApplet extends Applet
                             implements ActionListener//import java.awt.event.*;  goes with ActionListener and actionPerformed
{//variable & object declarations and initializations                                        
    
	private static final long serialVersionUID = 1L; //serialID, don't touch
	
	
	Button east, west, north, south, northWest, northEast, southWest, southEast;
    public static final int DISPLAY_WIDTH = 600;// this is a constant
    public static final int DISPLAY_HEIGHT = 600;// this is also a constant
    private int startX = DISPLAY_WIDTH/2;
    private int startY = DISPLAY_WIDTH/2;
    
    public void init()
    {
        west = new Button ("West");
        add (west);
        west.addActionListener (this); 
        
        north = new Button ("North");
        add (north);
        north.addActionListener (this); 
        
        south = new Button ("South");
        add (south);
        south.addActionListener (this); 
        
        east = new Button ("East");
        add (east);
        east.addActionListener (this); 
        
        northWest = new Button ("Northwest");
        add (northWest);
        northWest.addActionListener (this); 
        
        northEast = new Button ("Northeast");
        add (northEast);
        northEast.addActionListener (this); 
        
        southWest = new Button ("Southwest");
        add (southWest);
        southWest.addActionListener (this); 
        
        southEast = new Button ("SouthEast");
        add (southEast);
        southEast.addActionListener (this); 
    }// endInit 
    
    public void paint(Graphics g)
    {
        resize(DISPLAY_WIDTH,500);
        resize(DISPLAY_HEIGHT,500);
        setBackground(Color.CYAN);
        g.setColor(Color.BLACK);
        g.fillOval(startX,startY,50,75);//no longer a weird balloon  
    }//endPaint
    
    public void actionPerformed(ActionEvent clic)//import java.awt.event.*;  goes with ActionListener and actionPerformed
    {
        if (clic.getSource()== east)
            goEast();
        else if (clic.getSource()== west)
        	goWest();
        else if (clic.getSource()== north)
        	goNorth();
        else if (clic.getSource()== south)
        	goSouth();
        else if (clic.getSource()== northWest)
        	goNorthWest();
        else if (clic.getSource()== northEast)
        	goNorthEast();
        else if (clic.getSource()== southWest)
        	goSouthWest();
        else if (clic.getSource()== southEast)
        	goSouthEast();
        
        System.out.println(startX + " " + startY);
        repaint();
    }//endActionPerformed
    
    //TODO midpoint (275, 212)
    //TODO extreme RD (550, 424)
    //TODO extreme LU (0, 0)
    
    public void goEast()
    {
        startX+=5;
    }
    public void goWest()
    {
        startX-=5;
    }
    
    public void goNorth()
    {
        startY-=2;
    }
    
    public void goSouth()
    {
        startY+=2;
    }
    public void goNorthEast()
    {
        startX+=10;
        startY-=10;
    }
    public void goNorthWest()
    {
        startX-=10;
        startY-=10;
    }
    public void goSouthEast()
    {
        startX-=10;
    	startY+=10;
    }
    public void goSouthWest()
    {
    	startX+=10;
        startY+=10;
    }
    public void goToCenter()
    {
    	startX=275;
        startY=212;
    }
    public void goToDRCorner()
    {
    	startX=550;
        startY=424;
    }
    public void goToULCorner()
    {
    	startX=0;
        startY=0;
    }
    
}   //endProgram    









