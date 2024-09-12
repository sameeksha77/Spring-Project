package com.sameeksha;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CustomerService {

	private CustomerRepository repository;
	private int id=100;

	public CustomerService(CustomerRepository repository) {
		super();
		this.repository = repository;
		repository.save(new Customer(id++,"Sameeksha", 500000, "Saving"));
		repository.save(new Customer(id++,"Shraddha",700000 ,"Current")); 
		repository.save(new Customer(id++,"Vaishnavi",890000, "Saving")); 
		repository.save(new Customer(id++,"Shreya",760000, " Current")); 
	}
	public Customer retriveByID(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id).get();
	}
	
	public List<Customer> retriveAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	public void saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		repository.save(customer);
	}

	public void removeByiD(int id2) {
		// TODO Auto-generated method stub
		repository.deleteById(id2);	
	}

    
    public void withdraw(int id, int amount) {
		Customer customer = retriveByID(id);
		if (customer != null && customer.getAmount() >= amount) {
			customer.setAmount(customer.getAmount() - amount);
			repository.save(customer);
		}
	}

	public void deposit(int id, int amount) {
		Customer customer = retriveByID(id);
		if (customer != null) {
			customer.setAmount(customer.getAmount() + amount);
			repository.save(customer);
		}
	}

	
}
