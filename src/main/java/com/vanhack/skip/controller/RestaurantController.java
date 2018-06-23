package com.vanhack.skip.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vanhack.skip.domain.Order2;
import com.vanhack.skip.domain.Restaurant;
import com.vanhack.skip.service.OrderService;
import com.vanhack.skip.service.RestaurantService;

@RestController
@RequestMapping("restaurant")
public class RestaurantController {

	@Autowired
	private RestaurantService restaurantService;
	
	@GetMapping("/suggestion/{lat-user}/{longi-user}/{lat-rest}/{longi-rest}")
	private List<Restaurant> findAllOrders(@PathVariable("lat-user") double latitudeUser, 
			@PathVariable("longi-user") double longitudeUser, 
			@PathVariable("lat-rest") double latitudeRestaurant, 
			@PathVariable("longi-rest") double longitudeRestaurant) {
		return restaurantService.findBySuggetion(latitudeUser, longitudeUser, latitudeRestaurant, longitudeRestaurant);
	}
	
	
}
