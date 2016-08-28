/*  Eric McAlpine
    Location.java
    created 4-20-2016
    
    purpose: Class that represents a location, currently a pair of coordinates
    
*/


public class Location {
	
	double x = 0.0;
	double y = 0.0;
	
	public Location()
	{
		
	}
	
	public Location(double i, double j)
	{
		x = (i > 0.0) ? i : x;
		y = (j > 0.0) ? j : y;
	}
	
	public Location(Location pos)
	{
		x = pos.x;
		y = pos.y;
	}
	
	public void update(double i, double j)
	{
		x = (i > 0.0) ? i : x;
		y = (j > 0.0) ? j : y;
	}
}
