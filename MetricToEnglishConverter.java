package scaleConverter;

public class MetricToEnglishConverter implements ScaleConverter {

	@Override
	public double convertTemperature(double tempIn) {
		double tempInFahr = ((9.0 / 5) * tempIn) - 32; 
		return tempInFahr;
	}

	@Override
	public double convertDistance(double distanceIn) {
		double distanceInMi = distanceIn * .609;
		return distanceInMi;
	}

	@Override
	public double convertWeight(double weightIn) {
		double weightInLb = weightIn * 2.2;
		return weightInLb;
	}
	
}
