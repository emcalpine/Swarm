package ActionListeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import userInterface.*;
import stuff.*;

import javax.swing.JButton;


public class Control_AL implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {

		JButton source = (JButton)(e.getSource());

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
			case "Add Oom":
				
				break;
			default:
				
				break;
		}

	}

}
