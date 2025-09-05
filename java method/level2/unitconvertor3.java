public class unitconvertor3 {
		    public static double convertFahrenheitToCelsius(double fahrenheit) {
		        double fahrenheit2celsius = (fahrenheit - 32) * 5.0 / 9.0;
		        return fahrenheit2celsius;
		    }
		    public static double convertCelsiusToFahrenheit(double celsius) {
		        double celsius2fahrenheit = (celsius * 9.0 / 5.0) + 32;
		        return celsius2fahrenheit;
		    }
		    public static double convertPoundsToKilograms(double pounds) {
		        double pounds2kilograms = 0.453592;
		        return pounds * pounds2kilograms;
		    }
		    public static double convertKilogramsToPounds(double kilograms) {
		        double kilograms2pounds = 2.20462;
		        return kilograms * kilograms2pounds;
		    }
		    public static double convertGallonsToLiters(double gallons) {
		        double gallons2liters = 3.78541;
		        return gallons * gallons2liters;
		    }
		    public static double convertLitersToGallons(double liters) {
		        double liters2gallons = 0.264172;
		        return liters * liters2gallons;
		    }
		    public static void main(String[] args) {
		        double f = 98.6;
		        System.out.println(f + " Fahrenheit = " + convertFahrenheitToCelsius(f) + " Celsius");

		        double c = 37;
		        System.out.println(c + " Celsius = " + convertCelsiusToFahrenheit(c) + " Fahrenheit");

		        double lbs = 150;
		        System.out.println(lbs + " pounds = " + convertPoundsToKilograms(lbs) + " kilograms");

		        double kg = 68;
		        System.out.println(kg + " kilograms = " + convertKilogramsToPounds(kg) + " pounds");

		        double gal = 5;
		        System.out.println(gal + " gallons = " + convertGallonsToLiters(gal) + " liters");

		        double liters = 10;
		        System.out.println(liters + " liters = " + convertLitersToGallons(liters) + " gallons");
		    }
		}
