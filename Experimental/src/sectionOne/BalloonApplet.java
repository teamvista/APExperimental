package sectionOne;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;//import java.awt.event.*;  goes with ActionListener and actionPerformed

public class BalloonApplet extends Applet
                             implements ActionListener//import java.awt.event.*;  goes with ActionListener and actionPerformed
{//variable & object declarations and initializations                                        
    
	private static final long serialVersionUID = 1L; //serialID, don't touch
	
	
	Button east, west, north, south;
    public static final int DISPLAY_WIDTH = 600;// this is a constant
    public static final int DISPLAY_HEIGHT = 600;// this is also a constant
    private int startX = DISPLAY_WIDTH/2;
    private int startY = DISPLAY_WIDTH/2;
    
    public void init()
    {
        west = new Button ("<==");
        add (west);
        west.addActionListener (this); 
        
        north = new Button ("^^^");
        add (north);
        north.addActionListener (this); 
        
        south = new Button ("vvv");
        add (south);
        south.addActionListener (this); 
        
        east = new Button ("==>");
        add (east);
        east.addActionListener (this); 
    }// endInit 
    
    public void paint(Graphics g)
    {
        resize(DISPLAY_WIDTH,500);
        resize(DISPLAY_HEIGHT,500);
        setBackground(Color.CYAN);
        g.setColor(Color.BLACK);
        g.fillOval(startX-50,startY-50,50,75);//no longer a weird balloon :P
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
        
        repaint();
    }//endActionPerformed
    
    public void goEast()
    {
        startX+=50;
    }
    
    public void goWest()
    {
        startX-=50;
    }
    
    public void goNorth()
    {
        startY-=50;
    }
    
    public void goSouth()
    {
        startY+=50;
    }
}   //endProgram    









