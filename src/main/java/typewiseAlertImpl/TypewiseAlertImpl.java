package typewiseAlertImpl;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

import batteryCharacter.AlertTarget;
import batteryCharacter.BatteryCharacter;
import batteryCharacter.BreachType;
import batteryCharacter.CoolingType;
import sendAlert.SendAlert;
import temparatureBreachType.TemparetureBreach;
import typewiseAlert.TypewiseAlert;

public class TypewiseAlertImpl implements TypewiseAlert{

	public TemparetureBreach temperature;
	public SendAlert sendAlert;
	public CoolingType coolingType;
	public String brand;
	public BreachType breachType;

	public void checkAndAlert(AlertTarget alertTarget, BatteryCharacter batteryChar, double temperatureInC) {

		breachType = temperature.classifyTemperatureBreach(batteryChar.coolingType, temperatureInC);

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
