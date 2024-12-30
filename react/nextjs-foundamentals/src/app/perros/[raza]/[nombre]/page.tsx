import React from "react";
// Import con salida de directorio multiple
import { RazasPerros } from "../../../../http/razas-perros" 


type PaginaRazaNombrePerroProps = {
  params: {
    raza: string;
    nombre: string;
  };
  searchParams: {};
};
const PaginaRazaNombrePerro = (props: PaginaRazaNombrePerroProps) => {
  const { params } = props;
  return (
    <>
      <div>PaginaRazaNombrePerro</div>
      <p>
        <b>Raza: </b> {params.raza}
      </p>
      <p>
        <b>Nombre: </b> {params.nombre}
      </p>
    </>
  );
};

export default PaginaRazaNombrePerro;
