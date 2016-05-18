import static org.junit.Assert.*;

import org.junit.Test;

public class FindElementTest {

	@Test
	public void testOneGetIndexFirst() {
	assertEquals(0, (FindElement.getIndexFirst(new int [] {1}, 1, 1)));
	}

	@Test
	public void testTwoGetIndexFirst() {
	assertEquals(0, (FindElement.getIndexFirst(new int [] {1,8}, 2, 1)));
	}

	@Test
	public void testThreeGetIndexFirst() {
	assertEquals(1, (FindElement.getIndexFirst(new int [] {1,3,6,2}, 4, 3)));
	}
	
	@Test
	public void testFourGetIndexFirst() {
	assertEquals(-1, (FindElement.getIndexFirst(new int [] {1,3,6,2}, 4, 8)));
	}
	
	@Test
	public void testOneGetIndexSecond() {
	assertEquals(0, (FindElement.getIndexSecond(new int [] {1}, 1, 1)));
	}

	@Test
	public void testTwoGetIndexSecond() {
	assertEquals(0, (FindElement.getIndexSecond(new int [] {1,8}, 2, 1)));
	}

	@Test
	public void testThreeGetIndexSecond() {
	assertEquals(1, (FindElement.getIndexSecond(new int [] {1,3,6,2}, 4, 3)));
	}
	
	@Test
	public void testFourGetIndexSecond() {
	assertEquals(-1, (FindElement.getIndexSecond(new int [] {1,3,6,2}, 4, 8)));
	}
	
	@Test
	public void testOneGetIndexThird() {
	assertEquals(0, (FindElement.getIndexThird(new int [] {1}, 1, 1)));
	}

	@Test
	public void testTwoGetIndexThird() {
	assertEquals(0, (FindElement.getIndexThird(new int [] {1,8}, 2, 1)));
	}

	@Test
	public void testThreeGetIndexThird() {
	assertEquals(1, (FindElement.getIndexThird(new int [] {1,3,6,2}, 4, 3)));
	}
	
	@Test
	public void testFourGetIndexThird() {
	assertEquals(-1, (FindElement.getIndexThird(new int [] {1,3,6,2}, 4, 8)));
	}	

	@Test
	public void testOneGetIndexFourth() {
	assertEquals(0, (FindElement.getIndexFourth(new int [] {1}, 1, 1)));
	}

	@Test
	public void testTwoGetIndexFourth() {
	assertEquals(0, (FindElement.getIndexFourth(new int [] {1,8}, 2, 1)));
	}

	@Test
	public void testThreeGetIndexFourth() {
	assertEquals(3, (FindElement.getIndexFourth(new int [] {1,4,6,3}, 4, 3)));
	}
	
	@Test
	public void testFourGetIndexFourth() {
	assertEquals(-1, (FindElement.getIndexFourth(new int [] {1,3,6,2}, 4, 8)));
	}	
}
