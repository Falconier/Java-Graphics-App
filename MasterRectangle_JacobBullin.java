package graphicalapps;

import java.awt.Rectangle;

public class MasterRectangle_JacobBullin extends Rectangle
{
	public int	area;
	public int	perimeter;

	public MasterRectangle_JacobBullin(int x, int y, int width, int height)
	{
		super(x, y, width, height);
		area = width * height;
		perimeter = (2 * width) + (2 * height);
		super.setLocation(x, y);
		super.setSize(width, height);
	}

	public MasterRectangle_JacobBullin(int x1, int y1, int x2, int y2, int a)
	{
		if (a == 0)
		{
			super.setLocation(x1, y1);
			super.setSize((x2 - x1), (y2 - y1));
		}
		else if (a == 1)
		{
			super.setLocation(x1, y2);
			super.setSize((x1 - x2), (y1 - y2));
		}
	}

	public int getArea()
	{
		return area;
	}

	public void printArea()
	{
		System.out.println("Area = " + getArea());
	}

	public int getPerimeter()
	{
		return perimeter;
	}

	public void printPerimeter()
	{
		System.out.println("Perimeter = " + getPerimeter());
	}

	public String getDimensions()
	{
		String dim = "" + width + " x " + height;
		return dim;
	}

	public void printDimensions()
	{
		System.out.println("Dimensions = " + getDimensions());
	}

	public void printRectangleInfo()
	{
		printDimensions();
		printArea();
		printPerimeter();
	}

}
