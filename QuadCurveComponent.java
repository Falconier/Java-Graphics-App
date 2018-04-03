/* QuadCurve2D.Double
public QuadCurve2D.Double(double x1,     // x coordinate of beginning of curve
                          double y1,     // y coordinate of beginning of curve
                          double ctrlx,  // x coordinate of focal point 
                          double ctrly,  // y coordinate of focal point
                          double x2,     // x coordinate of endpoint of curve
                          double y2)     // y coordinate of endpoint of curve
Constructs and initializes a QuadCurve2D from the specified coordinates. 
*/

package graphicalapps;

import java.awt.BasicStroke;
import java.awt.Color;		//color class 
import java.awt.Graphics;	//primitive graphics class 
import java.awt.Graphics2D; 	//Extends Graphics class
import java.awt.Polygon;
import java.awt.Rectangle;	//Rectangles class
import java.awt.geom.Ellipse2D;  //Ellipse and circle class
import java.awt.geom.Line2D; 	//Line class
import java.awt.geom.QuadCurve2D;

import javax.swing.JPanel;
import javax.swing.JComponent;

public class QuadCurveComponent extends JComponent
{
	//Place drawing instructions inside this method
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;  //Make graphics 2D

		drawGrid(g2);  //Draw grid to make it easier to create component
		
		g2.setColor(Color.BLACK);	

		QuadCurve2D antenna1 = new QuadCurve2D.Double(225, 210, 225, 125, 150, 50);
		g2.draw(antenna1);
		
		QuadCurve2D antenna2 = new QuadCurve2D.Double(275, 210, 275, 125, 350, 50);
		g2.fill(antenna2);
		
		g2.setColor(Color.RED);	
		g2.setStroke(new BasicStroke(10));
		QuadCurve2D smile = new QuadCurve2D.Double(100, 400, 250, 600, 400, 400);
		g2.draw(smile);
		
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
