package temparatureBreachType;

import batteryCharacter.BreachType;
import batteryCharacter.CoolingType;

public interface TemparetureBreach {

	public BreachType inferBreach(double value, double lowerLimit, double upperLimit);

	public BreachType classifyTemperatureBreach(CoolingType coolingType, double temperatureInC);

}
