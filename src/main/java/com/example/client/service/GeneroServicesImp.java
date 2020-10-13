package com.example.client.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.client.model.Client;
import com.example.client.model.Genero;
import com.example.client.repository.ClientRepository;
import com.example.client.repository.GeneroRepository;

@Service
public class GeneroServicesImp implements GeneroServices {
	
	 @Autowired
	   private GeneroRepository repository;
	 

	@Override
	public List<Genero> getGenroro() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Genero getIdGenero(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public Genero add(Genero client) {
		// TODO Auto-generated method stub
		return repository.save(client);
	}

	@Override
	public Genero edit(Genero client) {
		// TODO Auto-generated method stub
		return repository.save(client);
	}

	@Override
	public Genero delete(int id) {
		Genero g = repository.findById(id);
		  if(g != null )
		     repository.delete(g);
	return g;
	}

}
