package stuff;

import stuff.*;
import foundation.*;

import java.util.Map;

public class OomController {
	
	static Map<OomId, Oom> masterList = new Map<OomId, Oom>();
	
	
	public static void addOom()
	{
		Oom o = new Oom(new Location(0,0));
		
		masterList.put(OomIdStack.getNewId(), o);
	}

}
