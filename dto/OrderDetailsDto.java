package com.cg.ofda.dto;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "OrderDetails")
public class OrderDetailsDto {
		@Id
		@Column(name = "Order_ID")
		int orderId;
	    @Temporal(TemporalType.DATE)
		LocalDate orderDate;
		@Column( name = "Order_Status")
		String orderStatus;
		@OneToOne(cascade=CascadeType.ALL)
		FoodCartDto cart;
		
		

		public OrderDetailsDto() {
			super();

		}

		public OrderDetailsDto(int orderId, LocalDate orderDate,FoodCartDto cart, String orderStatus) {
			super();
			this.orderId = orderId;
			this.orderDate = orderDate;
			this.orderStatus = orderStatus;
			this.cart = cart;
		}

		public int getOrderId() {
			return orderId;
		}

		public void setOrderId(int orderId) {
			this.orderId = orderId;
		}

		public LocalDate getOrderDate() {
			return orderDate;
		}

		public void setOrderDate(LocalDate orderDate) {
			this.orderDate = orderDate;
		}

		public FoodCartDto getCart() {
			return cart;
		}

		public void setCart(FoodCartDto cart) {
			this.cart = cart;
		}

		public String getOrderStatus() {
			return orderStatus;
		}

		public void setOrderStatus(String orderStatus) {
			this.orderStatus = orderStatus;
		}

		@Override
		public String toString() {
			return "OrderDetails [orderId=" + orderId + ", orderDate=" + orderDate + ", orderStatus=" + orderStatus
					+ ", cart=" + cart + "]";
		}



}
