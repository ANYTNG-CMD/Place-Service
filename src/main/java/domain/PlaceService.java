package domain;

import org.springframework.stereotype.Service;

import api.PlaceRequest;
import reactor.core.publisher.Mono;

@Service
public class PlaceService {
	private PlaceRepository placeRepository;

	public PlaceService(PlaceRepository placeRepository) {

		this.placeRepository = placeRepository;
		this.slg = Slugify.builder().build();
	}

	public Mono<Place> create(PlaceRequest placeRequest) {
		Object id;
		var place = new Place();

		return placeRepository.save(place);
	}
}
