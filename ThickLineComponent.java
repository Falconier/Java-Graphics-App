package graphicalapps;

import java.awt.BasicStroke;
import java.awt.Color;		//color class 
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;	//primitive graphics class 
import java.awt.Graphics2D; 	//Extends Graphics class
import java.awt.Polygon;
import java.awt.Rectangle;	//Rectangles class
import java.awt.geom.Ellipse2D;  //Ellipse and circle class
import java.awt.geom.Line2D; 	//Line class
import javax.swing.JPanel;
import javax.swing.JComponent;

public class ThickLineComponent extends JComponent
{
	//Place drawing instructions inside this method
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;  //Make graphics 2D

		drawGrid(g2);  //Draw grid to make it easier to create component
		
		g2.setColor(Color.RED);	
		g2.setStroke(new BasicStroke(20));
		Line2D.Double line = new Line2D.Double(100, 100, 200, 200); 	//Construct left eye (x1, y1, x2, y2)
		g2.draw(line);
		line = new Line2D.Double(200, 200, 350, 200); 	//Construct left eye (x1, y1, x2, y2)
		g2.draw(line);
		line = new Line2D.Double(350, 200, 450, 100); 	//Construct left eye (x1, y1, x2, y2)
		g2.draw(line);

		g2.setColor(new Color(200, 105, 55));
		g2.setStroke(new BasicStroke(10));
		Polygon quad = new Polygon();
		quad.addPoint(150, 300);
		quad.addPoint(250, 320);
		quad.addPoint(280, 500);
		quad.addPoint(120, 400);
		g2.fill(quad);
		g2.setColor(Color.BLACK);
		g2.setStroke(new BasicStroke(10));
		g2.draw(quad);
		
		g2.setPaint(new GradientPaint(100, 600, Color.BLUE, 500, 600, Color.GREEN, true));
		Font font = new Font("Lucida Calligraphy", Font.BOLD, 20); 
		g2.setFont(font);
		g2.drawString("AP Computer Science",100,600);
		font = new Font("Algerian", Font.BOLD, 30); 
		g2.setFont(font);
		g2.drawString("AP Computer Science",100,650);
		g2.setColor(Color.MAGENTA);
		font = new Font("Trebuchet", Font.BOLD, 40); 
		g2.setFont(font);
		g2.drawString("AP Computer Science",100,700);


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
