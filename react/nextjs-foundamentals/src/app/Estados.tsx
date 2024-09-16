"use client";

import React, { useState } from "react";

let cantidadRenderizaciones = 0;

const Estados = () => {
  const [numero, setNumero] = useState<number>(0);
  let numero2 = 0;

  cantidadRenderizaciones += 1;

  const imprimirEnConsola = () => {
    console.log("imprimiendo");
  };
  const estado = true;

  return (
    <div style={{ border: "3px solid green" }}>
      Estados
      <p>
        <b>Numero solo en variable: </b>
        {numero2}
      </p>
      <button onClick={imprimirEnConsola}>Boton Activo</button>
      <button onClick={imprimirEnConsola} disabled={estado}>
        Boton Inactivo
      </button>
      <p>
        <b>Numero en estado: </b>
        {numero}
      </p>
      <p>
        <b>Cantidad de renderizaciones: </b>
        {cantidadRenderizaciones}
      </p>
      <button
        onClick={() => {
          numero2 += 1;
          console.log("numero variable: ", numero2);
        }}
      >
        Incrementar variable numero
      </button>
      <button
        onClick={() => {
          const nuevoNumero = numero + 1;
          setNumero(nuevoNumero);
        }}
      >
        Incrementar estado numero
      </button>
    </div>
  );
};

export default Estados;
