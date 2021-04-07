package com.p2d.Myou.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ContactController {

	@GetMapping("/list")
	public List<Contact> list(){
		return null;
	}

}
