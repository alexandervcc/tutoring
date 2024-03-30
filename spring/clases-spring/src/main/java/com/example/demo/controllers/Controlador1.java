package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlador1 {
	
	@GetMapping(path = "/hola")
	public String hola() {
		System.out.println("\n\n\n\n\n\n\n\nControlador1::hola");
		return "hola como estas";
	}
	
	@GetMapping(path = "/hola/xd")
	public String holaxd() {
		String texto = "hola xd";
		System.out.println("\n\n\n\n\n\n\n\nControlador1::holaxd: "+texto);
		return texto;
	}
	
	
}
