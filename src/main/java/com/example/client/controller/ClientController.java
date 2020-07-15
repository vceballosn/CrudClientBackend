package com.example.client.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


import com.example.client.model.Client;
import com.example.client.service.ClientServices;



@RestController
public class ClientController {
	
@Autowired
ClientServices clientServices;

@CrossOrigin(origins="http://localhost:4200")
@GetMapping("/client")
public List<Client> getClient() {
	
	return clientServices.getClient();
	
	
}
	

}
