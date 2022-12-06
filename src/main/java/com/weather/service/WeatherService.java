package com.weather.service;

import org.springframework.stereotype.Service;

@Service
public class WeatherService {

	public String weatherDetail(double longitude, double latitude) {
		String str="";
		
		if((longitude == 23.0225) && (latitude == 72.5714)) {
			str = "Ahmedabad's weather is 22°C°F";
		}else if((longitude == 21.1702) && (latitude == 72.8311)) {
			str ="Surat's weather is 24°C°F";
		}else if((longitude == 19.0760) && (latitude == 72.8777)) {
			str ="Mumbai's weather is 28°C°F";
		}else {
			str = "Not Applicable";
		}
		
		return str;
	}
	
	
}
