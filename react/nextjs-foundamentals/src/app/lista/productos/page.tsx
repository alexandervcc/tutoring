import ListaProductos from "@/app/ListaProductos";
import Link from "next/link";
import React from "react";

const PaginaListaProductos = () => {
  return (
    <div>
      <Link href={"/"}>Pagina principal</Link>

      <h1>Lista Productos</h1>

      <ListaProductos />
    </div>
  );
};

export default PaginaListaProductos;
