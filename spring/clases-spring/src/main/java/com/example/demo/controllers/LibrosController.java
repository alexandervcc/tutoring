package com.example.demo.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.LibroDto;

@RestController
@RequestMapping(value = "/libros")
public class LibrosController {
	private List<LibroDto> listaLibros = List.of(
			new LibroDto(1, "Renglones torcidos de dios", "Tortuaco Luca de Tena", new String[] { "novela", "psicologica" }, 1980, 4.9),
			new LibroDto(2, "Los hijos del Capitan Grant", "Julio Verne", new String[] { "novela", "fantasia" }, 1845, 4.2)

	);

	@GetMapping(value = "/libro1")
	public LibroDto obtenerLibro() {
		LibroDto nuevoLibro = new LibroDto(99, "Los miserables", "Victor Hugo", new String[] { "novela", "historico" },
				1789, 4.7);
		return nuevoLibro;
	}

	// path param
	/*
	 * Ejemplo de solo recibir el valor y devolverlo
	@GetMapping(value = "/{idLibro}")
	public String buscarLibro(@PathVariable("idLibro") String idLibro) {
		return idLibro + "-" + idLibro;
	}
	*/
	
	/**
	 * Obtiene el id del libro del path param, y procede a buscar en la lista de libros del controlador
	 * @param idLibro
	 * @return
	 */
	@GetMapping(value = "/{idLibro}")
	public LibroDto buscarLibro(@PathVariable("idLibro") Integer idLibro) {
		LibroDto libroBuscado = null;
		for(LibroDto l:this.listaLibros) {
			if(l.id==idLibro) {
				libroBuscado = l;
				break;
			}
		}
		
		if(libroBuscado == null) {
			throw new RuntimeException("Libro no encontrado");
		}
		
		return libroBuscado;
		
	}

}
