package com.cg.billing.beans;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.MapKey;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int customerID;
	private String firstName, lastName, emailID, dateOfBirth;
	
	private List<Address> address;
	private Map<Long, PostpaidAccount> postpaidAccounts = new HashMap<>();
	
	public Customer() {}

	public Customer(String firstName, String lastName, String emailID, String dateOfBirth, List<Address> address,
			Map<Long, PostpaidAccount> postpaidAccounts) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailID = emailID;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
		this.postpaidAccounts = postpaidAccounts;
	}

	public Customer(int customerID, String firstName, String lastName, String emailID, String dateOfBirth,
			List<Address> address, Map<Long, PostpaidAccount> postpaidAccounts) {
		super();
		this.customerID = customerID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailID = emailID;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
		this.postpaidAccounts = postpaidAccounts;
	}

	@Override
	public String toString() {
		return "Customer [customerID=" + customerID + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", emailID=" + emailID + ", dateOfBirth=" + dateOfBirth + ", address=" + address
				+ ", postpaidAccounts=" + postpaidAccounts + "]";
	}
	
	
}