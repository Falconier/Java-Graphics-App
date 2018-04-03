package graphicalapps;

import javax.swing.JFrame;
import java.awt.Font;

public class GraphicalApplication_JavaIcon_Tester_JacobBullin
{

	public static void main(String[] args)
	{
		MasterJFrame_JacobBullin frame = new MasterJFrame_JacobBullin(524, 536,
				"Coding At The Coffee Shop (Jacob Emory Bullin)", 70, 70);
		// Coding At The Coffee Shop
		// frame.setSize(524, 536);
		// frame.setTitle("Coding At The Coffee Shop");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GraphicalApplication_JavaIcon_JacobBullin picture = new GraphicalApplication_JavaIcon_JacobBullin();
		picture.setFont(new Font("Noteworthy", Font.PLAIN, 12));
		frame.getContentPane().add(picture);
		frame.setVisible(true);
	}
}