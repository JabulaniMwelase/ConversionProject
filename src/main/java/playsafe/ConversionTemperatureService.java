/**
 * 
 */
package main.java.playsafe;

/**
 * @author Jabulani
 *
 */
@Path()
public class ConversionTemperatureService {
	
	public Double celsiusToFahrenheit(Float celsius){
		double temperature = 0;
		if(celsius != null){
			temperature = (double) ((celsius *(9/5))+32);
		}
		return temperature;
	}
	
	public Double fahrenheitToCelsius(Float fahrenheit){
		double temperature = 0;
		if(fahrenheit != null){
			temperature = (double) ((fahrenheit - 32)* (5/9));
		}
		return temperature;
	}
	
	public Double milesToKilometer(Float miles){
		double temperature = 0;
		if(miles != null){
			temperature = (double) (miles * 1609);
		}
		return temperature;
	}
	
	public Double kilometerToMiles(Float kilometers){
		double temperature = 0;
		if(kilometers != null){
			temperature = (double) (kilometers/1609);
		}
		return temperature;
	}
	
}
