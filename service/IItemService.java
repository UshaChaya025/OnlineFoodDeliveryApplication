package com.cg.ofda.service;

import java.util.List;

import com.cg.ofda.dto.ItemDto;

public interface IItemService {
	
	public ItemDto addItem(ItemDto item);
	public ItemDto updateItem(ItemDto item);
	public ItemDto viewItem(String itemId);
	public ItemDto removeItem(String itemId);
	public List<ItemDto> viewAllItems();

}
