package com.example.client.service;

import java.util.List;

import com.example.client.model.Genero;

public interface GeneroServices {

	List<Genero> getGenroro();
	Genero getIdGenero(int id);
	Genero add(Genero genero);
	Genero edit(Genero genero);
	Genero delete(int id);

}
