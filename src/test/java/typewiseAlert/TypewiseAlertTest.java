package typewiseAlert;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import typewiseAlert.Constants.BreachType;

public class TypewiseAlertTest 
{
    @Test
    public void infersBreachAsPerLimits()
    {
      assertTrue(TypewiseAlert.inferBreach(12, 20, 30) ==
        BreachType.TOO_LOW);
    }
}
