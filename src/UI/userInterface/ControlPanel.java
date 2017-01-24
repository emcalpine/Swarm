package userInterface;


import java.awt.GridLayout;
import javax.swing.*;

import ActionListeners.Control_AL;

public class ControlPanel extends JPanel{

	// Variable Dictionary 
	JButton btn_PlayPause;
	JButton btn_AddOom;
	//JLabel
	//JTextArea
	
	public ControlPanel()
	{
		drawPanel();
	}
	
	void drawPanel()
	{
		Control_AL controlAl = new Control_AL();
		this.setSize(400, 400);
		this.setLayout(new GridLayout(0,2));
		
		JLabel s = StatusLabel.getInstance();
		StatusLabel.initializeStatus();
		
		btn_PlayPause = new JButton("Play / Pause");
		btn_PlayPause.addActionListener(controlAl);
		
		btn_AddOom = new JButton("Add Oom");
		btn_AddOom.addActionListener(controlAl);

		this.add(s);
		this.add(btn_PlayPause);
		this.add(btn_AddOom);
	}
}
