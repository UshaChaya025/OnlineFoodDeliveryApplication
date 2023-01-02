package com.cg.ofda.service;

import java.util.List;

import com.cg.ofda.dto.FoodCartDto;
import com.cg.ofda.dto.ItemDto;

public interface ICartService {
	
	public FoodCartDto addItemToCart(String cartId, ItemDto item);
	public FoodCartDto increaseQuantity(String cartId, String itemId, int quantity);
	public FoodCartDto reduceQuantity(String cartId, String itemId, int quantity);
	public FoodCartDto removeItem(FoodCartDto cart, ItemDto item);
	public FoodCartDto clearCart(FoodCartDto cart);
	public List<FoodCartDto> viewCart();
	
	
	

}
