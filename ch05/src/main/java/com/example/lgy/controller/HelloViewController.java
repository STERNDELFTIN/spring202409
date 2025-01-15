package com.example.lgy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // 인스턴스 생성
@RequestMapping("hello") // 컨트롤러의 요청 핸들러 메서드와 URL 매핑
public class HelloViewController {
	
	@GetMapping("view") // GET 요청
	public String helloView() {
		return "hello"; // 뷰의 이름을 돌려줌
	}
}
