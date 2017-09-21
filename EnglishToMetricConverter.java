package scaleConverter;

public class EnglishToMetricConverter implements ScaleConverter {

	@Override
	public double convertTemperature(double tempIn) {
		return (tempIn - 32) * (5.0 / 9);
	}

	@Override
	public double convertDistance(double distanceIn) {
		return distanceIn / .609;
	}

	@Override
	public double convertWeight(double weightIn) {
		return weightIn / 2.2;
	}
}
