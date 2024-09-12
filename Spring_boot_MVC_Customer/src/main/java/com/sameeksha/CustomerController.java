package com.sameeksha;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CustomerController {

	private CustomerService service;

	public CustomerController(CustomerService service) {
		super();
		this.service = service;
	}
	
	@GetMapping("/updateCustomer/{id}")
	public String getCustomer(@PathVariable int id,Model mav) {
	Customer cust =  service.retriveByID(id);
	mav.addAttribute("customer",cust);
	return "addCustomer";
	}

	@GetMapping("/deleteCustomer/{id}")
	public String deleteCustomer(@PathVariable int id) {
		service.removeByiD(id);
		return "redirect:/";
	}
	
	@GetMapping("/customers/{id}")
	public String getAccount(@PathVariable int id, Model model) {
		Customer customer = service.retriveByID(id);
		model.addAttribute("cust", customer);
		return "viewCustomer";
	}


	@GetMapping(path = {"/","customers"})
	public String getAllCustomer(Model model) {		
		model.addAttribute("list_of_customers", service.retriveAll());
		return "index";
	}
	
	@GetMapping(path = {"/addNew"})
	public String newCustomer(Model model) {	
		Customer customer = new Customer(0,"Enter Name",0000001,"Enter Type");
		model.addAttribute("customer", customer);
		return "addCustomer";
	}
	
	@PostMapping("/save")
	public String getCustomer(@ModelAttribute("customer") Customer customer) {
		service.saveCustomer(customer);
		return "redirect:/";
	}
	
	@PostMapping("/withdraw/{id}")
	public String withdraw(@PathVariable int id, @ModelAttribute("amount") int amount) {
		service.withdraw(id, amount);
		return "redirect:/customers/" + id;
	}

	@PostMapping("/deposit/{id}")
	public String deposit(@PathVariable int id, @ModelAttribute("amount") int amount) {
		service.deposit(id, amount);
		return "redirect:/customers/" + id;
	}

}
