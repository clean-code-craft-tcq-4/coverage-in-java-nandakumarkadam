package typewiseAlert;

import batteryCharacter.AlertTarget;
import batteryCharacter.BatteryCharacter;

public interface TypewiseAlert {
	public void checkAndAlert(AlertTarget alertTarget, BatteryCharacter batteryChar, double temperatureInC);

}
