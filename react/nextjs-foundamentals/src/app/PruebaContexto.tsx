"use client";
import TemaContexto from "@/context/TemaContexto";
import React, { useContext } from "react";

const PruebaContexto = () => {
  // Para acceder al contexto, hay que usar el hook `useContext`
  const context = useContext(TemaContexto);

  return (
    <div style={{ border: "2px solid blue", padding: 8 }}>
      <h2>Prueba Contexto</h2>
      <p>
        <b>Tema:</b>
        {context?.color}
      </p>
      <br />
      <button
        onClick={() => {
          context?.cambiarThema();
        }}
      >
        Cambiar Tema
      </button>
    </div>
  );
};

export default PruebaContexto;
