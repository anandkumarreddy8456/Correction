package com.telusko.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AnandController {
	@GetMapping("/run")
	public String run() {
		return "home";
	}
	@PostMapping("/view")
	public String viewdetail(@RequestParam("id") String id,@RequestParam("id") String name,@RequestParam("id") String cemail, ModelMap map) {
		System.out.println("Hello");
		map.put("id",id);
		map.put("name",name);
		map.put("cemail",cemail);
		return "viewDetails";
	}
}
