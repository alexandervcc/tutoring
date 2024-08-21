import { Producto } from "./tipos";

type TarjetaProducto2Props = {
  producto: Producto;
};

const TarjetaProducto2 = (props: TarjetaProducto2Props) => {
  const { producto } = props;

  return (
    <div>
      <hr />
      <h4>{producto.nombre}</h4>
      <p>
        <b>Precio:</b> {producto.precio}
      </p>
      <p>Computador gamer de ultima generacion</p>
      <hr />
    </div>
  );
};

export default TarjetaProducto2;
