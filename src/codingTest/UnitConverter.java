package codingTest;

public class UnitConverter {
	public static final double KILOGRAMS_PER_POUND = 0.4535937;
	public static final double POUNDS_PER_KILOGRAM = 1 / 0.4535937;
	public static final double CENTIMETERS_PER_INCH = 2.54;
	public static final double INCHES_PER_CENTIMETER = 1 / 2.54;
	
	
	private UnitConverter() {
		
	}
	
	
	public static double toPounds(double kilograms) {
		double result = kilograms * POUNDS_PER_KILOGRAM;
		return result;
	}
	
	public static double toKilograms (double pounds) {
		double result = pounds * KILOGRAMS_PER_POUND;
		return result;
	}
	
	public static double toCentimeters (double inches) {
		double result = inches * CENTIMETERS_PER_INCH;
		return result;
	}
	
	public static double toInches (double centimeters) {
		double result = centimeters * INCHES_PER_CENTIMETER;
		return result;
	}
	
	public static double toFahrenheit(double celsius) {
		double result = celsius * (9/5) +32;
		return result;
        
    }
    public static double toCelsius(double fahrenheit) {
    	double result = (fahrenheit - 32) * 5 / 9;
    	return result;
        
    }
	

}
