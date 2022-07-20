package typewiseAlert;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import batteryCharacter.AlertTarget;
import batteryCharacter.BatteryCharacter;
import batteryCharacter.BreachType;
import batteryCharacter.CoolingType;
import temparatureBreachType.TemparetureBreach;
import temparatureBreachTypeImpl.TemparetureBreachImpl;
import typewiseAlertImpl.TypewiseAlertImpl;

public class TypewiseAlertTest {
	public TemparetureBreach tempBreach = new TemparetureBreachImpl();
	TypewiseAlert alert = new TypewiseAlertImpl();

	@Test
	public void infersBreachAsPerLimits() {
		assertTrue("test", tempBreach.inferBreach(12, 20, 30) == BreachType.TOO_LOW);
		assertTrue("test", tempBreach.inferBreach(22, 20, 30) == BreachType.NORMAL);
		assertTrue("test", tempBreach.inferBreach(32, 20, 30) == BreachType.TOO_HIGH);

	}
	
	@Test
	public void veryfyBreachType() {
		assertTrue("test", tempBreach.classifyTemperatureBreach(CoolingType.HI_ACTIVE_COOLING, 55) == BreachType.TOO_HIGH);
		assertTrue("test", tempBreach.classifyTemperatureBreach(CoolingType.MED_ACTIVE_COOLING, 15) == BreachType.NORMAL);
		assertTrue("test", tempBreach.classifyTemperatureBreach(CoolingType.MED_ACTIVE_COOLING, -10) == BreachType.TOO_LOW);
	}
	
	/*
	 * @Test public void sendAlertAsPerType() { BatteryCharacter batteryCharacter=
	 * new BatteryCharacter(null, null); assertTrue("test",alert.checkAndAlert(null,
	 * batteryCharacter, 0) == AlertTarget.TO_CONTROLLER); } }
	 */
}
