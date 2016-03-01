package base;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestCase{
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception{
	}
	static double object1 = (231.16);
	static double object2 = (0.00);
	static double object3 = (20165.26);
	static double object4 = (994.42);
	
	//Test case 1
	@Test
	public void test1Total_and_monthly(){
		boolean bExpectedResult = true;
		double bActualResult = object1;
		assertEquals(bExpectedResult, bActualResult);
	}
	
	//Test case 2
	@Test
	public void test2Total_and_monthly(){
		boolean bExpectedResult = true;
		double bActualResult = object2;
		assertEquals(bExpectedResult, bActualResult);
	}
	
	//Test case 3
	@Test
	public void test3Total_and_monthly(){
		boolean bExpectedResult = true;
		double bActualResult = object3;
		assertEquals(bExpectedResult, bActualResult);
	}
	
	//Test case 4
	@Test
	public void test4Total_and_monthly(){
		boolean bExpectedResult = true;
		double bActualResult = object4;
		assertEquals(bExpectedResult, bActualResult);
	}
}//end class