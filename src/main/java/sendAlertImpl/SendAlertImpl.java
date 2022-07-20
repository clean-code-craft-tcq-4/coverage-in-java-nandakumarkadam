package sendAlertImpl;

import java.util.EnumMap;

import sendAlert.SendAlert;
import typewiseAlert.Constants.BreachType;

public class SendAlertImpl implements SendAlert {

	@Override
	public void sendToController(BreachType breachType) {
		int header = 0xfeed;
		System.out.printf("%i : %i\n", header, breachType);

	}

	@Override
	public void sendToEmail(BreachType breachType) {
		// TODO Auto-generated method stub
		EnumMap<BreachType, String> tempMap = new EnumMap<BreachType, String>(BreachType.class);
		tempMap.put(BreachType.TOO_LOW, "To: %s\\n\", recepient+ Hi, the temperature is too high\\n");
		tempMap.put(BreachType.TOO_HIGH, "To: %s\\n\", recepient+ Hi, the temperature is too low\\n");
		tempMap.put(BreachType.NORMAL, "To: %s\\n\", recepient+ Hi, the temperature is  normal\\n");
		System.out.println(tempMap.get(breachType));
	}
}
