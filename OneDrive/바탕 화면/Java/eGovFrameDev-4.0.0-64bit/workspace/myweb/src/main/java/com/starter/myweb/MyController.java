package com.starter.myweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller	//홈페이지와 연결해주는 코드
public class MyController {
	
	@GetMapping("/my")		// /my로 들어가면
	public String home() {
		return "index";		//해당이 html파일을 열어줌
	}
}
