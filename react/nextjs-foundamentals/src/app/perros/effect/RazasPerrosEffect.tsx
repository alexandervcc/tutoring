"use client";

import { RazasPerros, obtenerRazasDePerros } from "@/http/razas-perros";
import React, { useEffect, useState } from "react";

const RazasPerrosEffect = () => {
  const [razasDePerros, setRazasDePerros] = useState<RazasPerros>();

  useEffect(() => {
    obtenerRazasDePerros()
      .then((res) => {
        setRazasDePerros(res);
      })
      .catch((e) => {
        alert("No se pudo obtener las razas de perros.");
      });
  }, []);

  return (
    <div style={{ border: "2px solid blue" }}>
      <h3>Razas de Perros, useEffect</h3>
      {razasDePerros == null && <p>Cargando razas ...</p>}
      <p> {JSON.stringify(razasDePerros)} </p>
    </div>
  );
};

export default RazasPerrosEffect;
