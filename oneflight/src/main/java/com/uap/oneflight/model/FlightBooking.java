package com.uap.oneflight.model;

import java.time.LocalDate;

public class FlightBooking {
    int queueing_office_id = 0;
    LocalDate creation_date = null;
    String origin_location_code = "";
	String destination_location = "";
	String code = "";
	String round_trip_tag = "";
	int number_of_passenger = 0;
	String reference_number = "";
	int flight_offer_id = 0;				
	float total_charged_amount = 0;
	
	public int getQueueing_office_id() {
		return queueing_office_id;
	}
	public void setQueueing_office_id(int queueing_office_id) {
		this.queueing_office_id = queueing_office_id;
	}
	public LocalDate getCreation_date() {
		return creation_date;
	}
	public void setCreation_date(LocalDate creation_date) {
		this.creation_date = creation_date;
	}
	public String getOrigin_location_code() {
		return origin_location_code;
	}
	public void setOrigin_location_code(String origin_location_code) {
		this.origin_location_code = origin_location_code;
	}
	public String getDestination_location() {
		return destination_location;
	}
	public void setDestination_location(String destination_location) {
		this.destination_location = destination_location;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getRound_trip_tag() {
		return round_trip_tag;
	}
	public void setRound_trip_tag(String round_trip_tag) {
		this.round_trip_tag = round_trip_tag;
	}
	public int getNumber_of_passenger() {
		return number_of_passenger;
	}
	public void setNumber_of_passenger(int number_of_passenger) {
		this.number_of_passenger = number_of_passenger;
	}
	public String getReference_number() {
		return reference_number;
	}
	public void setReference_number(String reference_number) {
		this.reference_number = reference_number;
	}
	public int getFlight_offer_id() {
		return flight_offer_id;
	}
	public void setFlight_offer_id(int flight_offer_id) {
		this.flight_offer_id = flight_offer_id;
	}
	public float getTotal_charged_amount() {
		return total_charged_amount;
	}
	public void setTotal_charged_amount(float total_charged_amount) {
		this.total_charged_amount = total_charged_amount;
	}

	
}
