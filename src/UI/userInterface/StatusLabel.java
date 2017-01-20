package userInterface;

import javax.swing.JLabel;

public class StatusLabel{

	static JLabel label = new JLabel();
	
	public static JLabel getInstance() {
		// TODO Auto-generated method stub
		return label;
	}
	
	public static void initializeStatus()
	{
		label.setSize(200, 50);
		label.setText("Initial Load");
	}
	
	public static void setText(String str)
	{
		label.setText(str);
	}

}
