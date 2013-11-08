package sectionTwo;

import java.applet.*;
import java.awt.*;

public class TonnaBricksDoWhile extends Applet {

	private static final long serialVersionUID = 1L;

	// I DECLARE!!
	public static final int DISPLAY_WIDTH = 600;
	public static final int DISPLAY_HEIGHT = 600;
	public int brickHeight = 50;
	public int brickWidth = 75;
	public int originX = 0;
	public int originY = 0;
	public int brickGap = 5;

	public void init() {
		resize(DISPLAY_WIDTH, DISPLAY_HEIGHT);
		Color midnightBlue = new Color(0, 0, 178);
		setBackground(midnightBlue);
	}

	public void paint(Graphics g) {
		int currentX = 0;
		int currentY = 0;
		boolean checkIfRow = true;

		g.setColor(Color.darkGray);

		do {

			if (currentX > DISPLAY_HEIGHT)
			{
				currentY += brickHeight + brickGap;

				if (checkIfRow)
				{
					checkIfRow = false;
					currentX = originX - (brickWidth / 2);
				}
				else
				{
					currentX = originX;
					checkIfRow = true;
				}

				g.fillRect(currentX, currentY, brickWidth, brickHeight);

			}
			
			else if (currentX == originX || currentX == originX / 2)
			{
				g.fillRect(currentX, currentY, brickWidth, brickHeight);
				currentX += brickWidth + brickGap;
			}
			else
			{
				currentX += brickWidth + brickGap;
				g.fillRect(currentX, currentY, brickWidth, brickHeight);
			}
			
			g.fillRect(currentX, currentY, brickWidth, brickHeight);

		} while (currentX <= DISPLAY_HEIGHT || currentY <= DISPLAY_WIDTH);

	}

}
