package com.sameeksha;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmployeeController {
	private EmployeeService service;

	public EmployeeController(EmployeeService service) {
		super();
		this.service = service;
	}

	@GetMapping("/updateEmployee/{id}")
	public String getEmployee(@PathVariable int id,Model mav) {
	Employee emplo =  service.retriveByID(id);
	mav.addAttribute("employee",emplo);
	return "addEmployee";
	}

	@GetMapping("/deleteEmployee/{id}")
	public String deleteEmployee(@PathVariable int id) {
		service.removeByiD(id);
		return "redirect:/";
	}

	@GetMapping(path = {"/","employees"})
	public String getAllEmployee(Model model) {		
		model.addAttribute("list_of_Employees", service.retriveAll());
		//it Returns The HTML Page Name
		return "index";
	}
	@GetMapping(path = {"/addNew"})
	public String newEmployee(Model model) {	
		Employee employee = new Employee(0,"Enter Name",00000000l,"Address");
		model.addAttribute("employee", employee);
		//it Returns The HTML Page Name
		return "addEmployee";
	}

	@PostMapping("/save")
	public String getEmployee(@ModelAttribute("employee") Employee employee) {
		service.saveEmployee(employee);
		return "redirect:/";
	}
	
}
