package com.cg.ofda.dto;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="FoodCart_Table")
public class FoodCartDto {
		
		@Id
		@Column(name="Cart_Id")
		String cartId;
		@OneToOne(cascade=CascadeType.ALL)
		@JoinColumn(name="Customer_Details")
		CustomerDto customer;
		@OneToMany(cascade = CascadeType.ALL)
		List<ItemDto> items = new ArrayList<ItemDto>();
		
		public FoodCartDto(String cartId, CustomerDto customer, List<ItemDto> itemList) {
			super();
			this.cartId = cartId;
			this.customer = customer;
			this.items = itemList;
		}
		
		public FoodCartDto() {
			super();
		}

		public String getCartId() {
			return cartId;
		}

		public void setCartId(String cartId) {
			this.cartId = cartId;
		}

		public CustomerDto getCustomer() {
			return customer;
		}

		public void setCustomer(CustomerDto customer) {
			this.customer = customer;
		}

		public List<ItemDto> getItemList() {
			return items;
		}

		public void setItemList(List<ItemDto> itemList) {
			this.items = itemList;
		}

		@Override
		public String toString() {
			return "FoodCart [cartId=" + cartId + ", customer=" + customer + ", itemList=" + items + "]";
		}



}
