package com.cg.ofda.dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Item_Table")
public class ItemDto {
		@Id
		@Column(name="Item_Id")
		String ItemId;
		@Column(name="Item_Name")
		String ItemName;
		@OneToOne(cascade=CascadeType.ALL)
		CategoryDto category;
		@Column(name="quantity")
		int quantity;
		@Column(name="cost")
		double cost;
		
		@ManyToMany(cascade=CascadeType.ALL,mappedBy= "Item")
		@JsonIgnore
		List<RestaurantDto> restaurants = new ArrayList<RestaurantDto>();
		
		
		public ItemDto(String itemId, String itemName, CategoryDto category, int quantity, double cost,
				List<RestaurantDto> restuarants) {
			super();
			ItemId = itemId;
			ItemName = itemName;
			this.category = category;
			this.quantity = quantity;
			this.cost = cost;
			this.restaurants = restuarants;
			
		}
		
		public ItemDto() {
			super();
		}

		public String getItemId() {
			return ItemId;
		}

		public List<RestaurantDto> getRestaurants() {
			return restaurants;
		}

		

		public void setItemId(String itemId) {
			ItemId = itemId;
		}

		public String getItemName() {
			return ItemName;
		}

		public void setItemName(String itemName) {
			ItemName = itemName;
		}

		public CategoryDto getCategory() {
			return category;
		}

		public void setCategory(CategoryDto category) {
			this.category = category;
		}

		public int getQuantity() {
			return quantity;
		}

		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}

		public double getCost() {
			return cost;
		}

		public void setCost(double cost) {
			this.cost = cost;
		}


		public void setRestuarants(List<RestaurantDto> restuarants) {
			this.restaurants = restuarants;
		}

		@Override
		public String toString() {
			return "ItemDto [ItemId=" + ItemId + ", ItemName=" + ItemName + ", category=" + category + ", quantity="
					+ quantity + ", cost=" + cost + ", restaurants=" + restaurants
					+ "]";
		}

}
