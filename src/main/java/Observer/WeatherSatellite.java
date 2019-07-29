package Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherSatellite {
	
	List<Station> weatherStations = new ArrayList<Station>();
	int temparature;
	int humidity;
	int rain;
	
	public void registerStation(Station station) {
		weatherStations.add(station);
	}
	
	public void unregisterStation(Station station) {
		weatherStations.remove(station);
	}
	
	void setWeather(int temp, int humidity, int rain) {
		this.humidity = humidity;
		this.rain = rain;
		this.temparature = temp;
		
		notifyStations(temp, humidity,rain);
	}

	private void notifyStations(int temp, int humidity, int rain) {
		// TODO Auto-generated method stub
		for(Station station : weatherStations) {
			station.updateWeather(temp, humidity, rain);
		}
		
	}

}
