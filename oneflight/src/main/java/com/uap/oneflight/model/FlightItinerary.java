package com.uap.oneflight.model;

public class FlightItinerary {
	int flight_booking_id = 0;
	String itinerary_order = "";
	
	public int getFlight_booking_id() {
		return flight_booking_id;
	}
	public void setFlight_booking_id(int flight_booking_id) {
		this.flight_booking_id = flight_booking_id;
	}
	public String getItinerary_order() {
		return itinerary_order;
	}
	public void setItinerary_order(String itinerary_order) {
		this.itinerary_order = itinerary_order;
	}
}
