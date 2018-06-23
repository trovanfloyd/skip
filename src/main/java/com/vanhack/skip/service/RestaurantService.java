package com.vanhack.skip.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vanhack.skip.domain.Order2;
import com.vanhack.skip.domain.Restaurant;
import com.vanhack.skip.repository.OrderRepository;
import com.vanhack.skip.repository.RestaurantRepository;

@Service
public class RestaurantService {

	@Autowired
	RestaurantRepository restaurantRepository;
	
	public List<Restaurant> findBySuggetion(double latitudeUser, double longitudeUser,
			double latitudeRestaurant, double longitudeRestaurant) {
		
		List<Restaurant> listRestaurantsBetweenLocations = new ArrayList<>();
		listRestaurantsBetweenLocations.add(new Restaurant("Restaurant X", "Adress X", -21.536993, -20.586993));
		listRestaurantsBetweenLocations.add(new Restaurant("Restaurant Y", "Adress Y", -21.534393, -19.586993));
		listRestaurantsBetweenLocations.add(new Restaurant("Restaurant Z", "Adress Z", -21.546993, -27.586993));
		
		return listRestaurantsBetweenLocations;
	}
	
}
