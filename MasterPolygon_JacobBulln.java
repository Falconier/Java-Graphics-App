package graphicalapps;

import java.awt.Polygon;

public class MasterPolygon_JacobBulln extends Polygon
{
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

	public int getCenterX(int topPoint, int bottomPoint)
	{
		int a = bottomPoint - topPoint;
		int b = a / 2;
		return b;
	}

	public int getCenterY(int leftMostPoint, int rightMostPoint)
	{
		int c = rightMostPoint - leftMostPoint;
		int d = c / 2;
		return d;
	}

	/*
	 * public void getCenter(int a, int b)
	 * {
	 * }
	 */

}
