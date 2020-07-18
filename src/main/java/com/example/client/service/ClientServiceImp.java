package com.example.client.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.client.model.Client;
import com.example.client.repository.ClientRepository;

@Service
public class ClientServiceImp implements ClientServices  {
 @Autowired
   private ClientRepository repository;
 
	@Override
	public List<Client> getClient() {
		
		return repository.findAll();
	}

	@Override
	public Client getIdClient(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public Client add(Client client) {
		// TODO Auto-generated method stub
		return repository.save(client);
	}

	@Override
	public Client edit(Client client) {
		// TODO Auto-generated method stub
		return repository.save(client);
	}

	@Override
	public Client delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
