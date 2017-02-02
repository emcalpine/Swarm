package stuff;
/*  Eric McAlpine
    Location.java
    created 4-20-2016
    
    purpose: Class that represents a location, given as a pair of coordinates,
             and an orientation.
    
*/


public class Location {
	
	// A set of Cartesian coordinates.
	double x = 0.0;
	double y = 0.0;
	
	// The orientation, given in degrees from positive x
	double direction = 0.0;
	
	public Location()
	{
		
	}
	
	public Location(double i, double j, double d)
	{
		x = (i > 0.0) ? i : x;
		y = (j > 0.0) ? j : y;
		direction = d % 360.0; 
	}
	
	public Location(Location pos)
	{
		x = pos.x;
		y = pos.y;
		direction = pos.direction;
	}
	
	public void update(double i, double j, double d)
	{
		x = (i > 0.0) ? i : x;
		y = (j > 0.0) ? j : y;
		direction = d % 360.0;
	}
	
	public double getX()
	{
		return x;
	}
	
	public double getY()
	{
		return y;
	}
	
	public double getDirection()
	{
		return direction;
	}
}
