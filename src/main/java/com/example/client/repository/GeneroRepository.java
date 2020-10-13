package com.example.client.repository;

import java.util.List;

import org.springframework.data.repository.Repository;


import com.example.client.model.Genero;

public interface GeneroRepository extends Repository<Genero, Integer> {
	
	List<Genero> findAll();
	Genero findById(int id);
	Genero save(Genero genero);
	void delete(Genero genero);

}
