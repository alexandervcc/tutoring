import Contador from "./Contador";
import Efectos from "./Efectos";
import Estados from "./Estados";
import HechosGatos from "./HechosGatos";
import RazasPerrosEffect from "./RazasPerrosEffect";
import ListaProductos from "./ListaProductos";
import Perro from "./Perro";
import Secciones from "./Secciones";

const Home = () => {
  return (
    <div>
      <h1>Compustore</h1>
      <h6>Tu tienda amiga de componentes de PC</h6>
      <Efectos />
      <RazasPerrosEffect />
      <HechosGatos />
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
      <ListaProductos />
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
