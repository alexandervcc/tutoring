import React, { createContext } from "react";

// tipo de dato para el contexto
export type TemaContextoTipo = {
  color: "claro" | "oscuro";
  cambiarThema: () => void;
};

// Creacion del contexto
const TemaContexto = createContext<TemaContextoTipo | undefined>(undefined);

export default TemaContexto;