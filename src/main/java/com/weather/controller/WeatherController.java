package com.weather.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.weather.entity.Response;
import com.weather.service.WeatherService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/weather")
public class WeatherController {
	
	@Autowired
	WeatherService weatherService;
	
	
	@GetMapping("/{longitude}/{latitude}")
	public String getWeatherDetails(@PathVariable("longitude") double longitude, @PathVariable("latitude") double latitude) {
		String str = weatherService.weatherDetail(longitude,latitude);
		return str;
	}
	
	@GetMapping("/{city}")
	public Response getTempDetails(@PathVariable("city") String city) throws JsonMappingException, JsonProcessingException {
		Response jsonObject = weatherService.tempCity(city);
		return jsonObject;
	}
}
