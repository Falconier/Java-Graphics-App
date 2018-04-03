package graphicalapps;

import java.awt.Polygon;

public class PolyRectangle_JacobBullin extends Polygon
{
	public String	typeOfCord;
	public int		X1;
	public int		Y1;
	public int		X2;
	public int		Y2;
	public double	Xcenter;
	public double	Ycenter;

	public PolyRectangle_JacobBullin(int x1, int y1, int x2, int y2, String type)
	{
		typeOfCord = type;
		X1 = x1;
		X2 = x2;
		Y1 = y1;
		Y2 = y2;

		if (typeOfCord.equals("gp"))
		{
			this.addPointGP(X1, Y1);
			this.addPointGP(X2, Y1);
			this.addPointGP(X2, Y2);
			this.addPointGP(X1, Y2);
		}
		else if (typeOfCord.equals(""))
		{
			this.addPoint(X1, Y1);
			this.addPoint(X2, Y1);
			this.addPoint(X2, Y2);
			this.addPoint(X1, Y2);
		}
		else if (!typeOfCord.equals("") || !typeOfCord.equals("gp"))
		{
			this.addPoint(X1, Y1);
			this.addPoint(X2, Y1);
			this.addPoint(X2, Y2);
			this.addPoint(X1, Y2);
		}
	}

	private void convertPointsGPtoM(int a, int b)
	{
		double c = (double) a / MasterJFrame_JacobBullin.gPWidth;
		double d = (double) b / MasterJFrame_JacobBullin.gPHeight;
		double e = MasterJFrame_JacobBullin.mWidth * c;
		int Ie = (int) e;
		double f = MasterJFrame_JacobBullin.mHeight * d;
		int If = (int) f;
		this.addPoint(Ie, If);
	}

	public void addPointGP(int gpX, int gpY)
	{
		convertPointsGPtoM(gpX, gpY);
	}

	public double getCenterX()
	{
		Xcenter = X1 + ((X2 - X1) / 2);
		return Xcenter;
	}

	public double getCenterY()
	{
		Ycenter = Y1 + ((Y2 - Y1) / 2);
		return Ycenter;
	}
}