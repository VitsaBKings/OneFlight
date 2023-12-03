package com.uap.oneflight.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.String;
import com.uap.oneflight.repository.RegistrationMybatisRepository;
import com.uap.oneflight.webclient.AmadeusApiClient;

public class AmadeusService {
	@Autowired
	RegistrationMybatisRepository signupRepo;
	
	@Autowired
	AmadeusApiClient amadeusApi;
	
	public AmadeusAirlineResponse airlineLocation(String airlineCode) {
		AmadeusAirlineResponse response = amadeusApi.getAirlineLocations(airlineCode);
		ArrayList<Airline> detail = response.getData();
		
		for (Airline details : detail)
		{
			airlinesRepo.insertAirlineLocation(airlineCode, details.getName(), details.getIataCode());
		}
		return response;
	}
}
