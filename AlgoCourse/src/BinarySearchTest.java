import static org.junit.Assert.*;

import org.junit.Test;

public class BinarySearchTest {

	@Test
	public void testOneGetBinarySearch() {
		assertEquals(0, (BinarySearch.getBinarySearch(new int [] {1}, 1)));
	}
	
	@Test
	public void testTwoGetBinarySearch() {
		assertEquals(1, (BinarySearch.getBinarySearch(new int [] {1,8}, 8)));
	}
	
	@Test
	public void testThreeGetBinarySearch() {
		assertEquals(2, (BinarySearch.getBinarySearch(new int [] {1,3,6,8}, 6)));
	}
	
	@Test
	public void testFourGetBinarySearch() {
		assertEquals(0, (BinarySearch.getBinarySearch(new int [] {1,3,6,8}, 1)));
	}
	
	@Test
	public void testFiveGetBinarySearch() {
		assertEquals(3, (BinarySearch.getBinarySearch(new int [] {1,3,6,8}, 8)));
	}
	@Test
	public void testSixGetBinarySearch() {
		assertEquals(-1, (BinarySearch.getBinarySearch(new int [] {1,3,6,8}, 11)));
	}

}
