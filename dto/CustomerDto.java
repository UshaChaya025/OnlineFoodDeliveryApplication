package com.cg.ofda.dto;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Customer_Table")

public class CustomerDto {
	
			@Id
			@Column(name="Customer_Id")
			String customerId;
			@Column(name="First_Name", length = 20)
			String firstName;
			@Column(name="Last_Name")
			String lastName;
			@Column(name="Age")
			int age;
			@Column(name="Gender")
			String gender;
			@Column(name="Mobile_No")
			String mobileNumber;
			@Column(name="Email")
			String email;
			@OneToOne(cascade=CascadeType.ALL)
			@JoinColumn(name="Address_Of_Customer")
			AddressDto address;
			
			public CustomerDto() {
				
			}



			public CustomerDto(String customerId, String firstName, String lastName, int age, String gender, String mobileNumber,
					String email, AddressDto address) {
				super();
				this.customerId = customerId;
				this.firstName = firstName;
				this.lastName = lastName;
				this.age = age;
				this.gender = gender;
				this.mobileNumber = mobileNumber;
				this.email = email;
				this.address = address;
			}



			public String getCustomerId() {
				return customerId;
			}

			public void setCustomerId(String customerId) {
				this.customerId = customerId;
			}

			public String getFirstName() {
				return firstName;
			}

			public void setFirstName(String firstName) {
				this.firstName = firstName;
			}

			public String getLastName() {
				return lastName;
			}

			public void setLastName(String lastName) {
				this.lastName = lastName;
			}

			public int getAge() {
				return age;
			}

			public void setAge(int age) {
				this.age = age;
			}

			public String getMobileNumber() {
				return mobileNumber;
			}

			public void setMobileNumber(String mobileNumber) {
				this.mobileNumber = mobileNumber;
			}

			

			public String getEmail() {
				return email;
			}

			public void setEmail(String email) {
				this.email = email;
			}

			public String getGender() {
				return gender;
			}



			public void setGender(String gender) {
				this.gender = gender;
			}



			public AddressDto getAddress() {
				return address;
			}



			public void setAddress(AddressDto address) {
				this.address = address;
			}



			@Override
			public String toString() {
				return "Customer [customerId=" + customerId + ", firstName=" + firstName + ", lastName=" + lastName + ", age="
						+ age + ", gender=" + gender + ", mobileNumber=" + mobileNumber + ", email=" + email + ", address="
						+ address + "]";
			}



			



}
