package ActionListeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import userInterface.StatusLabel;

import javax.swing.JButton;

import stuff.SystemSettings;

public class Control_AL implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {

		JButton source = (JButton)(e.getSource());
		System.out.println("Menu_AL::actionPerformed:  source [" + source.getText() + "]");

		switch (source.getText())
		{
			case "Play / Pause":
				if (SystemSettings.isPlaying)
				{
					StatusLabel.setText("Pause");
				}
				else
				{
					StatusLabel.setText("Play");
				}
				SystemSettings.isPlaying = !(SystemSettings.isPlaying);
				break;
			default:
				
				break;
		}

	}

}
