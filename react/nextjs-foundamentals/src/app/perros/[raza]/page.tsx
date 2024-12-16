"use client";
import React from "react";

// Para acceder path params, siempre la pagina debe de tener props. Y el path param estara dentro del atributo `param` en los props.

type PaginaNombrePerro = {
  /**
   * Los path param siempre estaran dentro de param de los props
   * El nombre del param siempre debe ser el nombre de la carpeta dentro de los corchetes [<nombre>]
   */
  params: {
    raza: string;
  };
  searchParams: {};
};

const PaginaNombrePerro = (props: PaginaNombrePerro) => {
  const { params } = props;
  return (
    <>
      <div>PaginaNombrePerro</div>
      <p>
        <b>Raza: </b>
        {params.raza}
      </p>
    </>
  );
};

export default PaginaNombrePerro;
