package com.uap.oneflight.webclient;

import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange
public class AmadeusApiClient {
	
	@GetExchange("airline/destinations?airlineCode={airlineCode}")
	public AmadeusinlineResponse getAirlineLocations(@PathVariable String airlineCode);
}
