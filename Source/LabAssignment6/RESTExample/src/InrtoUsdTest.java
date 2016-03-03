import static org.junit.Assert.*;

import java.text.DecimalFormat;

import org.junit.Test;

public class InrtoUsdTest {

	TestInrtoUsd i = new TestInrtoUsd();
	Double USD = i.convertItoU(3425.0);
	DecimalFormat f = new DecimalFormat("##.00");
	String sUSD = f.format(USD);
	Double AUSD = Double.parseDouble(sUSD);
	Double testConversion = 2346.5;
	
	@Test
	public void test() {
		
		System.out.println("@Test conversion(): " + AUSD + " = " + testConversion);
		assertEquals(testConversion, AUSD);
		
	}
	

}
