package assignment4;

import static org.junit.Assert.*;

import org.junit.Test;
public class HouseConstructionCostTest {

	@Test
	public void test() {
		HouseConstructionCost test=new HouseConstructionCost();
		double output=test.cost("high","No",5.0);
		assertEquals(9000.0,output,0);
	}

}
