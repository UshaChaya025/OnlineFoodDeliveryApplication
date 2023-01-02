package com.cg.ofda.service;

import java.util.List;

import com.cg.ofda.dto.RestaurantDto;

public interface IRestaurantService {

	public RestaurantDto addRestaurant(RestaurantDto res);
	public RestaurantDto updateRestaurant(RestaurantDto res);
	public RestaurantDto removeRestaurant(String restaurantId);
	public RestaurantDto viewRestaurant(String restaurantId);
	//public List<RestaurantDto> viewRestaurantNearBy(String location);
	//public List<RestaurantDto> viewRestaurantByItemName(String name);
}
