package com.ezen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecurityController {

	@GetMapping("/")
	public String index() {
		System.out.println("index 요청입니다.");
		return "index";
	}
	
	@GetMapping("/member")
	public void forMember() {
		System.out.println("Member 요청입니다.");
	}
	
	@GetMapping("/manager")
	public void forManager() {
		System.out.println("Manager 요청입니다.");
	}
	
	@GetMapping("/admin")
	public void forAdmin() {
		System.out.println("Admin 요청입니다.");
	}
	
	/*
	 * 로그인 화면 요청
	 */
	@GetMapping("/login")
	public void login() {
	}

	/*
	 * 로그인 성공후 표시하는 화면
	 */
	@GetMapping("/loginSuccess")
	public void loginSuccess() {
	}
	
	/*
	 * 접근권한 없음 페이지 표시
	 */
	@GetMapping("/accessDenied")
	public void accessDenied() {
	}
}







