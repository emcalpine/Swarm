/*  Eric McAlpine
    ControlPanel.java
    created 4-20-2016
    
    purpose: Panel that 
*/

import javax.swing.*;

import ActionListeners.ControlPanel_AL;


public class ControlPanel extends JPanel{

	// Variable Dictionary 
	static final int PANEL_WIDTH = 300;
	static final int PANEL_HEIGHT = 700;
	
	JButton btn_PlayPause;
	
	JLabel lbl_Status;
	
	//JTextArea
	
	ControlPanel_AL controlPanelAL;
	
	public ControlPanel()
	{
		setSize(PANEL_WIDTH, PANEL_HEIGHT);
		//TODO: setBorder(border);
		
		buildControls();
	}
	
	private void buildControls()
	{
		lbl_Status = new JLabel("Status");
		
		controlPanelAL = new ControlPanel_AL(lbl_Status);
		
		add(lbl_Status);
		
		btn_PlayPause = new JButton("Play/Pause");
		btn_PlayPause.addActionListener(controlPanelAL);
		// TODO: set button sizes (currently default)
		
		add(btn_PlayPause);
		
	}
}
