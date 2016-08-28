/*	Eric McAlpine
 * 	Menu_AL.java
 *	
 *	Purpose: perform the actions expected from the menu items.
 */


package ActionListeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;

public class Menu_AL implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		JMenuItem source = (JMenuItem)(e.getSource());
		
		System.out.println("Menu_AL::actionPerformed:  source [" + source.getText() + "]");
		switch(source.getText())
		{
			// Window menu items
			case "Clean":
				action_Clean();
				break;
			case "Exit":
				action_Exit();
				break;
				
			// Controls menu items
			case "Help":
				//display pop-up window with control help
				action_Help();
				break;
			case "Keymap":
				//display pop-up window where the user can remap controls
				action_Keymap();
				break;
			
			// About menu items
			case "About":
				//display information about the simulator.
				action_About();
				break;
			default:
				// Should not reach. printout error
				System.out.println("Invalid JMenuItem value: " + source.getText());
				break;
		}
	}
	
	void action_Clean()
	{
		
	}
	
	void action_Exit()
	{
		System.exit(0);
	}
	
	void action_Help()
	{
		
	}
	
	void action_Keymap()
	{
		
	}
	
	void action_About()
	{
		
	}

}
