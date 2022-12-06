package com.weather.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weather.service.WeatherService;

@RestController
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
	public String getTempDetails(@PathVariable("city") String city) {
		String str = weatherService.tempCity(city);
		return str;
	}
}
