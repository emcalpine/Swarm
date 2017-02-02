package stuff;
import foundation.OomCommand;

/*  Eric McAlpine
    Oom.java
    created 4-20-2016
    
    purpose: One-Of-Many, or oom, is a single member of the swarm.
    
*/


public class Oom extends Thread {
	
	// Variable Dictionary
	boolean alive = true;
	Location position;
	OomCommand activeCommand = OomCommand.ocIDLE;
	
	public Oom()
	{
		position = new Location();
	}
	
	public Oom(Location pos)
	{
		position = new Location(pos);
	}
	
	public void run()
	{
		while(alive)
		{
			// Eventually, would like to move routines to their own files.
			switch(activeCommand)
			{
				case ocUNKNOWN:		// FALLTHROUGH
				case ocIDLE:
				{
					
					break;
				}	// ocIDLE
				case ocMOVE:
				{
					break;
				}	// ocMOVE
				default:
					System.out.println("Invalid Oom Command");
					break;
			}
		}
	}
	
	//****************************
	//	Commands
	//****************************
	public void kill()
	{
		alive = false;
	}
	
	public void perform(OomCommand com)
	{
		
	}
	
	public Location getLocation()
	{
		return position;
	}
}
