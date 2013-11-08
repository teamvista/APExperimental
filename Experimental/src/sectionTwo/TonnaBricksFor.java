package sectionTwo;

import java.applet.*;
import java.awt.*;

public class TonnaBricksFor extends Applet {

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

		g.setColor(Color.darkGray);

		for (int brickRow = 1; brickRow <= DISPLAY_WIDTH; ++brickRow)
		{

			for (int brickColumn = 1; brickColumn <= DISPLAY_HEIGHT; ++brickColumn)
			{
				g.fillRect(currentX, currentY, brickWidth, brickHeight);
				currentX += (brickWidth + brickGap);
			}

			if (brickRow % 2 == 0)
				currentX = originX;
			else
				currentX = originX - brickWidth / 2 - brickGap / 2;

			currentY += brickHeight + brickGap;

		}

	}


}
