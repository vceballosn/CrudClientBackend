package com.example.client.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.example.client.model.Client;

public interface ClientRepository extends Repository<Client, Integer> {
	
	List<Client> findAll();
	Client findById(int id);
	Client save(Client client);
	void delete(Client client);
	

}
