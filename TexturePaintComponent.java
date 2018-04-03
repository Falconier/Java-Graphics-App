package graphicalapps;

import java.awt.BasicStroke;
import java.awt.Color;		//color class 
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;	//primitive graphics class 
import java.awt.Graphics2D; 	//Extends Graphics class
import java.awt.Polygon;
import java.awt.Rectangle;	//Rectangles class
import java.awt.TexturePaint;
import java.awt.geom.Ellipse2D;  //Ellipse and circle class
import java.awt.geom.Line2D; 	//Line class
import java.awt.image.BufferedImage;

import javax.swing.JPanel;
import javax.swing.JComponent;

public class TexturePaintComponent extends JComponent
{
	//Place drawing instructions inside this method
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;  //Make graphics 2D

		//drawGrid(g2);  //Draw grid to make it easier to create component

		Rectangle rect = new Rectangle(40, 40, 300, 200);
		BufferedImage bi;
		Graphics2D big;

		// Holds the coordinates of the user's last mousePressed event.
		int last_x, last_y;
		boolean firstTime = true;
		TexturePaint fillPolka, strokePolka;
		Rectangle area;
		
        // Creates the fill texture paint pattern.
        bi = new BufferedImage(5, 5, BufferedImage.TYPE_INT_RGB);
        big = bi.createGraphics();
        big.setColor(Color.pink);
        big.fillRect(0, 0, 7, 7);
        big.setColor(Color.cyan);  
        big.fillOval(0, 0, 3, 3);
        Rectangle r = new Rectangle(0,0,5,5);
        fillPolka = new TexturePaint(bi, r);  
        big.dispose();
        
        //Creates the stroke texture paint pattern.
        bi = new BufferedImage(5, 5, BufferedImage.TYPE_INT_RGB);
        big = bi.createGraphics();
        big.setColor(Color.cyan);
        big.fillRect(0, 0, 7, 7);
        big.setColor(Color.pink);
        big.fillOval(0, 0, 3, 3);
        r = new Rectangle(0,0,5,5);
        strokePolka = new TexturePaint(bi, r);
        big.dispose();
        
		g2.setStroke(new BasicStroke(8.0f));


	        // Clears the rectangle that was previously drawn.
		g2.setPaint(Color.white);
		g2.fillRect(20, 20, 500, 600);
			
                // Draws and fills the newly positioned rectangle.
		g2.setPaint(strokePolka);
		g2.draw(rect);
		g2.setPaint(fillPolka);
		g2.fill(rect);


        



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
