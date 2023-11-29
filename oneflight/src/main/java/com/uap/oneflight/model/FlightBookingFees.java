package com.uap.oneflight.model;

public class FlightBookingFees {
	int flight_booking_id = 0;
	String charge_name = "";
	float amount = 0;
	
	public int getFlight_booking_id() {
		return flight_booking_id;
	}
	public void setFlight_booking_id(int flight_booking_id) {
		this.flight_booking_id = flight_booking_id;
	}
	public String getCharge_name() {
		return charge_name;
	}
	public void setCharge_name(String charge_name) {
		this.charge_name = charge_name;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
}
