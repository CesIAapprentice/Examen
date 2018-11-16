package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeController {
	
	@RequestMapping("/enteremployee")
	public String enteremployee(ModelMap modelMap) {
		//modelMap.put("product", new Product());
		return "enteremployee";
	}

}
