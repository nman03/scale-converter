package scaleConverter;

public class EnglishToMetricConverter implements ScaleConverter {

	@Override
	public double convertTemperature(double tempIn) {
		double tempInCel = (tempIn - 32) * (5.0 / 9);
		return tempInCel;
	}

	@Override
	public double convertDistance(double distanceIn) {
		double distanceInKm = distanceIn / .609;
		return distanceInKm;
	}

	@Override
	public double convertWeight(double weightIn) {
		double weightInKg = weightIn / 2.2;
		return weightInKg;
	}
}
