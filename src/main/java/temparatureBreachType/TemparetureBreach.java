package temparatureBreachType;

import typewiseAlert.Constants.BreachType;
import typewiseAlert.Constants.CoolingType;

public interface TemparetureBreach {

	public BreachType inferBreach(double value, double lowerLimit, double upperLimit);

	public BreachType classifyTemperatureBreach(CoolingType coolingType, double temperatureInC);

}
