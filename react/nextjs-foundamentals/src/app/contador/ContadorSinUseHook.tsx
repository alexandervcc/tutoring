"use client";
import React, { useState } from "react";

const ContadorSinUseHook = () => {
  const [valor, setValor] = useState<number>(0);

  const incrementar = () => {
    setValor(valor + 1);
  };
  const decrementar = () => {
    setValor(valor - 1);
  };

  return (
    <div style={{ border: "1px solid gray", padding: 16 }}>
      <h3>Contador Sin Use Hook</h3>
      <input type="number" disabled value={valor} />
      <br />
      <button onClick={incrementar}>Incrementar</button>
      <button onClick={decrementar}>Decrementar</button>
    </div>
  );
};

export default ContadorSinUseHook;
