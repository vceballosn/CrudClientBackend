package com.example.client.service;

import java.util.List;

import com.example.client.model.Client;

public interface ClientServices {
	List<Client> getClient();
	Client getIdClient(int id);
	Client add(Client client);
	Client edit(Client client);
	Client delete(int id);
	
}
