package typewiseAlert;

import batteryCharacter.BatteryCharacter;
import sendAlert.SendAlert;
import temparatureBreachType.TemparetureBreach;
import typewiseAlert.Constants.AlertTarget;
import typewiseAlert.Constants.BreachType;
import typewiseAlert.Constants.CoolingType;

public class TypewiseAlert {

	public TemparetureBreach temp;
	public SendAlert sendAlert;
	public CoolingType coolingType;
	public String brand;

	public void checkAndAlert(AlertTarget alertTarget, BatteryCharacter batteryChar, double temperatureInC) {

		BreachType breachType = temp.classifyTemperatureBreach(batteryChar.coolingType, temperatureInC);

		switch (alertTarget) {
		case TO_CONTROLLER:
			sendAlert.sendToController(breachType);
			break;
		case TO_EMAIL:
			sendAlert.sendToEmail(breachType);
			break;
		}
	}
}
