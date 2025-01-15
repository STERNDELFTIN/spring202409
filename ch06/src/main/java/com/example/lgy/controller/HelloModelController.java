package com.example.lgy.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("hello")
public class HelloModelController {
	
	@GetMapping("model")
	public String helloView(Model model) {
		// Model에 데이터 저장
		model.addAttribute("msg", "타임리프");
		model.addAttribute("name", "James");
		
		Info info = new Info(0, "James");
		model.addAttribute("mb", info);
		
		List<Integer> list = new ArrayList<>();
		list.add(42);
		list.add(100);
		list.add(58);
		list.add(77);
		model.addAttribute("list", list);
		
		return "helloTymeleaf";
		
	}
	
	public static class Info {
		public Integer id;
		public String name;
		
		public Info(Integer id, String name) {
			this.id = id;
			this.name = name;
		}
	}
}
