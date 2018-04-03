package graphicalapps;

import javax.swing.JFrame;

public class TiltedShapeViewer
{
	public static void main(String [] args)
	{
		JFrame frame = new JFrame();	//Instantiate new frame
		frame.setSize(600, 800);		//Set frame size
		frame.setTitle("Tilted Shapes");		//Set frame title
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		TiltedShapeComponent component = new TiltedShapeComponent();  //Instantiate component
		frame.add(component);		//Add component to frame
		frame.setVisible(true);		//Set frame visible
	}
}