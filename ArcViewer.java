package graphicalapps;

import java.awt.Color;

import javax.swing.JFrame;

public class ArcViewer
{
	public static void main(String [] args)
	{
		JFrame frame = new JFrame();	//Instantiate new frame	
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setSize(400, 600);		//Set frame size
		frame.setTitle("Arc Examples");		//Set frame title
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ArcComponent component = new ArcComponent();  //Instantiate component
		frame.add(component);		//Add component to frame
		frame.setVisible(true);		//Set frame visible
	}
}