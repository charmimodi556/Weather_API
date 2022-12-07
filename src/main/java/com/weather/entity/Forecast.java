package com.weather.entity;

public class Forecast {
	String day;
	String temperature;
	String wind;
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getTemperature() {
		return temperature;
	}
	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}
	public String getWind() {
		return wind;
	}
	public void setWind(String wind) {
		this.wind = wind;
	}
	public Forecast(String day, String temperature, String wind) {
		super();
		this.day = day;
		this.temperature = temperature;
		this.wind = wind;
	}
	public Forecast() {
		super();
	}
	
	
}
