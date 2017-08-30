import java.io.*;
import java.util.*;

public class Sorter {
	public static void main (String args[]) throws IOException {
		//
		// put file name in the args
		//
		
		if (args.length == 0) {
			System.err.println ("Usage: Sorter filename");
			System.exit(0);
		}
		
		List<Customer> theList = readLines(args[0]);
		
		System.out.println ("Original file contents");
		dump (theList);
		
		List<Customer> bubbleSorted = sortme (theList);
		System.out.println ("Bubble sorted");
		dump (bubbleSorted);
		
		Collections.sort(theList, new CustomerComparator ());
		System.out.println ("now sorted");
		dump (theList);
		
		System.out.println ("Reverse sort with annonymous inner class");
		Collections.sort(theList, new Comparator<Customer> () {
			public int compare (Customer c1, Customer c2) {
				return c2.number.compareTo(c1.number);
			}
		});
		dump (theList);
		
		System.out.println ("Sort by name with annonymous inner class");
		Collections.sort(theList, new Comparator<Customer> () {
			public int compare (Customer c1, Customer c2) {
				return c1.name.compareTo(c2.name);
			}
		});
		dump (theList);
		
		Customer theArray [] = theList.toArray(new Customer[0]);
		Arrays.sort(theArray, new Comparator<Customer> () {
			public int compare (Customer c1, Customer c2) {
				return c1.location.compareTo(c2.location);
			}			
		});
		System.out.println("using arrays to sort by location");
		dump (theArray);
		
		System.out.println("Enter a list of Strings");
		
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int t = 0; t < n; t++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a+b);
        }
        
        List<String> myArray = new ArrayList<String> ();
        n = sc.nextInt();
        for (int i = 0; i<n; i++) {
        	String s1 = sc.next();
        	myArray.add(s1);
        }
        Collections.sort(myArray, new Comparator<String> () {
        	public int compare (String s1, String s2) {
        		return s1.compareTo(s2);
        	}
        });
        
       
        for (String s2 : myArray) {
        	System.out.println(s2);
        }
	}
	
	public static List<Customer> readLines (String fileName) throws IOException {
		
		BufferedReader stream = new BufferedReader(new FileReader (fileName));
		String line;
		List<Customer> myList = new ArrayList<Customer>();
		
		while ( (line = stream.readLine()) != null) {
			Customer c = new Customer ();
			
			StringTokenizer st = new StringTokenizer (line, "|");
			
			c.name = st.nextToken();
			c.location = st.nextToken();
			c.number = Integer.valueOf(st.nextToken());
			myList.add(c);
		}
		
		stream.close();
		
		return myList;
	}
	
	public static List<Customer> sortme (List<Customer> inList) {
		List<Customer> outList = new ArrayList<Customer> (inList);
		for (int i=0; i<outList.size(); i++) {
			for (int j=i; j<outList.size()-1; j++) {
				Customer c1 = outList.get(i);
				Customer c2 = outList.get(j+1);
				if (c1.number > c2.number) {
					outList.add(i, c2);
					outList.remove(i+1);
					outList.add(j+1, c1);
					outList.remove(j+2);
				}
			}
			
		}
		
		return outList;
	}
	
	
	public static void dump (List<Customer> theList) {
		Boolean first = true;
		
		for (Customer c : theList) {
			if (first) {
				first = false;
				System.out.println ("=======================");
			}
			else {
				System.out.println ("-----------------------");
			}
			
			System.out.println ("Name:     " + c.name);
			System.out.println ("Location: " + c.location);
			System.out.println ("Number:   " + c.number);
		}
		System.out.println();
		
	}
	
	
	public static void dump (Customer[] theList) {
		Boolean first = true;
		
		for (Customer c : theList) {
			if (first) {
				first = false;
				System.out.println ("=======================");
			}
			else {
				System.out.println ("-----------------------");
			}
			
			System.out.println ("Name:     " + c.name);
			System.out.println ("Location: " + c.location);
			System.out.println ("Number:   " + c.number);
		}
		System.out.println();
		
	}
	
	public static void dumpString (List<String> theList) {
		Boolean first = true;
		
		for (String s : theList) {
			if (first) {
				first = false;
				System.out.println ("=======================");
			}
			else {
				System.out.println ("-----------------------");
			}
			
			System.out.println ("Value:     " + s);
		}
	}
}
