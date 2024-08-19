import React from "react";
import TarjetaProducto from "./TarjetaProducto";
import TarjetaProducto2 from "./TarjetaProducto2";

const ListaProductos = () => {
  return (
    <div>
      <h3>Lista de Productos:</h3>
      {/*  Renderizar un componente */}
      <TarjetaProducto nombre="Laptop" precio={999} />
      <TarjetaProducto nombre="Celular" precio={550} />
      <TarjetaProducto nombre="Disco duro" precio={97} />

      <br />
      <TarjetaProducto2
        producto={{
          nombre: "Memoria RAM",
          precio: 125,
        }}
      />
    </div>
  );
};

export default ListaProductos;
