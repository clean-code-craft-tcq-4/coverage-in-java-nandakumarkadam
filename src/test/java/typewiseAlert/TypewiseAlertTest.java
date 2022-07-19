package typewiseAlert;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import temparatureBreachType.TemparetureBreach;
import temparatureBreachTypeImpl.TemparetureBreachImpl;
import typewiseAlert.Constants.BreachType;

public class TypewiseAlertTest 
{
	public TemparetureBreach tempBreach; 
    @Test
    public void infersBreachAsPerLimits()
    {
      assertTrue(tempBreach.inferBreach(12, 20, 30) ==
        BreachType.TOO_LOW);
    }
}
