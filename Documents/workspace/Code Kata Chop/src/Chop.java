import java.util.*;


public class Chop {

	public static void main(String[] args) {
		
		Map<String, Integer> theMap = new HashMap<String, Integer>();
		HashSet<String> theSet = new HashSet<String>();
		System.out.println ("Chop ...");
		for (int i=0; i<args.length; i++) {
			System.out.print ("Argument[" + i + "] = "); 
			System.out.println(args[i]);
			
			Integer freq = theMap.get(args[i]);
			if (freq == null) {
				theMap.put(args[i],  1);
				theSet.add(args[i]);
			}
			else {
				System.out.println(args[i] + " is already in the set/map");
			}
			
		}
		
		System.out.println ("Map size is " + theMap.size());
		System.out.println ("Set size is " + theSet.size());
		
		String item = new String("four");

        if (theMap.containsKey(item) == false) {
        	System.out.println ("Did not find item '" + item + "' in the map");
        }
        else {
        	System.out.println ("Found item '" + item + "' in the map");
        }
	
        if (theSet.contains(item) == false) {
        	System.out.println ("Did not find item '" + item + "' in the set");
        }
        else {
        	System.out.println ("Found item '" + item + "' in the set");        	
        }
	
	
	}
}
