package typewiseAlert.Constants;

public enum CoolingType {

	PASSIVE_COOLING(0, 35), HI_ACTIVE_COOLING(0, 45), MED_ACTIVE_COOLING(0, 40);

	int upperLimit;
	int lowerLimit;

	CoolingType( int lowerLimit, int upperLimit) {
		this.lowerLimit = lowerLimit;
		this.upperLimit = upperLimit;
	}

	public int getUpperLimit() {
		return upperLimit;
	}

	public int getLowerLimit() {
		return lowerLimit;
	}

};