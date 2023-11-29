package com.uap.oneflight.model;

import java.sql.Time;
import java.util.Date;

public class FlightSegment {
	int flight_itinerary_id = 0;
	String departure_aita_code = "";
	Date departure_datetime = null;
	String departure_terminal = "";
	String arrival_aita_code = "";
	Date arrival_datetime = null;
	String arrival_terminal = "";
	String carrier_code = "";
	String flight_number = "";
	Time duration_in_hours = null;
	String aircraft_code = "";
	String aircraft_description = "";
	
	public int getFlight_itinerary_id() {
		return flight_itinerary_id;
	}
	public void setFlight_itinerary_id(int flight_itinerary_id) {
		this.flight_itinerary_id = flight_itinerary_id;
	}
	public String getDeparture_aita_code() {
		return departure_aita_code;
	}
	public void setDeparture_aita_code(String departure_aita_code) {
		this.departure_aita_code = departure_aita_code;
	}
	public Date getDeparture_datetime() {
		return departure_datetime;
	}
	public void setDeparture_datetime(Date departure_datetime) {
		this.departure_datetime = departure_datetime;
	}
	public String getDeparture_terminal() {
		return departure_terminal;
	}
	public void setDeparture_terminal(String departure_terminal) {
		this.departure_terminal = departure_terminal;
	}
	public String getArrival_aita_code() {
		return arrival_aita_code;
	}
	public void setArrival_aita_code(String arrival_aita_code) {
		this.arrival_aita_code = arrival_aita_code;
	}
	public Date getArrival_datetime() {
		return arrival_datetime;
	}
	public void setArrival_datetime(Date arrival_datetime) {
		this.arrival_datetime = arrival_datetime;
	}
	public String getArrival_terminal() {
		return arrival_terminal;
	}
	public void setArrival_terminal(String arrival_terminal) {
		this.arrival_terminal = arrival_terminal;
	}
	public String getCarrier_code() {
		return carrier_code;
	}
	public void setCarrier_code(String carrier_code) {
		this.carrier_code = carrier_code;
	}
	public String getFlight_number() {
		return flight_number;
	}
	public void setFlight_number(String flight_number) {
		this.flight_number = flight_number;
	}
	public Time getDuration_in_hours() {
		return duration_in_hours;
	}
	public void setDuration_in_hours(Time duration_in_hours) {
		this.duration_in_hours = duration_in_hours;
	}
	public String getAircraft_code() {
		return aircraft_code;
	}
	public void setAircraft_code(String aircraft_code) {
		this.aircraft_code = aircraft_code;
	}
	public String getAircraft_description() {
		return aircraft_description;
	}
	public void setAircraft_description(String aircraft_description) {
		this.aircraft_description = aircraft_description;
	}
}
