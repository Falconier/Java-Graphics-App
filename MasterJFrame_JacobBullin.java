package graphicalapps;

import javax.swing.JFrame;

public class MasterJFrame_JacobBullin extends JFrame
{
	public static int	gPWidth;
	public static int	gPHeight;
	public static int	mWidth;
	public static int	mHeight;

	public MasterJFrame_JacobBullin(int width, int height, String frameTitle)
	{
		super.setSize(width, height);
		super.setTitle(frameTitle);

		mWidth = width;
		mHeight = height;
		gPWidth = width;
		gPHeight = height;
	}

	public MasterJFrame_JacobBullin(int width, int height, String frameTitle, int graphPaperWidth, int graphPaperHeight)
	{
		super.setSize(width, height);
		super.setTitle(frameTitle);

		gPWidth = graphPaperWidth;
		gPHeight = graphPaperHeight;
		mWidth = width;
		mHeight = height;
	}

	private void convertPointsGPtoM(int a, int b)
	{
		double c = (double) a / gPWidth;
		double d = (double) b / gPHeight;
		double e = mWidth * c;
		int Ie = (int) e;
		double f = mHeight * d;
		int If = (int) f;
	}

	public void addPointGP(int gpX, int gpY)
	{
		convertPointsGPtoM(gpX, gpY);
	}
}
