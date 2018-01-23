package com.luisgomezcaballero.spring_mvc_demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

	@RequestMapping("/myurl")
	public String myMethod(Model model) {
		model.addAttribute("myAttribute", "Hello World!");
		return "myPage";
	}

}
