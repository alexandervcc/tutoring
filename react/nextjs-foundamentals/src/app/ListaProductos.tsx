import React from "react";
import TarjetaProducto from "./TarjetaProducto";
import TarjetaProducto2 from "./TarjetaProducto2";
import { Producto } from "./tipos";

const listaProductos: Producto[] = [
  {
    nombre: "Silla ergonomica",
    precio: 180,
  },
  {
    nombre: "Escritorio",
    precio: 360,
  },
];

const listaProductos2: Producto[] = [
  {
    nombre: "Parlantes",
    precio: 18,
  },
  {
    nombre: "Mouse",
    precio: 36,
  },
];

const ListaProductos = () => {
  const producto1: Producto = {
    nombre: "Tarjeta Grafica",
    precio: 750,
  };

  const listaProductosComponentes = listaProductos2.map((p) => {
    return <TarjetaProducto2 producto={p} key={p.nombre} />;
  });

  return (
    <div>
      <h3>Lista de Productos:</h3>
      {/*  Renderizar un componente */}
      <b>Tarjetas que usan un prop por dato del producto</b>
      <TarjetaProducto
        nombre="Laptop"
        precio={999}
        descripcion="Computador de ultima generacion, con enfoque para videojuegos."
      />
      <TarjetaProducto nombre="Celular" precio={550} />
      <TarjetaProducto nombre="Disco duro" precio={97} />

      <br />
      <br />
      <br />
      <br />
      <b>Tarjetas qye usan un objeto con los datos del producto</b>
      <hr />
      <TarjetaProducto2
        producto={{
          nombre: "Memoria RAM",
          precio: 125,
        }}
      />
      <TarjetaProducto2 producto={producto1} />

      <h3>Usando listas para productos</h3>
      <hr />
      {listaProductos.map((p) => {
        return <TarjetaProducto2 key={p.nombre} producto={p} />;
      })}
      {listaProductosComponentes}
    </div>
  );
};

export default ListaProductos;
