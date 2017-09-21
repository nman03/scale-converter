package scaleConverter;

public class MetricToEnglishConverter implements ScaleConverter {

	@Override
	public double convertTemperature(double tempIn) {
		return ((9.0 / 5) * tempIn) + 32;
	}

	@Override
	public double convertDistance(double distanceIn) {
		return distanceIn * .609;
	}

	@Override
	public double convertWeight(double weightIn) {
		return weightIn * 2.2;
	}	
}
