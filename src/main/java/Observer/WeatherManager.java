package Observer;

public class WeatherManager {
	
	public static void main(String args[]) {
		
		Station Mumbai = new Station("Mumbai");
		Station Delhi = new Station("Delhi");
		Station Chennai = new Station("Chennai");
		Station Kolkata = new Station("Kolkata");
		
		WeatherSatellite satellite = new WeatherSatellite();
		satellite.registerStation(Mumbai);
		satellite.registerStation(Delhi);
		satellite.registerStation(Chennai);
		satellite.registerStation(Kolkata);
		
		satellite.setWeather(5, 30, 50);
				
		
	}

}
