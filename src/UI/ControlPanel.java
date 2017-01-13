/*  Eric McAlpine
    ControlPanel.java
    created 4-20-2016
    
    purpose: Panel that 
*/

import javax.swing.*;
import ActionListeners.Control_AL;

public class ControlPanel extends JPanel{

	// Variable Dictionary 
	JPanel pane_Basic;
	JButton btn_PlayPause;
	//JLabel
	//JTextArea
	
	public ControlPanel()
	{
		drawPanel();
	}
	
	void drawPanel()
	{
		Control_AL controlAl = new Control_AL();
		this.setSize(400, 400);;
		
		btn_PlayPause = new JButton("Play / Pause");
		btn_PlayPause.addActionListener(controlAl);
		
		this.add(btn_PlayPause);
	}
}
