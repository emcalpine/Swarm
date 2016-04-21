/*  Eric McAlpine
    OomLocations.java
    created 4-20-2016
    
    purpose: Table containing the locations of all the ooms.
*/


import java.util.List;


public class OomLocations 
{

	// Variable Dictionary
	List<OomLocation> locationMap;
	
	public OomLocations()
	{
		// Nothing to do here
	}
	
	public boolean addOom(Oom o, Location l)
	{
		boolean returnStatus = true;
		// TODO if oom already here, return false;
		locationMap.add(new OomLocation(o,l));
		
		return returnStatus;
	}
	
	public boolean removeOom(Oom o)
	{
		boolean returnStatus = true;
		// Find oom, if not found, return false
		return returnStatus;
	}
}

