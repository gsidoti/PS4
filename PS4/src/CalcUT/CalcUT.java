package CalcUT;

import static org.junit.Assert.*;
import org.junit.Test;
import CalcEngine.FValue;


public class CalcUT extends FValue {

	@Test
	public final void test() {
		FValue test = new FValue();
		double result = test.returnFValue(10000, .02, 20);
		assertEquals(14859.473959783549,result,.001);
	}

}
