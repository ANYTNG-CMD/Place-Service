package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import domain.PlaceRepository;
import domain.PlaceService;

@Configuration
public class PlaceConfig {
	@Bean
	PlaceService placeService(PlaceRepository placeRepository) {
		return new PlaceService(placeRepository);
	}
	
	

}
