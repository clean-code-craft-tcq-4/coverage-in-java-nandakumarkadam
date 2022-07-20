package typewiseAlert;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import temparatureBreachType.TemparetureBreach;
import temparatureBreachTypeImpl.TemparetureBreachImpl;
import typewiseAlert.Constants.BreachType;
import typewiseAlert.Constants.CoolingType;

public class TypewiseAlertTest {
	public TemparetureBreach tempBreach = new TemparetureBreachImpl();

	@Test
	public void infersBreachAsPerLimits() {
		assertTrue(tempBreach.inferBreach(12, 20, 30) == BreachType.TOO_LOW);
		assertTrue("test", tempBreach.inferBreach(22, 20, 30) == BreachType.NORMAL);
		assertTrue("test", tempBreach.inferBreach(32, 20, 30) == BreachType.TOO_HIGH);

	}
}
