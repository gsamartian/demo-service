package com.demo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Demo;
import com.demo.service.DemoService;

@RestController
public class DemoController {
	private final DemoService demoService;

	public DemoController(DemoService demoService) {
		this.demoService = demoService;

	}
	
	@GetMapping("/api/demo/{id}")
	public String getDemosById(@PathVariable("id") String id) throws Exception{
			return demoService.getDemosById(id);
	}
	
	@GetMapping("/api/demo")
	public String getDemosByName(String name) throws Exception{
	if(null!=name) {
			return "Demo By Name:" + name;
		}else {
			return "Demo By Anonymous";
		}
	}
	
	@PostMapping("/api/demo")
	public String createDemo(@RequestBody Demo demo) throws Exception{
		return "Demo Created";
	}
	
	
}
