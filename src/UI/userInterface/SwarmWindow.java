package userInterface;


import java.awt.*;
import javax.swing.*;
import ActionListeners.Menu_AL;
import foundation.OomIdStack;

public class SwarmWindow
{
	// Constants declarations
	static final String WINDOW_NAME = "Swarm Simulation";
	
	// Variable Dictionary
	JFrame frame;
	JMenuBar menuBar;
	JMenu windowMenu, controlsMenu, aboutMenu;
	JMenuItem menuItem_Clean, menuItem_Exit;
	JMenuItem menuItem_Help, menuItem_Keymap;
	JMenuItem menuItem_About;
	
	Menu_AL menuActionListener;
	
	
	ControlPanel ctrlPanel;
	Sandbox sandbox;	
	
	
	public SwarmWindow()
	{
		frame = new JFrame(WINDOW_NAME);
		frame.setLayout(new GridLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		buildMenus();
		buildControlPanel();
		buildSandbox();
		
		OomIdStack.initialize();
		
		// Display
		frame.pack();
		frame.setVisible(true);
	}
	
	
	// This operation initializes and assembles the menu structure.
	public void buildMenus()
	{
		// Declare action listeners
		menuActionListener = new Menu_AL();
		
		menuBar = new JMenuBar();
		
		// Window Menu
		windowMenu = new JMenu("Window");
		menuBar.add(windowMenu);
		menuItem_Clean = new JMenuItem("Clean");
		menuItem_Exit = new JMenuItem("Exit");
		menuItem_Clean.addActionListener(menuActionListener);
		menuItem_Exit.addActionListener(menuActionListener);
		windowMenu.add(menuItem_Clean);
		windowMenu.add(menuItem_Exit);
		
		// Controls Menu
		controlsMenu = new JMenu("Controls");
		menuBar.add(controlsMenu);
		menuItem_Help = new JMenuItem("Help");
		menuItem_Keymap = new JMenuItem("Keymap");
		menuItem_Help.addActionListener(menuActionListener);
		menuItem_Keymap.addActionListener(menuActionListener);
		controlsMenu.add(menuItem_Help);
		controlsMenu.add(menuItem_Keymap);
		
		// About Menu
		aboutMenu = new JMenu("About");
		menuBar.add(aboutMenu);
		menuItem_About = new JMenuItem("About");
		menuItem_About.addActionListener(menuActionListener);
		aboutMenu.add(menuItem_About);
		
		// Add Menu to frame
		frame.setJMenuBar(menuBar);
	}
	
	public void buildControlPanel()
	{
		ctrlPanel = new ControlPanel();
		
		frame.add(ctrlPanel);
	}
	
	public void buildSandbox()
	{
		sandbox = new Sandbox();
		
		frame.add(sandbox);
	}
	
	public static void main(String[] args)
	{
		new SwarmWindow();
	}
}