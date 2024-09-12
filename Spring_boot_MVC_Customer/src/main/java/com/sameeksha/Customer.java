package com.sameeksha;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Customer {
	@Id
	private int id;
	private String name;
	private int amount;
	private String type;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Customer(int id, String name, int amount, String type) {
		super();
		this.id = id;
		this.name = name;
		this.amount = amount;
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", amount=" + amount + ", type=" + type + "]";
	}
	
	
}
