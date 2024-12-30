"use client";

import React from "react";
import useObtenerRazasPerros from "@/hooks/useObtenerRazasPerros";

const RazasPerrosHook = () => {
  const { razasDePerros, cargando } = useObtenerRazasPerros();

  return (
    <div style={{ border: "2px solid blue" }}>
      <h3>Razas de Perros, custom hook</h3>
      {cargando && <p>Cargando razas ...</p>}
      {razasDePerros != null && <p> {JSON.stringify(razasDePerros)} </p>}
    </div>
  );
};

export default RazasPerrosHook;
