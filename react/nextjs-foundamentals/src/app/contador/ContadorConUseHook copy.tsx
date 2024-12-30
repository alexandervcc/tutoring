"use client";
import React from "react";
import useContador from "@/hooks/useContador";

const ContadorConUseHook = () => {
  const { valor, decrementar, incrementar } = useContador();

  return (
    <div style={{ border: "1px solid gray", padding: 16 }}>
      <h3>Contador Con Use Hook</h3>
      <input type="number" disabled value={valor} />
      <br />
      <button onClick={incrementar}>Incrementar</button>
      <button onClick={decrementar}>Decrementar</button>
    </div>
  );
};

export default ContadorConUseHook;
