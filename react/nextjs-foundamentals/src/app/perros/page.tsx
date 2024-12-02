import React from "react";
import RazasPerrosEffect from "../RazasPerrosEffect";
import Link from "next/link";

const PaginaPerros = () => {
  return (
    <div>
      <h4>Links</h4>
      <ol>
        <li>
          <Link href={"/"}>Pagina principal</Link>
        </li>
        <li>
          <Link href={"/lista/productos"}>Productos</Link>
        </li>
      </ol>
      <h1>Lista de razas de perros</h1>

      <RazasPerrosEffect />
    </div>
  );
};

export default PaginaPerros;
