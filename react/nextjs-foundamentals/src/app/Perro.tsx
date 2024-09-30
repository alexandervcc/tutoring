"use client";
import React, { useState } from "react";

type Perro = {
  nombre: string;
  edad: number;
};

const Perro = () => {
  const [] = useState<string>("");

  const [perro, setPerro] = useState<Perro>({
    edad: 0,
    nombre: "Mana",
  });

  console.log("Perro: ", perro);
  return (
    <div>
      Perro
      <p>Nombre: {perro?.nombre}</p>
      <p>Edad: {perro?.edad}</p>
      <button
        onClick={() => {
          const nuevoPerro: Perro = {
            nombre: perro.nombre,
            edad: perro.edad + 1,
          };
          setPerro(nuevoPerro);
        }}
      >
        Modificar perro
      </button>
    </div>
  );
};

export default Perro;
