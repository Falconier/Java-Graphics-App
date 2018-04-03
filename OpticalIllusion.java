package graphicalapps;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

import javax.swing.JComponent;

public class OpticalIllusion extends JComponent
{
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		
		drawOptical1(g2);
	}
	public void drawOptical1(Graphics2D g2)
	{
		int x1 = 28;
		int x2 = 39;
		int y1 = 45;
		int y2 = 31;
		int a1 = x1+28;
		int a2 = x2+28;
		int b1 = y1;
		int b2 = y2;
		//39,330
		//70,316
		//x1-=28;
		//x2-=28;
		//y1-=45;
		//y2-=45;
		Line2D.Double a;
		Line2D.Double c;
		for(int b = 0;b<=25;b++)
		{
			g2.setStroke(new BasicStroke(2));
			a = new Line2D.Double(x1, y1, x2, y2);
			c = new Line2D.Double(a1, b1, a2, b2);
			x1+=4;
			x2+=3;
			y1+=3;
			y2+=4;
			a1+=4;
			a2+=3;
			b1+=3;
			b2+=4;
			g2.draw(a);
			g2.draw(c);
		}
	}	
}
