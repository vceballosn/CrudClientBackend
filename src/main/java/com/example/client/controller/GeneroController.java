package com.example.client.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.client.model.Genero;
import com.example.client.service.GeneroServices;

@CrossOrigin(origins="http://localhost:4200")
@RequestMapping({"/genero"})
@RestController
public class GeneroController {
	@Autowired
	GeneroServices generoServices;
	
	@GetMapping
	public List<Genero> getClient() {
		
		return generoServices.getGenroro();
		
		
	}

	@PostMapping
	public Genero add (@RequestBody Genero genero)	{
		return generoServices.add(genero);
	}

	@GetMapping (path = {"/{id}"} )
	public Genero listId(@PathVariable("id") int id) {

	  return generoServices.getIdGenero(id);
	}

	@PutMapping(path = {"/{id}"})

	public Genero edit (@RequestBody Genero g,@PathVariable("id") int id) {
		
		g.setId(id);
		return generoServices.edit(g);
	}	
		
		
	@DeleteMapping(path = {"/{id}"})

	public Genero delete(@PathVariable("id") int id) {
		
		return generoServices.delete(id);
	}
	

}
