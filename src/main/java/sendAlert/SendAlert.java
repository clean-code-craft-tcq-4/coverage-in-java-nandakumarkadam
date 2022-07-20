package sendAlert;

import batteryCharacter.BreachType;

public interface SendAlert {

	public void sendToController(BreachType breachType);

	public void sendToEmail(BreachType breachType);
}
