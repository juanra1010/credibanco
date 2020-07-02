package com.spring.boot.credibanco.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.credibanco.client.SoapClient;
import com.spring.boot.credibanco.model.UserModelo;
import com.spring.boot.credibanco.soapWs.User;

@Service
public class UserService {
	
	@Autowired
	SoapClient client;
	
	public UserModelo getUser(String email) {
		User user = client.infoUser(email);
		UserModelo userModelo = new UserModelo(user);
		
		return userModelo;		
	}
	
}
