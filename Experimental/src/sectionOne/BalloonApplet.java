package sectionOne;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;//import java.awt.event.*;  goes with ActionListener and actionPerformed

public class BalloonApplet extends Applet
                             implements ActionListener//import java.awt.event.*;  goes with ActionListener and actionPerformed
{//variable & object declarations and initializations                                        
    
	private static final long serialVersionUID = 1L; //serialID, don't touch
	
	
	Button right, left, up, down;
    public static final int DISPLAY_WIDTH = 600;// this is a constant
    public static final int DISPLAY_HEIGHT = 600;// this is also a constant
    private int startX = DISPLAY_WIDTH/2;
    private int startY = DISPLAY_WIDTH/2;
    
    public void init()
    {
        left = new Button ("<==");
        add (left);
        left.addActionListener (this); 
        
        up = new Button ("^^^");
        add (up);
        up.addActionListener (this); 
        
        down = new Button ("vvv");
        add (down);
        down.addActionListener (this); 
        
        right = new Button ("==>");
        add (right);
        right.addActionListener (this); 
    }// endInit 
    
    public void paint(Graphics g)
    {
        resize(DISPLAY_WIDTH,500);
        setBackground(Color.CYAN);
        g.setColor(Color.BLACK);
        g.fillOval(startX-50,startY-50,50,75);//no longer a weird balloon :P
    }//endPaint
    
    public void actionPerformed(ActionEvent clic)//import java.awt.event.*;  goes with ActionListener and actionPerformed
    {
        if ( clic.getSource()== right)
            doRight();
        else if (clic.getSource()== left)
        	doLeft();
        else if (clic.getSource()== up)
        	doitUp();
        else if (clic.getSource()== down)
        	dropitDown();
        
        repaint();
    }//endActionPerformed
    
    public void doRight()
    {
        startX+=50;
    }
    
    public void doLeft()
    {
        startX-=50;
    }
    
    public void doitUp()
    {
        startY-=50;
    }
    
    public void dropitDown()
    {
        startY+=50;
    }
}   //endProgram    









