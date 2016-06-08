/*  Eric McAlpine
    ControlPanel.java
    created 4-20-2016
    
    purpose: Panel that houses all the controls used for interacting with the ooms.
*/

import javax.swing.*;

public class ControlPanel extends JPanel{

	// Variable Dictionary 
	JButton btn_playPause, btn_speed;
	JLabel lbl_statusLabel;
	JTextBox txt_speed;
	
	public ControlPanel()
	{
		// Initialize objects
		btn_playPause = new JButton();
		btn_speed = new JButton();
		
		lbl_statusLabel = new JLabel("Status Label");
		
		txt_speed = new JTextBox();
		
		// Add action listeners
		// NOTE: May need to add status label reference to Menu_AL instantiation,
		//       so that it knows where to output.
		
		// Add/organize objects to panel
		// currently NO CLUE how to do this. 
		//CelsiusConverterGUI.java tutorial on Oracle's page might help.
		
	}
}
