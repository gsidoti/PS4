package CalcUT;

import static org.junit.Assert.*;
import org.junit.Test;
import CalcEngine.FValue;

public class CalcUT extends FValue {
	@Test
	public final void test() {
		FValue test = new FValue();
		double result = test.returnFValue(10000, 3, 3.5);
		assertEquals(11022.77, result, .001);
	}
}