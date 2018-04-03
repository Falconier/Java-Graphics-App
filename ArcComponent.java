package graphicalapps;

import java.awt.Color;		//color class 
import java.awt.GradientPaint;
import java.awt.Graphics;	//primitive graphics class 
import java.awt.Graphics2D; //Contains methods to draw shapes
import java.awt.Rectangle;	//Rectangles class
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Ellipse2D.Double;

import javax.swing.JPanel;
import javax.swing.JComponent;

/* drawArc
public abstract void drawArc(int x,
        int y,
        int width,
        int height,
        int startAngle,
        int arcAngle)
Draws the outline of a circular or elliptical arc covering the specified rectangle. 
The resulting arc begins at startAngle and extends for arcAngle degrees, using the current color. Angles are interpreted such that 0 degrees is at the 3 o'clock position. A positive value indicates a counter-clockwise rotation while a negative value indicates a clockwise rotation. 

The center of the arc is the center of the rectangle whose origin is (x, y) and 
whose size is specified by the width and height arguments. 

The resulting arc covers an area width + 1 pixels wide by height + 1 pixels tall. 

The angles are specified relative to the non-square extents of the bounding 
rectangle such that 45 degrees always falls on the line from the center of the 
ellipse to the upper right corner of the bounding rectangle. As a result, if 
the bounding rectangle is noticeably longer in one axis than the other, the 
angles to the start and end of the arc segment will be skewed farther along the 
longer axis of the bounds. 

Parameters:
x - the x coordinate of the upper-left corner of the arc to be drawn.
y - the y coordinate of the upper-left corner of the arc to be drawn.
width - the width of the arc to be drawn.
height - the height of the arc to be drawn.
startAngle - the beginning angle.
arcAngle - the angular extent of the arc, relative to the start angle.
*/

public class ArcComponent extends JComponent
{
	//Place drawing instructions inside this method
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;							//Cast to recover Graphics2D
		
		//drawGrid(g2);  //Draw grid to make it easier to create component
		
		g2.setColor(Color.blue);
		g2.drawArc(52, 120, 203, 70, 30, 130);
		g2.drawArc(55, 114, 197, 70, 30, 130);
		//g2.fillArc(55, 114, 197, 70, 30, 130);
		g2.drawArc(11, 85, 280, 410, 50, 80);
		//g2.fillArc(11, 85, 280, 410, 50, 80);
		g2.setColor(Color.BLACK);
		g2.drawArc(87, 178, 130, 50, -152, 130);
	    //g2.setPaint( new GradientPaint( 100, 400, Color.GRAY, 130, 430, 
	 	//      Color.GREEN, true ) );  
		//g2.fillArc(87, 178, 130, 50, -152, 130);
		g2.drawString("Arcs", 250, 175);	
		
		Ellipse2D.Double hatFuzz = new Ellipse2D.Double(132, 75, 40, 15);
		g2.setColor(Color.YELLOW);
		g2.draw(hatFuzz);
		g2.fill(hatFuzz);

		g2.setColor(Color.BLACK);
		g2.drawRoundRect(50, 300, 100, 50, 10, 10);
		g2.drawString("Rectangle with rounded corners", 250, 325);	

		
	    // draw 2D ellipse filled with a blue-yellow gradient
		Ellipse2D.Double gradientEllipse = new Ellipse2D.Double(100, 400, 100, 100);
	    g2.setPaint( new GradientPaint( 100, 400, Color.BLUE, 130, 430, 
	       Color.YELLOW, true ) );  
	    g2.fill(gradientEllipse);	    
		g2.setColor(Color.BLACK);
		g2.drawString("Circle filled with a gradient of blue/yellow", 250, 425);	

	}

	public void drawGrid(Graphics2D g2)
	{
		// The following two for loops draw a grid on the screen to help you 
		// position your object.  Once you have finished your object, you can 
		// comment out the two for loops
		
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

