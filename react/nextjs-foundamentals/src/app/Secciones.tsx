import React from "react";

const Secciones = () => {
  const listaSecciones: React.JSX.Element = (
    <ul>
      <li>Cases</li>
      <li>Tarjetas madre</li>
      <li>Memorias RAM</li>
      <li>Procesadores</li>
    </ul>
  );

  const titulo: React.JSX.Element = <h4>Nuestras secciones: </h4>;

  return (
    <div>
      <hr />
      {titulo}
      {listaSecciones}
      <hr />
    </div>
  );
};

export default Secciones;
