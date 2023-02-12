package com.example.demo;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HeloController {
	
	@GetMapping("/board/list")
	public void list(HttpSession ses, Model model) {
		String str = (String) ses.getAttribute("ee");
		model.addAttribute("str", str);

	}
	@GetMapping("/board/aaa")
	public void aaa(Model model, HttpSession ses) {
		ses.setAttribute("ee", "tt");
		model.addAttribute("str", ses.getAttribute("ee"));
	}
}
