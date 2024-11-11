"use client";

import { HechoGato, hechosDeLosGatos } from "@/http/palabras";
import React, { useState } from "react";

const HechosGatos = () => {
  const [hechosGato, setHechosGato] = useState<HechoGato[]>([]);

  if (hechosGato.length === 0) {
    hechosDeLosGatos()
      .then((resultado) => {
        // Si la operacion asincrona es exitosa, este metodo
        // recibira el resultado.
        console.log(">>>>>>>>>>>>>: ", resultado);
        setHechosGato(resultado);
      })
      .catch((e) => {
        // Si sucede un error el catch captura el error.
        console.error("ERROR: ", e);
      });
  }

  return (
    <div style={{ border: "2px solid blue" }}>
      <h3>Hechos de los Gatos</h3>
      {hechosGato.length === 0 && <p>No hay hechos que mostrar.</p>}
      {hechosGato.length > 0 &&
        hechosGato.map((hecho) => (
          <div key={hecho._id}>
            <hr />
            <p>
              <b>Id: </b> {hecho._id}
            </p>
            <p>
              <b>Hecho: </b> {hecho.text}
            </p>
            <p>
              <b>Fecha de creacion: </b> {hecho.createdAt}
            </p>
          </div>
        ))}
    </div>
  );
};

export default HechosGatos;
