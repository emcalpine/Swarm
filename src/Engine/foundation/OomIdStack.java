// Not really a stack anymore, but I don't feel like changing the name.
// Like, c'mon, I'm 5 minutes into it already.

package foundation;

import foundation.OomId;
import stuff.SystemSettings;

public class OomIdStack {

	static OomId[] stack = new OomId[SystemSettings.MAX_OOMS];
	static boolean[] inUse = new boolean[SystemSettings.MAX_OOMS];
	
	
	public static void initialize()
	{
		for (int i = 0; i < SystemSettings.MAX_OOMS; i++)
		{
			stack[i] = new OomId(i);
			inUse[i] = false;
		}
	}
	
	
	public static OomId getNewId()
	{
		// Find oom not in use
		int i = 0;
		
		while(i < SystemSettings.MAX_OOMS)
		{
			if (inUse[i] == false)
			{
				inUse[i] = true;
				return stack[i];
			}
		}
	}
	
	
	public static void freeId(OomId id)
	{
		int i = id.getId();
		
		// Bounds check
		if (i < SystemSettings.MAX_OOMS)
		{
			inUse[i] = false;
		}
	}
}
