package com.cg.ofda.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.ofda.dto.ItemDto;
import com.cg.ofda.dto.RestaurantDto;
import com.cg.ofda.repository.IItemRepository;
import com.cg.ofda.repository.IRestaurantRepository;
@Service
public class IItemServiceImpl implements IItemService {
	
	@Autowired
	IItemRepository itemRepository;
	@Autowired
	IRestaurantRepository restaurantRepository;
	
	
	/* @author : Usha 
	 * @return : Item 
	 * @description : This method adds Item to the repository and returns Item
	 */
	@Override
	public ItemDto addItem(ItemDto item) {
		itemRepository.save(item);
		return item;
	}

	/* @author : Usha 
	 * @return : Item 
	 * @description : This method updates the  Item in the repository and returns Item
	 */
	@Override
	public ItemDto updateItem(ItemDto item) {
		itemRepository.save(item);
		return item;
	}
	
	/* @author : Usha 
	 * @return : Item 
	 * @description : This method returns the  Item by id from the repository 
	 */
	@Override
	public ItemDto viewItem(String itemId) {
		return itemRepository.findById(itemId).get();
	}
	
	/* @author : Usha
	 * @return : Item 
	 * @description : This method removes the  Item by id from the repository and returns the item 
	 */

	@Override
	public ItemDto removeItem(String itemId) {
		ItemDto it = itemRepository.findById(itemId).get();
		itemRepository.delete(it);
		return it;
	}

	@Override
	public List<ItemDto> viewAllItems() {
		List<ItemDto> its = itemRepository.findAll();
		return its;
	}

	

	
	
	/* @author : Usha
	 * @return : List of Items 
	 * @description : This method return the list of Items by name from the repository 
	 */
	//@Override
	//public List<Item> viewAllItemsByName(String name) {
	//return itemRepository.viewAllItemsByName(name);
	//}
	
	public List<ItemDto> viewAllItemsByName(String itemName)
	{
	return itemRepository.viewAllItemsByName(itemName);
	}
	
	public List<ItemDto> viewAllItems(String restId){
		RestaurantDto restaurant = restaurantRepository.findById(restId).get();
		return restaurant.getItem();
	}
	
	
	

	

}
