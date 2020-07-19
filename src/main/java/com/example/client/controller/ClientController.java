package com.example.client.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.client.model.Client;
import com.example.client.service.ClientServices;


@CrossOrigin(origins="http://localhost:4200")
@RequestMapping({"/client"})
@RestController
public class ClientController {
	
@Autowired
ClientServices clientServices;

@GetMapping
public List<Client> getClient() {
	
	return clientServices.getClient();
	
	
}

@PostMapping
public Client add (@RequestBody Client client)	{
	return clientServices.add(client);
}

@GetMapping (path = {"/{id}"} )
public Client listId(@PathVariable("id") int id) {

  return clientServices.getIdClient(id);
}

@PutMapping(path = {"/{id}"})

public Client edit (@RequestBody Client c,@PathVariable("id") int id) {
	
	c.setId(id);
	return clientServices.edit(c);
}	
	
	
@DeleteMapping(path = {"/{id}"})

public Client delete(@PathVariable("id") int id) {
	
	return clientServices.delete(id);
}


}


