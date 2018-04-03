package graphicalapps;


import java.awt.Color;		//color class
import java.awt.Graphics;	//primitive graphics class
import java.awt.Graphics2D; 	//Extends Graphics class
import java.awt.Rectangle;	//Rectangles class
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;  //Ellipse and circle class
import java.awt.geom.Line2D; 	//Line class
import javax.swing.JPanel;
import javax.swing.JComponent;

public class TiltedShapeComponent extends JComponent
{
	//Place drawing instructions inside this method
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;  //Make graphics 2D

		//drawGrid(g2);  //Draw grid to make it easier to create component

		Ellipse2D.Double oval = new Ellipse2D.Double(400, 50, 100, 150); //Construct oval head (x, y, width, height)
		//g2.draw(oval);
		Rectangle rec = new Rectangle(425, 155, 50, 5);	 	//Construct mouth (x, y, width, height)
		Ellipse2D.Double eye1 = new Ellipse2D.Double(420, 95, 20, 8); //Construct oval head (x, y, width, height)
		Ellipse2D.Double eye2 = new Ellipse2D.Double(460, 95, 20, 8); //Construct oval head (x, y, width, height)

		AffineTransform old = g2.getTransform();  // old orientation
        g2.rotate(Math.toRadians(45), oval.getCenterX(), oval.getCenterY());            // rotates around the circle 45 degrees
        
        
        //draw shape/image (will be rotated)
        g2.draw(oval);
        g2.draw(eye1);
        g2.draw(eye2);
		g2.setColor(Color.RED);			//Color of mouth
		g2.fill(rec);				//Fill mouth with red
		
        g2.setTransform(old);  // go back to old orientation
        
	}

	public void drawGrid(Graphics2D g2)
	{
		// The following two for loops draw a grid on the screen to help you
		// position your object.  Once you have finished your object, you can
		// comment out the call to this method.

		//Draw horizontal lines
		g2.setColor(Color.LIGHT_GRAY);
		for (int i=50; i<=600; i=i+50)
		{
			g2.drawString(""+i, 5, i);
			Line2D.Double horizonalLine = new Line2D.Double(5, i, 700, i);
			g2.draw(horizonalLine);
		}
		//Draw vertical lines
		for (int i=50; i<=600; i=i+50)
		{
			g2.drawString(""+i, i, 10);
			Line2D.Double horizonalLine = new Line2D.Double(i, 10, i, 700);
			g2.draw(horizonalLine);
		}
		g2.setColor(Color.BLACK);
		//**End of grid
	}
}
