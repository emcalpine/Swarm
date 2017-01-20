package stuff;
/*  Eric McAlpine
    SystemSettings.java
    created on: 4-20-2016
    
    purpose: holds all the 'global' variables to be accessed by other entities from a central location.
*/



public class SystemSettings
{
	// ***** Variable Dictionary *****
	
	// Distance the ooms will allow between each other before feeling 'uncomfortable'
	public static double allowableDistance = 0.0;
	
	// Speed of the ooms, or distance they will cover per loop cycle.
	public static double oomSpeed = 0.0;
	
	// Is the simulation currently running or paused
	public static boolean isPlaying = true;
}
