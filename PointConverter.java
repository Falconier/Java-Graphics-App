package graphicalapps;

public class PointConverter
{
	public static void convertPointGP(int a, int b)
	{
		double c = (double) a/MasterJFrame_JacobBullin.gPWidth;
		double d = (double) b/MasterJFrame_JacobBullin.gPHeight;
		double e = MasterJFrame_JacobBullin.mWidth*c;
		int Ie = (int) e;
		double f = MasterJFrame_JacobBullin.mHeight*d;
		int If = (int) f;
		System.out.print("" + Ie + ", " + If);
	}
}
