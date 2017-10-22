package com.anigna.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	@GetMapping("/demo")
	public String demo() {
		return "Index";
	}
}
