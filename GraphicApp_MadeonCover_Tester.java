package graphicalapps;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class GraphicApp_MadeonCover_Tester
{
	public static void main(String[] args)
	{
		MasterJFrame_JacobBullin frame = new MasterJFrame_JacobBullin(1280, 1006, "Madeon_Adventure Album Cover");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GraphicApp_MadeonCover cover = new GraphicApp_MadeonCover();
		frame.add(cover);
		frame.setVisible(true);
	}
}
