package com.cg.ofda.dto;

import java.util.ArrayList;
import java.util.List;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Restaurant_Table")
public class RestaurantDto {
		@Id
		@Column(name="Restaurant_Id")
		String restaurantId;
		String restaurantName;
		@OneToOne(cascade=CascadeType.ALL)
		//@JoinColumn(name = "Address_id")
		AddressDto address;
		
		
		@ManyToMany(cascade=CascadeType.ALL)
		
		List<ItemDto> Item = new ArrayList<ItemDto>();
		public RestaurantDto() {
			super();
		}
		@Column(name="Manager_Name")
		String managerName;
		@Column(name="Contact_Number")
		String contactNumber;
		
		public RestaurantDto(String restaurantId, String restaurantName, AddressDto address, List<ItemDto> item,
				String managerName, String contactNumber) {
			super();
			this.restaurantId = restaurantId;
			this.restaurantName = restaurantName;
			this.address = address;
			Item = item;
			this.managerName = managerName;
			this.contactNumber = contactNumber;
		}
		public String getRestaurantId() {
			return restaurantId;
		}
		public void setRestaurantId(String restaurantId) {
			this.restaurantId = restaurantId;
		}
		public String getRestaurantName() {
			return restaurantName;
		}
		public void setRestaurantName(String restaurantName) {
			this.restaurantName = restaurantName;
		}
		public AddressDto getAddress() {
			return address;
		}
		public void setAddress(AddressDto address) {
			this.address = address;
		}
		public List<ItemDto> getItem() {
			return Item;
		}
		public void setItem(List<ItemDto> item) {
			Item = item;
		}
		public String getManagerName() {
			return managerName;
		}
		public void setManagerName(String managerName) {
			this.managerName = managerName;
		}
		public String getContactNumber() {
			return contactNumber;
		}
		public void setContactNumber(String contactNumber) {
			this.contactNumber = contactNumber;
		}
		@Override
		public String toString() {
			return "Restaurant [restaurantId=" + restaurantId + ", restaurantName=" + restaurantName + ", address="
					+ address + ", Item=" + Item + ", managerName=" + managerName + ", contactNumber=" + contactNumber
					+ "]";
		}


}
