package basicJUnitTest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class SomeObjectTest {
	
	private SomeObject object;
	

	@Before
	public void setUp() throws Exception {
		System.out.println("Setup");
		object = new SomeObject(10);
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("TearDown");
	}

	@Test
	public void testInit() {
		System.out.println("testInit");
		assertEquals(10, object.getValue());	
	}
	
	@Test
	public void testIncrement(){
		System.out.println("testIncrement");
		assertEquals(10, object.getValue());	
		object.increment();
		assertEquals(11, object.getValue());		
	}
	
	@Test
	public void testArray() {
		
		int[][] array = {{1,2,3},{4,78,6},{7,8,9}};
		int[][] array2 = {{1,2,4},{4,5,6},{7,8,9}};
		
		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				assertEquals("testing at i:"+i+" j:"+j ,array[i][j], array2[i][j]);
			}
		}
	}
}
