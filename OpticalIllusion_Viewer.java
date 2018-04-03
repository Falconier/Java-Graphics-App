package graphicalapps;

import javax.swing.JFrame;

public class OpticalIllusion_Viewer
{

	public static void main(String[] args)
	{
		MasterJFrame_JacobBullin frame = new MasterJFrame_JacobBullin(524, 536, "", 70, 70);
		// Coding At The Coffee Shop
		// frame.setSize(524, 536);
		// frame.setTitle("Coding At The Coffee Shop");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		OpticalIllusion picture = new OpticalIllusion();
		frame.add(picture);
		frame.setVisible(true);
	}

}
