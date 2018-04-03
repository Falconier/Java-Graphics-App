package graphicalapps;

import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.QuadCurve2D;

import javax.swing.JComponent;

public class GraphicalApplication_JavaIcon_JacobBullin extends JComponent
{
	public Color	NAPKINBLUE		= new Color(125, 147, 190);
	public Color	PENCILEYELLOW1	= new Color(254, 250, 69);
	public Color	COFFEE			= new Color(49, 34, 21);
	public Color	OFFWHITE1		= new Color(218, 218, 218);
	public Color	OFFGRAY1		= new Color(128, 128, 128);
	public Paint	GRADIENT1		= new GradientPaint(276, 160, OFFGRAY1, 112, 160, OFFWHITE1, true);
	public Color	THELEAD			= new Color(48, 48, 47);
	public Color	BROWN1			= new Color(182, 156, 93);
	public Color	BROWN2			= new Color(185, 155, 88);
	public Paint	GRADIENT2		= new GradientPaint(323, 309, BROWN1, 335, 289, BROWN2, true);
	public Color	BACKGROUNDCOLOR	= new Color(239, 239, 239);

	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;

		// g2.setBackground(Color.BLACK);
		g2.translate(20, 0);
		// drawGrid(g2);
		drawNapkin(g2);
		drawPencil(g2);
		drawCup(g2);
		drawTheCoffee(g2);
		drawLead(g2);
		drawWood(g2);
		drawCode(g2);
		drawHandle(g2);
		// drawLeftEdge(g2);
		// drawRightEdge(g2);
		// drawGrid(g2);
	}

	public void drawGrid(Graphics2D g2)
	{
		g2.setColor(Color.LIGHT_GRAY);
		for (int i = 50; i <= 600; i = i + 10)
		{
			int a = i;
			AffineTransform horizontal = g2.getTransform();
			g2.drawString("" + i, 5, i);
			Line2D.Double horizonalLine = new Line2D.Double(5, i, 700, i);
			g2.draw(horizonalLine);
			g2.rotate(Math.toRadians(90), i, 10);
			g2.drawString("" + a, i, 10);
			g2.setTransform(horizontal);
			Line2D.Double verticalLine = new Line2D.Double(i, 10, i, 700);
			g2.draw(verticalLine);
		}
	}

	public void drawNapkin(Graphics2D g2)
	{
		g2.setColor(NAPKINBLUE);
		MasterPolygon_JacobBulln napkin = new MasterPolygon_JacobBulln();
		napkin.addPointGP(30, 60);
		napkin.addPointGP(60, 37);
		napkin.addPointGP(31, 23);
		napkin.addPointGP(1, 37);
		g2.fill(napkin);

		g2.setColor(Color.LIGHT_GRAY);
		MasterPolygon_JacobBulln napkinBdr = new MasterPolygon_JacobBulln();
		g2.draw(napkin);
		napkinBdr.addPointGP(5, 35);
		napkinBdr.addPointGP(30, 52);
		napkinBdr.addPointGP(55, 35);
		napkinBdr.addPointGP(30, 52);
		// g2.draw(napkinBdr);
	}

	public void drawPencil(Graphics2D g2)
	{
		g2.setColor(PENCILEYELLOW1);
		/*
		 * MasterPolygon_JacobBullin pencilMiddle = new
		 * MasterPolygon_JacobBullin();
		 * pencilMiddle.addPointGP(50, 5);
		 * pencilMiddle.addPointGP(53, 5);
		 * pencilMiddle.addPointGP(53, 39);
		 * pencilMiddle.addPointGP(50, 39);
		 */
		GPRectangle_JacobBullin pencil = new GPRectangle_JacobBullin(50, 5, 3, 34);
		GPRectangle_JacobBullin eraser = new GPRectangle_JacobBullin(50, 3, 3, 5);
		Rectangle band = eraser.intersection(pencil);
		// g2.fill(pencil);
		AffineTransform old = g2.getTransform();
		// g2.rotate(Math.toRadians(30), pencilMiddle.getCenterX(5, 39),
		// pencilMiddle.getCenterY(50, 53));
		g2.rotate(Math.toRadians(30), pencil.getCenterX(), pencil.getCenterY());
		// g2.fill(pencilMiddle);
		g2.translate(15, 0);
		g2.fill(pencil);

		// g2.setTransform(old);
		g2.setColor(new Color(229, 73, 68));

		// MasterPolygon_JacobBullin eraser = new MasterPolygon_JacobBullin();
		// eraser.addPoint(453, 57);
		// eraser.addPoint(472, 68);
		// eraser.addPoint(481, 50);
		// eraser.addPoint(463, 40);
		g2.fill(eraser);
		g2.setColor(new Color(198, 199, 199));
		g2.fill(band);
		g2.setTransform(old);
	}

	public void drawCup(Graphics2D g2)
	{

		g2.setPaint(GRADIENT1);
		// QuadCurve2D.Double cup = new
		// QuadCurve2D.Double(37,145,157,435,276,145);;
		// g2.drawLine(37, 180, 37, 147);
		// g2.drawLine(276, 180, 276, 147);
		// g2.setPaint(new GradientPaint(37, 70, Color.LIGHT_GRAY, 239, 70,
		// Color.WHITE, true));
		g2.fillArc(37, 70, 239, 210, 180, 180);
		Rectangle topOfCup = new Rectangle(37, 147, 239, 33);
		g2.fill(topOfCup);
		// g2.draw(cup);
		// g2.fill(cup);
		g2.setColor(OFFWHITE1);
		Ellipse2D.Double topOfMug = new Ellipse2D.Double(37, 91, 239, 107);
		g2.fill(topOfMug);
	}

	public void drawTheCoffee(Graphics2D g2)
	{
		g2.setColor(COFFEE);
		Ellipse2D.Double theCoffee = new Ellipse2D.Double(52, 122, 209, 68);
		g2.fill(theCoffee);
	}

	public void drawWood(Graphics2D g2)
	{
		g2.setPaint(GRADIENT2);
		MasterPolygon_JacobBulln wood = new MasterPolygon_JacobBulln();
		wood.addPoint(319, 309);
		wood.addPoint(323, 312);
		wood.addPoint(342, 292);
		wood.addPoint(323, 281);
		g2.fill(wood);
	}

	public void drawLead(Graphics2D g2)
	{
		// g2.setPaint(paint);
		MasterPolygon_JacobBulln lead = new MasterPolygon_JacobBulln();
		lead.addPoint(319, 308);
		lead.addPoint(323, 311);
		lead.addPoint(316, 320);
		// g2.translate(13, 7);
		g2.fill(lead);
	}

	public void drawCode(Graphics2D g2)
	{
		g2.setColor(Color.BLACK);
		Font font = new Font("Handwriting - Dakota", Font.BOLD, 25);
		g2.setFont(font);
		AffineTransform old = g2.getTransform();
		g2.rotate(Math.toRadians(-30), 137, 360);
		g2.translate(14, 10);
		g2.drawString("main ( ) {", 142, 344);
		g2.drawString("}", 176, 374);
		g2.drawString("public sta", 180, 414);
		g2.setTransform(old);
	}

	public void drawHandle(Graphics2D g2)
	{
		/*
		 * MasterPolygon_JacobBullin handle = new MasterPolygon_JacobBullin();
		 * handle.addPointGP(37, 19);
		 * handle.addPointGP(38, 18);
		 * handle.addPointGP(39, 18);
		 * handle.addPointGP(40, 17);
		 */
		// g2.draw(handle);
		// use a quadcurve
		g2.setColor(OFFWHITE1);
		g2.fillArc(274, 140, 52, 30, 0, 180);
		MasterRectangle_JacobBullin filler1 = new MasterRectangle_JacobBullin(276, 152, 50, 10);
		// PolyRectangle filler2 = new PolyRectangle(277,170,287,154,"");
		MasterPolygon_JacobBulln filler3 = new MasterPolygon_JacobBulln();
		filler3.addPoint(276, 170);
		filler3.addPoint(283, 161);
		filler3.addPoint(276, 161);
		g2.fill(filler3);
		AffineTransform old = g2.getTransform();
		g2.fill(filler1);
		// g2.fill(filler2);
		QuadCurve2D filler4 = new QuadCurve2D.Double(322, 161, 320, 229, 256, 233);
		g2.draw(filler4);
		QuadCurve2D filler5 = new QuadCurve2D.Double(326, 161, 323, 232, 256, 237);
		QuadCurve2D filler6 = new QuadCurve2D.Double(323, 161, 321, 229, 256, 234);
		QuadCurve2D filler7 = new QuadCurve2D.Double(324, 161, 322, 230, 256, 236);
		QuadCurve2D filler8 = new QuadCurve2D.Double(325, 161, 322, 230, 256, 236);
		// g2.clip(filler1);
		g2.draw(filler5);
		g2.draw(filler6);
		g2.draw(filler7);
		g2.setStroke(new BasicStroke(4));
		g2.draw(filler8);
		g2.setColor(BACKGROUNDCOLOR);
		g2.fillArc(283, 148, 38, 30, 0, 180);
	}

	public void drawLeftEdge(Graphics2D g2)
	{
		Rectangle a;
		int x = 37;
		int y = 269;
		// int z = 1;
		for (int b = 0; b <= 125; b++)
		{
			a = new Rectangle(x, y, 2, 35);
			AffineTransform old = g2.getTransform();
			// if(z==1)
			// {
			// AffineTransform old = g2.getTransform();
			// z=0;
			// }
			g2.rotate(Math.toRadians(50), a.getCenterX(), a.getCenterY());
			g2.fill(a);
			g2.setTransform(old);
			x += 2;
			y += 1;
		}
	}

	public void drawLeftEdge1(Graphics2D g2)
	{
		int x1 = 39;
		int x2 = 70;
		int y1 = 330;
		int y2 = 316;
		x1 -= 28;
		x2 -= 28;
		y1 -= 45;
		y2 -= 45;
		Line2D.Double a;
		for (int b = 0; b <= 50; b++)
		{
			g2.setStroke(new BasicStroke(3));
			a = new Line2D.Double(x1, y1, x2, y2);
			x1 += 4;
			x2 += 3;
			y1 += 3;
			y2 += 4;
			g2.draw(a);
		}
	}
}
