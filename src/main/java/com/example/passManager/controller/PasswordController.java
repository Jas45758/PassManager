package com.example.passManager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.passManager.model.Credential;
import com.example.passManager.service.PasswordService;
import java.util.*;



@RestController
@RequestMapping("/api/passwords")

public class PasswordController {
	
	@Autowired
	private PasswordService passwordService;
	
	@PostMapping("/save")
	public String saveCredential(@RequestParam String username, @RequestParam String service, String password) {
		passwordService.saveCredential(username, service, password);
		return "Password saves successfully";
	}
	@GetMapping("/get")
	public String getPassword(@RequestParam String username, @RequestParam String service, String password) {
		return passwordService.getPassword(username, service);
	}
	@GetMapping("/all")
	public List<Credential> getAllCrednetial(){
		return passwordService.getAllCredential();
	}
	
}
