package com.spring.boot.credibanco.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

import com.spring.boot.credibanco.soapWs.User;

@Service
public class SoapClient {

	@Autowired
	private Jaxb2Marshaller marshaller;

	private WebServiceTemplate template;
	
	
	public User infoUser(String email) {
		template = new WebServiceTemplate(marshaller);
		User response = (User) template.marshalSendAndReceive("http://localhost:9084/CheckOutWSWeb/CheckoutWSService", email);
		return response;
	}
}
