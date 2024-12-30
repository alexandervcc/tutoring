import React from "react";
import ContadorSinUseHook from "./ContadorSinUseHook";
import ContadorConUseHook from "./ContadorConUseHook";

const ContadorPagina = () => {
  return (
    <div>
      <h1>Contador</h1>
      <ContadorSinUseHook />
      <ContadorConUseHook />
    </div>
  );
};

export default ContadorPagina;
