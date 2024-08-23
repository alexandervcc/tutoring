import { Producto } from "./tipos";

type TarjetaProducto2Props = {
  producto: Producto;
};

const TarjetaProducto2 = (props: TarjetaProducto2Props) => {
  const { producto } = props;

  return (
    <div style={{ border: "1px solid blue", margin: 4, padding: 8 }}>
      <h4>{producto.nombre}</h4>
      <p>
        <b>Precio:</b> {producto.precio}
      </p>
      <p>Computador gamer de ultima generacion</p>
    </div>
  );
};

export default TarjetaProducto2;
