package temparatureBreachTypeImpl;

import temparatureBreachType.TemparetureBreach;
import typewiseAlert.Constants.BreachType;
import typewiseAlert.Constants.CoolingType;

public class TemparetureBreachImpl implements TemparetureBreach {
	public static void main(String[] args) {
		TemparetureBreach ib = new TemparetureBreachImpl() ;
		ib.inferBreach(12, 20, 30);
	}


	@Override
	public BreachType inferBreach(double value, double lowerLimit, double upperLimit) {
		if (value < lowerLimit) {
			return BreachType.TOO_LOW;
		}
		if (value > upperLimit) {
			return BreachType.TOO_HIGH;
		}
		return BreachType.NORMAL;
	}

	@Override
	public BreachType classifyTemperatureBreach(CoolingType coolingType, double temperatureInC) {
	
		return inferBreach(temperatureInC, coolingType.getLowerLimit(), coolingType.getUpperLimit());
	}
}
