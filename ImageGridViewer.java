package graphicalapps;

import javax.swing.JFrame;

public class ImageGridViewer
{

	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		frame.setSize(512, 512);
		frame.setTitle("JAVA ICON TEMP");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ImageGrid component = new ImageGrid();
		frame.add(component);
		
		frame.setVisible(true);
	}

}
