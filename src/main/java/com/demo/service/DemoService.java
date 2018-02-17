package com.demo.service;

import org.springframework.stereotype.Component;

@Component
public class DemoService {


	public String getDemosById(String id) throws Exception {
	if("p1".equalsIgnoreCase(id)){
			return "Demo Details:" + "New Demo";
		}else if("p2".equalsIgnoreCase(id)){
			return "Demo Details:" + "Old Demo";
		}else{
			return "Demo Details:" + "Custom Demo";
		}
	}

}
