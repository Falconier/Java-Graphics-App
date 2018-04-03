package graphicalapps;

import java.awt.BasicStroke;
import java.awt.Color;		//color class 
import java.awt.Graphics;	//primitive graphics class 
import java.awt.Graphics2D; 	//Extends Graphics class
import java.awt.Polygon;
import java.awt.Rectangle;	//Rectangles class
import java.awt.geom.Ellipse2D;  //Ellipse and circle class
import java.awt.geom.Line2D; 	//Line class
import javax.swing.JPanel;
import javax.swing.JComponent;

public class PolygonComponent extends JComponent
{
	//Place drawing instructions inside this method
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;  //Make graphics 2D

		drawGrid(g2);  //Draw grid to make it easier to create component
		
		g2.setColor(Color.RED);	
		//g2.setStroke(new BasicStroke(20));
		Polygon poly = new Polygon();
		poly.addPoint(123, 200);
		poly.addPoint(150, 250);
		poly.addPoint(100, 220);
		poly.addPoint(200, 200);
		//g2.draw(poly);
		g2.fill(poly);
		
		g2.setColor(new Color(120, 67, 200));
		Polygon triangle = new Polygon();
		triangle.addPoint(300, 200);
		triangle.addPoint(360, 240);
		triangle.addPoint(330, 350);
		g2.fill(triangle);
		
		g2.setColor(new Color(200, 105, 55));
		Polygon quad = new Polygon();
		quad.addPoint(150, 400);
		quad.addPoint(250, 420);
		quad.addPoint(280, 600);
		quad.addPoint(120, 500);
		g2.fill(quad);
		
		

		//g2.drawString("Hello, Class!!!", 5, 175);		//Draw greeting (�message�, x, y)

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
