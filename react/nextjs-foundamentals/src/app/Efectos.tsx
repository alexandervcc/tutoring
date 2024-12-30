"use client";
import React, { useState, useEffect } from "react";

/**
 * Efectos
 * Son codigos que se disparan al cambiar un estado
 */

const Efectos = () => {
  const [contador, setContador] = useState<number>(0);
  const [contador2, setContador2] = useState<number>(0);

  const handleIncrementar = () => {
    setContador(contador + 1);
  };
  const handleIncrementar2 = () => {
    setContador2(contador2 + 1);
  };

  useEffect(()=>{
    // Si la lista de valores escuchados esta vacia,
    // el efecto se ejecutara una y solo una vez
    // cuando el componente se renderiza por primera vez
    console.log("Effecto de rendeirzado")

    // Es bastante util, para llamadas HTTP
  },[])

  useEffect(() => {
    // condigo
    console.log("efecto ejecutado del contador 1: ", contador);
    // lista de dependencias
  }, [contador]);

  useEffect(() => {
    // condigo
    console.log("efecto ejecutado del contador 2: ", contador2);
    // lista de dependencias
  }, [contador2]);

  useEffect(() => {
    // condigo
    console.log("uno de los contadores cambio");
    // lista de dependencias
  }, [contador2, contador]);

  return (
    <div style={{ border: "2px solid red" }}>
      <h2>Contador usando useEffect (Efectos)</h2>
      <p>
        <b>Contador1 :</b>
        {contador}
      </p>
      <p>
        <b>Contador2 :</b>
        {contador2}
      </p>
      <button onClick={handleIncrementar}>Incrementar 1</button>
      <button onClick={handleIncrementar2}>Incrementar2 </button>
    </div>
  );
};

export default Efectos;
