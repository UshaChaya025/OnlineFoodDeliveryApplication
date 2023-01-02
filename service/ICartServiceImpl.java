package com.cg.ofda.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.ofda.dto.FoodCartDto;
import com.cg.ofda.dto.ItemDto;
import com.cg.ofda.repository.ICartRepository;

@Service
public class ICartServiceImpl implements ICartService{
	@Autowired
	
	ICartRepository cartRepository;

	@Override
	public FoodCartDto addItemToCart(String cartId, ItemDto item) {
		FoodCartDto cart = cartRepository.findById(cartId).get();
		List<ItemDto> items = cart.getItemList();
		items.add(item);
		cartRepository.save(cart);
		return cart;
	}
	
	public FoodCartDto viewCartById(String cartId) {
		return cartRepository.findById(cartId).get();
	}


	@Override
	public FoodCartDto removeItem(FoodCartDto cart, ItemDto item) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FoodCartDto clearCart(FoodCartDto cart) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FoodCartDto> viewCart() {
		return cartRepository.findAll();
	}

	@Override
	public FoodCartDto increaseQuantity(String cartId, String itemId, int quantity) {
		ItemDto it = null;
		FoodCartDto cart = cartRepository.findById(cartId).get();
		List<ItemDto> items = cart.getItemList();
		for(ItemDto item : items) {
			if(item.getItemId().equals(itemId))
			 it = item;
		}
		int qty = it.getQuantity();
		it.setQuantity(quantity+qty);
		cartRepository.save(cart);
		return cart;	
	}
	@Override
	public FoodCartDto reduceQuantity(String cartId, String itemId, int quantity) {
		ItemDto it = null;
		FoodCartDto cart = cartRepository.findById(cartId).get();
		List<ItemDto> items = cart.getItemList();
		for(ItemDto item : items) {
			if(item.getItemId().equals(itemId))
			 it = item;
		}
		int qty = it.getQuantity();
		it.setQuantity(qty - quantity);
		cartRepository.save(cart);
		return cart;
	}
}
