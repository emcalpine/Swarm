package ActionListeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;

import javax.swing.JMenuItem;

public class ControlPanel_AL implements ActionListener {
	
	// Variable Dictionary
	JLabel lbl_output;
	
	public ControlPanel_AL (JLabel output)
	{
		super();
		lbl_output = output;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton source = (JButton)(e.getSource());
		
		System.out.println("ControlPanel_AL::actionPerformed:  source [" + source.getText() + "]");
		switch(source.getText())
		{
			case "Play/Pause":
				//case "Play":
				//case "Pause":
				
				lbl_output.setText("Play/Pause Pressed");
				break;
			default:
				System.out.println("ControlPanel_AL::actionPerformed: invalid source [" + source.getText() + "]");
				lbl_output.setText("Invalid button press");
				break;
		}

	}
}
