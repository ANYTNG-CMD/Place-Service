package web;

import api.PlaceResponse;
import domain.Place;

public class PlaceMapper {
	public static PlaceResponse fromPlaceToResponse(Place place) {
		return new PlaceResponse(place.name(), place.slug(), place.state(), place.createdAt(), place.updateAt());

	}
}
