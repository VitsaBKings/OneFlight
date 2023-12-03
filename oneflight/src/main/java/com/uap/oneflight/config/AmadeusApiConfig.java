package com.uap.oneflight.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@Configuration
public class AmadeusApiConfig {
	@Bean
	AmadeusApiClient amadeusApi() {
		WebClient webClient = WebClient.builder()
				.baseUrl("https://test.api.amadeus.com/v1/")
				.defaultHeader("Authorization", "Bearer" + "")
				.build();
		
		HttpServiceProxyFactory httpServiceProxyFactory = HttpServiceProxyFactory
				.builder(WebClientAdapter.forClient(webClient))
				.build();
		
		return httpeServiceProxyFactory.createClient(AmadeusApiClient.class);
	}
}
