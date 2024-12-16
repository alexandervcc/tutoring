import React from "react";

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
