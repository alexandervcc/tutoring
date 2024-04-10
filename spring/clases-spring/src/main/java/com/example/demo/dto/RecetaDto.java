package com.example.demo.dto;

import java.util.List;

public class RecetaDto {
	public String nombre;
	public Double precio;
	public List<IngredienteDto> ingredientes; // en vez de []
	public ChefDto chef;
	
	public RecetaDto(String nombre, Double precio, List<IngredienteDto> ingredientes, ChefDto chef) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.ingredientes = ingredientes;
		this.chef = chef;
	}
	
	
}
