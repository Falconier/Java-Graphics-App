package graphicalapps;

import javax.swing.JFrame;

public class QuadCurveViewer
{
	public static void main(String [] args)
	{
		JFrame frame = new JFrame();	//Instantiate new frame	
		frame.setSize(500, 700);		//Set frame size
		frame.setTitle("Polygon Examples");		//Set frame title
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		QuadCurveComponent component = new QuadCurveComponent();  //Instantiate component
		frame.add(component);		//Add component to frame
		frame.setVisible(true);		//Set frame visible
	}
}