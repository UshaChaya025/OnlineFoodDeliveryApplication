package com.cg.ofda.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.cg.ofda.dto.RestaurantDto;
import com.cg.ofda.repository.IRestaurantRepository;
@Service
public class IRestaurantServiceImpl implements IRestaurantService{

		@Autowired
		IRestaurantRepository restaurantRepository;

		@Override
		public RestaurantDto addRestaurant(RestaurantDto res) {
			return restaurantRepository.save(res);
		}

		@Override
		public RestaurantDto updateRestaurant(RestaurantDto res) {
			restaurantRepository.save(res);
			return res;
		}

		@Override
		public RestaurantDto removeRestaurant(String restaurantId) {
			RestaurantDto r = restaurantRepository.findById(restaurantId).get();
			restaurantRepository.deleteById(restaurantId);
			return  r;
		}

		@Override
		public RestaurantDto viewRestaurant(String restaurantId) {
				return restaurantRepository.findById(restaurantId).get();
		}
		
		


}
