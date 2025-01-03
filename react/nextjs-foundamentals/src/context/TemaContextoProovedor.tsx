"use client";

import React, { useState } from "react";
import TemaContexto, { TemaContextoTipo } from "./TemaContexto";


// El provedor debe utilizar props con children
const TemaContextoProovedor: React.FC<{ children: React.ReactNode }> = ({
  children,
}) => {
  // Configurar los valores necesarios para el contexto
  const [tema, setTema] = useState<TemaContextoTipo["color"]>("claro");

  const cambiarThema = () => {
    const nuevoTema = tema === "claro" ? "oscuro" : "claro";
    setTema(nuevoTema);
  };

  return (
    // Utilizar el .Provider desde el tema creado
    // Hay que configurar los valores iniciales del tema
    <TemaContexto.Provider value={{ cambiarThema, color: tema }}>
      {/* El children pase dentro del contexto */} 
      {children}
    </TemaContexto.Provider>
  );
};

export default TemaContextoProovedor;
