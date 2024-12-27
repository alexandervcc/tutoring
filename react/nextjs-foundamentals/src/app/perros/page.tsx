"use client";
import React from "react";
import { useRouter } from "next/navigation";
import Link from "next/link";
import RazasPerrosEffect from "../RazasPerrosEffect";

const PaginaPerros = () => {
  const router = useRouter();

  const paginaProductos = () => {
    // Codigo de redireccionamiento
    router.push("/lista/productos");
  };

  return (
    <div>
      <h4>Links</h4>
      <ol>
        <li>
          {/* Enlace mediante JSX */}
          <Link href={"/"}>Pagina principal</Link>
        </li>
        <li>
          <Link href={"/lista/productos"}>Productos</Link>
        </li>
      </ol>

      <div style={{ border: "2px solid red" }}>
        <h4>Redireccionamiento mediante funciones</h4>
        {/* Enlace mediante codigo (np JSX) */}
        <button
          onClick={() => {
            console.log("redireccionar a pagina principal");
            router.push("/");
          }}
        >
          Pagina Principal
        </button>
        <button onClick={paginaProductos}>Pagina Productos</button>
      </div>
      <h1>Lista de razas de perros</h1>

      <RazasPerrosEffect />
    </div>
  );
};

export default PaginaPerros;
