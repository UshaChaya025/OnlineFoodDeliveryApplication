package com.cg.ofda.dto;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Bill_Table")
public class BillDto {
		@Id
		@Column(name="Bill_Id")
		String billid;
		
		@Column(name="Bill_Date")
		LocalDate billDate;
		
		@OneToOne(cascade=CascadeType.ALL)
		OrderDetailsDto order;
		
		@Column(name="Total_items")
		int totalitem;
		
		@Column(name="TotalCost")
		double totalcost;
		
		
		public BillDto(String billid, LocalDate billDate, OrderDetailsDto order, int totalitem, double totalcost) {
			super();
			this.billid = billid;
			this.billDate = billDate;
			this.order = order;
			this.totalitem = totalitem;
			this.totalcost = totalcost;
		}


		public BillDto() {
			super();
		}
		

		public String getBillid() {
			return billid;
		}


		public void setBillid(String billid) {
			this.billid = billid;
		}


		public LocalDate getBillDate() {
			return billDate;
		}


		public void setBillDate(LocalDate billDate) {
			this.billDate = billDate;
		}


		public int getTotalitem() {
			return totalitem;
		}


		public void setTotalitem(int totalitem) {
			this.totalitem = totalitem;
		}


		public double getTotalcost() {
			return totalcost;
		}


		public void setTotalcost(double totalcost) {
			this.totalcost = totalcost;
		}

		public OrderDetailsDto getOrder() {
			return order;
		}

		public void setOrder(OrderDetailsDto order) {
			this.order = order;
		}


		@Override
		public String toString() {
			return "BillDto [billid=" + billid + ", billDate=" + billDate + ", order=" + order + ", totalitem="
					+ totalitem + ", totalcost=" + totalcost + "]";
		}


		
		


}
