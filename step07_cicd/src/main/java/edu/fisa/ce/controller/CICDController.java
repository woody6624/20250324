package edu.fisa.ce.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CICDController {
	@GetMapping("fisa1")
	public String reqRes() {
		System.out.println("안녕!");
		return "응답 요청 성공";
	}
}
