package sendAlertImpl;

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
		String recepient = "a.b@c.com";
		switch (breachType) {
		case TOO_LOW:
			System.out.printf("To: %s\n", recepient);
			System.out.println("Hi, the temperature is too low\n");
			break;
		case TOO_HIGH:
			System.out.printf("To: %s\n", recepient);
			System.out.println("Hi, the temperature is too high\n");
			break;
		case NORMAL:
			break;
		}
	}

}
