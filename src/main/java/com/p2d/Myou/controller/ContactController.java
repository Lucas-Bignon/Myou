package com.p2d.Myou.controller;

import com.p2d.Myou.model.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ContactController {

	@GetMapping("/list")
	public List<Contact> list(){
		return null;
	}

}
