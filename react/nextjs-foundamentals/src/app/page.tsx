import Link from "next/link";
import Contador from "./Contador";
import Efectos from "./Efectos";
import Estados from "./Estados";
import Perro from "./Perro";
// Importar algo de un archivo en el mismo nivel
import Secciones from "./Secciones";
// Importar algo desde una carpeta anidada en el mismo nivel
import ContadorConUseHook from "./contador/ContadorConUseHook";
// Importar algo desde una carpeta externa
import { HechoGato } from "../http/hechos-gatos";

const Home = () => {
  return (
    <div>
      <h1>Compustore</h1>
      <h6>Tu tienda amiga de componentes de PC</h6>
      <div style={{ border: "5px solid violet", padding: "25px" }}>
        <h3>Links</h3>
        <Link href={"/perros"}>Perros</Link>
        <br />
        <Link href={"/perros"}>
          <button>Perros</button>
        </Link>
        <ul>
          <li>
            <Link href={"/perros"}>Perros</Link>
          </li>
        </ul>
      </div>

      <Efectos />
      <Perro />
      <Estados />
      <Secciones />
      <Contador />
      <img
        src="https://m.media-amazon.com/images/I/71LMiD9i+ML._AC_SL1500_.jpg"
        width={200}
      />
      <br />
      <br />
    </div>
  );
};

// Es recomendado que haya un componente por archivo
// y que el componente se exporte por defecto
// Solo puede haber un export por defecto por archivo
export default Home;

/* 
Exports que no son por defecto
export const numero1 = 10;
export const numero2 = 11;
 */
