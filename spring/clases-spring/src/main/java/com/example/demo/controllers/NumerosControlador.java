package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
// Utilizar un path compartido para todos los endpoints internos
@RequestMapping(value = "/numero")
public class NumerosControlador {
	@GetMapping(path="/n1")
	public int num1() {
		return 100;
	}
	
	@GetMapping(path="/n2")
	public int num2() {
		return 200;
	}
	
	@GetMapping(path = "/")
	public int devolverNumeroRecibido(
		@RequestParam(name = "search_query", required = false) Integer numero
	) {
		System.out.print("\n\n\n\n\n\nNUMERO: "+numero+"\n\n\n\n\n");
		return numero;
	}
	
	@GetMapping(path = "/potencia_cuadrada")
	public int calcularPotenciaCuadrada(
		@RequestParam(name = "n", required = false, defaultValue = "3") Integer numero
	) {
		return numero * numero;
	}
	
	
}
