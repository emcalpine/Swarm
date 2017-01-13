/*  Eric McAlpine
    Sandbox.java
    created 4-20-2016
    
    purpose: The sandbox where everything is displayed
    
*/

import javax.swing.*;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

public class Sandbox extends JPanel{
	
	// Variable Dictionary
	
	
	// Default Constructor
	public Sandbox()
	{
		setBorder(BorderFactory.createLineBorder(Color.black));
	}
	
	public Dimension getPreferredSize()
	{
		return new Dimension(400, 400);
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
	}
	
	public void paintOom(Oom o)
	{
		// Get oom location / direction
		
		// repaint Oom
	}
}
