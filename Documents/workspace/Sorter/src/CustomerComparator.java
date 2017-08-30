import static org.junit.Assert.*;
import java.util.*;
import org.junit.*;

public class CustomerComparator implements Comparator<Customer> {

	@Override
	public int compare (Customer c1, Customer c2) {
		return c1.number.compareTo(c2.number);
	}
	
	@Test
	public void testCompare () {
		Customer c1 = new Customer ();
		Customer c2 = new Customer ();
		c1.number = 1;
		c2.number = 2;
		assertEquals ("1 is before 2", this.compare(c1, c2), -1);
		assertEquals ("1 equals 1", this.compare(c1,  c1), 0);
		System.out.println ("CustomerComparator passes");
	}
}
