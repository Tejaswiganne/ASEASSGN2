import static org.junit.Assert.*;
import java.text.DecimalFormat;

import org.junit.Test;

public class HectoAcrTest {
	
	HectoAcr h = new HectoAcr();
	Double acre = h.convertHtoA(3425.0);
	
	Double testConversion = 8463.34625;
	
	@Test
	public void test() {
		
		System.out.println("@Test conversion(): " + acre + " = " + testConversion);
		assertEquals(testConversion, acre);
		
	}
}
