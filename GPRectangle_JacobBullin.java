package graphicalapps;

import java.awt.Rectangle;

public class GPRectangle_JacobBullin extends Rectangle
{
	public int	xPos;
	private int	xpos1;
	public int	yPos;
	private int	ypos1;
	public int	gpWidth;
	private int	w1;
	public int	gpHeight;
	private int	h1;

	public int	IC;
	public int	ID;
	public int	IG;
	public int	IH;

	/**
	 * Draws a rectangle based on a graph paper drawing
	 * 
	 * @param x the x position on the graph paper
	 * @param y the y position on the graph paper
	 * @param width the width of the rectangle on the graph paper
	 * @param height the height of the rectangle on the graph paper
	 */
	public GPRectangle_JacobBullin(int x, int y, int width, int height)
	{
		// super(x,y,width,height);
		xpos1 = x;
		ypos1 = y;
		w1 = width;
		h1 = height;
		convertRectangletoGPRectangle();
		// super.resize(IC, ID, IG, IH);
		super.setLocation(IC, ID);
		super.setSize(IG, IH);
	}

	public void convertRectangletoGPRectangle()
	{
		double a = (double) xpos1 / MasterJFrame_JacobBullin.gPWidth;
		double b = (double) ypos1 / MasterJFrame_JacobBullin.gPHeight;
		double c = MasterJFrame_JacobBullin.mWidth * a;
		int Ic = (int) c;
		IC = Ic;
		double d = MasterJFrame_JacobBullin.mHeight * b;
		int Id = (int) d;
		ID = Id;
		double e = (double) w1 / MasterJFrame_JacobBullin.gPWidth;
		double f = (double) h1 / MasterJFrame_JacobBullin.gPHeight;
		double g = MasterJFrame_JacobBullin.mWidth * e;
		int Ig = (int) g;
		IG = Ig;
		double h = MasterJFrame_JacobBullin.mHeight * f;
		int Ih = (int) h;
		IH = Ih;
	}
}
