package com.example.demo.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.VerboHttpDto;

@RestController
@RequestMapping(value = "/verbos")
public class VerbosController {
	
	// GET -> consultar/obtener datos
	@GetMapping(value = "/")
	public VerboHttpDto get() {
		VerboHttpDto v =  new VerboHttpDto("GET");
		return v;
	}
	
	// POST -> crear
	@PostMapping(value = "/")
	public VerboHttpDto post() {
		VerboHttpDto v =  new VerboHttpDto("POST");
		return v;
	}
	
	// PUT -> actualizar
	@PutMapping(value = "/")
	public VerboHttpDto put() {
		VerboHttpDto v =  new VerboHttpDto("PUT");
		return v;
	}
	
	
	// DELETE -> eliminar
	@DeleteMapping(value = "/")
	public VerboHttpDto delete() {
		VerboHttpDto v =  new VerboHttpDto("DELETE");
		return v;
	}
	
		

}
