package com.cg.ofda.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cg.ofda.dto.ItemDto;
import com.cg.ofda.service.IItemServiceImpl;

@RestController
@RequestMapping("/item")
public class ItemController {

	@Autowired
	IItemServiceImpl itemService;
	
	@PostMapping("/additem")
	public ItemDto addItem(@RequestBody ItemDto item) {
		return itemService.addItem(item);
	}
	
	@PutMapping("/updateitem")
	public ItemDto updateItem(@RequestBody ItemDto item) {
		return itemService.updateItem(item);
	}
	
	@GetMapping("/viewitem/{id}")
	public ItemDto viewItem(@PathVariable("id") String id) {
		return itemService.viewItem(id);
	}
	
	@DeleteMapping("/removeitem/{id}")
	public ItemDto removeItem(@PathVariable("id") String id) {
		return itemService.removeItem(id);
	}
	
	@GetMapping("/viewAllItemsByName/{itemName}")
	public List<ItemDto> viewAllItemsByName(@PathVariable("itemName") String itemName){
	return itemService.viewAllItemsByName(itemName);
	}
	
	@GetMapping("/viewallitems")
	public List<ItemDto> viewAllItems(){
		return itemService.viewAllItems();
	}
	
	@GetMapping("/viewallitemsbyrestaurantid/{id}")
	public List<ItemDto> viewAllItmes(@PathVariable("id") String restId){
		return itemService.viewAllItems(restId);
	}
	

}
