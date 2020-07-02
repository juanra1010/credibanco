package com.spring.boot.credibanco.controller;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.credibanco.model.UserModelo;
import com.spring.boot.credibanco.service.UserService;

@RestController
@RequestMapping("user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@Produces(MediaType.APPLICATION_JSON)
	@GetMapping("{email}")
	public UserModelo extraerUsuario(@PathVariable("email") String email) {
		
		return userService.getUser(email);
	}

}
