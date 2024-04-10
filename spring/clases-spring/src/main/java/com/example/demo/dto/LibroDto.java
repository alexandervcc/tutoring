package com.example.demo.dto;

// data transfer object
public class LibroDto {
	public Integer id;
	public String nombre;
	public String autor;
	public String[] generos;
	public Integer anio;
	public Double calificacion;
	
	public LibroDto(Integer id, String nombre, String autor, String[] generos, Integer anio, Double calificacion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.autor = autor;
		this.generos = generos;
		this.anio = anio;
		this.calificacion = calificacion;
	}
}
