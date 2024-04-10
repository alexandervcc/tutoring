package com.example.demo.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.ChefDto;
import com.example.demo.dto.IngredienteDto;
import com.example.demo.dto.RecetaDto;

@RestController
public class RecetaController {
	@GetMapping(value = "/receta")
	public RecetaDto reseta() {
		ChefDto chef = new ChefDto("marcela", "gomez", 28, "cuenca");
		IngredienteDto ingrediente1 = new IngredienteDto("cerdo", 2);
		IngredienteDto ingrediente2 = new IngredienteDto("papa", 10);
		IngredienteDto ingrediente3 =  new IngredienteDto("mote", 8);
		
		List<IngredienteDto> ingredientes = List.of(ingrediente1, ingrediente2, ingrediente3);
		
		RecetaDto nuevaReceta = new RecetaDto( 
				"hornado", 
				2.5,
				ingredientes,
				chef
				);
		return nuevaReceta;
	}
}
