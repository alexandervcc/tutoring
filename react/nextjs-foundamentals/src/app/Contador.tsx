"use client";

import React, { useState } from "react";

let ejecuciones: number = 0;

const Contador = () => {
  const [contadorVerdadero, setContadorVerdadero] = useState<number>(0);

  ejecuciones += 1;
  console.log("Cantidad de veces ejecutado el componente: ", ejecuciones);

  let contador: number = 0;
  console.log("contador: ", contador);

  return (
    <div style={{ border: "2px solid red", margin: 8, padding: 8 }}>
      <input type="number" />
      <input type="number" />
      <button>sumar</button> <button>restar</button>
      <p>Resultado: -41</p>
      <h4>Contador: </h4>
      <button
        onClick={() => {
          // variable contador
          contador += 1;
          console.log("incrementar: ", contador);

          // estador contadorVerdadero
          const nuevoValorContadorVerdadero = contadorVerdadero + 1;
          setContadorVerdadero(nuevoValorContadorVerdadero);
        }}
      >
        +
      </button>
      <button
        onClick={() => {
          contador -= 1;
          console.log("decrementar: ", contador);

          const nuevoValorContadorVerdadero = contadorVerdadero - 1;
          setContadorVerdadero(nuevoValorContadorVerdadero);
        }}
      >
        -
      </button>
      <p>Valor contador: {contador}</p>
      <p>Valor contadorVerdadero: {contadorVerdadero}</p>
    </div>
  );
};

export default Contador;
