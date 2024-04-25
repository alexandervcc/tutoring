package com.example.demo.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.ReqRegistrarDto;
import com.example.demo.dto.ResRegistrarDto;

@RestController
@RequestMapping(value = "/usuario")
public class BodyParamController {
    @PostMapping(value = "/registrar")
    public ResRegistrarDto registarNuevoUsuario(
            // Nueva anotacion para recibir Body en el endpoint
            @RequestBody ReqRegistrarDto datosNuevoUsuario
    ) {
        String contrasenaEncriptada = "45098" + datosNuevoUsuario.contrasena.toUpperCase() + "~skal";
        System.out.println("\n\n\n\n\nContrasena encriptada: " + contrasenaEncriptada + "\n\n\n\n\n");

        ResRegistrarDto resultadoRegistro = new ResRegistrarDto();
        resultadoRegistro.email = datosNuevoUsuario.email;
        resultadoRegistro.nombreUsuario = datosNuevoUsuario.nombreUsuario;
        resultadoRegistro.resultado = "REGISTRO EXITOSO";

        return resultadoRegistro;
    }
}
