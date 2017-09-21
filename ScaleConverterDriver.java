package scaleConverter;

public class ScaleConverterDriver {
	public static final double EPSILON = 1E-14; //used to compare equality of two doubles
	
	public static void main(String[] args) {
		EnglishToMetricConverter emc = new EnglishToMetricConverter();
		
		// English To Metric Tests
		double expectedAnswer1 = 0; // Common knowledge conversion of 32F to Celsius
		double expectedAnswer2 = 100; // Common knowleDge conversion of 212F to Celsius
		double answer1 = emc.convertTemperature(32);
		double answer2 = emc.convertTemperature(212);
		double expectedAnswer3 = 100 / .609;
		double expectedAnswer4 = 609 / .609;
		double answer3 = emc.convertDistance(100);
		double answer4 = emc.convertDistance(609);
		double expectedAnswer5 = 134 / 2.2;
		double expectedAnswer6 = 66 / 2.2;
		double answer5 = emc.convertWeight(134);
		double answer6 = emc.convertWeight(66);
		
		System.out.println("English to Metric Tests: ");
		
		comparisonString(expectedAnswer1, answer1);
		comparisonString(expectedAnswer2, answer2);
		comparisonString(expectedAnswer3, answer3);
		comparisonString(expectedAnswer4, answer4);
		comparisonString(expectedAnswer5, answer5);
		comparisonString(expectedAnswer6, answer6);
		
		// Metric To English Tests
		double expectedAnswer11 = 32; // Common knowledge conversion of 0C to Fahrenheir
		double expectedAnswer12 = 212; // Common knowledge conversion of 100C to Fahrenheit
		double answer11 = new MetricToEnglishConverter().convertTemperature(0);
		double answer12 = new MetricToEnglishConverter().convertTemperature(100);
		double expectedAnswer13 = 1000 * .609;
		double expectedAnswer14 = 4443 * .609;
		double answer13 = new MetricToEnglishConverter().convertDistance(1000);
		double answer14 = new MetricToEnglishConverter().convertDistance(4443);
		double expectedAnswer15 = 1345 * 2.2;
		double expectedAnswer16 = 666 * 2.2;
		double answer15 = new MetricToEnglishConverter().convertWeight(1345);
		double answer16 = new MetricToEnglishConverter().convertWeight(666);
		
		System.out.println("\nMetric to English Tests: ");
		comparisonString(expectedAnswer11, answer11);
		comparisonString(expectedAnswer12, answer12);
		comparisonString(expectedAnswer13, answer13);
		comparisonString(expectedAnswer14, answer14);
		comparisonString(expectedAnswer15, answer15);
		comparisonString(expectedAnswer16, answer16);	
	}		
	
	public static void comparisonString(double expectedValue, double actualValue) {
		if (Math.abs(expectedValue - actualValue) < EPSILON) {
			System.out.printf("The expected answer, %.2f, is equal to the answer found, %.2f.\n", expectedValue, actualValue);
		}
		else {
			System.out.printf("The expected answer, %.2f, is not equal the answer found, %.2f\n", expectedValue, actualValue);
		}
	}
}
