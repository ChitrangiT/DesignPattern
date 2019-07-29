package Observer;

public class Station {
	int temparature;
	int humidity;
	int rain;
	String city;
	WeatherSatellite station;
	
	
	public Station(String city) {
		super();
		this.city = city;
	}

	public void updateWeather(int temp, int humidity, int rain){
		System.out.println("weather updated @ station "+city);
		this.humidity = humidity;
		this.rain = rain;
		this.temparature = temp;
	}
}
