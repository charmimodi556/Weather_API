package com.weather.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.weather.entity.Response;

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
	
	public Response tempCity(String city) throws JsonMappingException, JsonProcessingException {
		String url = "https://goweather.herokuapp.com/weather/" + city;
		
		RestTemplate restTemplate = new RestTemplate();
	    String result = restTemplate.getForObject(url, String.class);
	   // String result = "{\"temperature\":\"+7 °C\",\"wind\":\"26 km/h\",\"description\":\"Partly cloudy\",\"forecast\":[{\"day\":\"1\",\"temperature\":\"+4 °C\",\"wind\":\"14 km/h\"},{\"day\":\"2\",\"temperature\":\"5 °C\",\"wind\":\"9 km/h\"},{\"day\":\"3\",\"temperature\":\"2 °C\",\"wind\":\"4 km/h\"}]}";

	    ObjectMapper mapper = new ObjectMapper();
	    Response resp = mapper.readValue(result, Response.class);
	    		
		return resp;
	}
	
}
