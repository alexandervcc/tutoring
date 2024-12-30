/*
 HOOKS
  - Manejar el estado y gestionar efectors secundarios de forma independiente de los componentes
  - Permite compartir/reutilziar logica de estados
  - Solo pueden ser llamados por componentes u otros hooks
  - Solo se llaman en el nivel superior de un componente/hook (no puede estar dentro de condiciones, o bucles, funciones anididas)
  - No devuelven JSX: Devuelve valores (variables) o  funciones, o no devolver nada. 
  - El archivo:
      - El nombre del archivo debe empezar con la palabra `use`
      - El archivo de preferencia, debe terminar con `.ts` (`.tsx`, pocos casos donde el hook devolvera tambien JSX)

*/

import { useState } from "react";

const useContador = () => {
  const [valor, setValor] = useState<number>(0);

  const incrementar = () => {
    setValor(valor + 1);
  };
  const decrementar = () => {
    setValor(valor - 1);
  };

  return {
    valor,
    incrementar,
    decrementar,
  };
};

export default useContador;
