// Crear un componente
// Como buena practica el nombre del componente debe ser el mismo que el nombre del archivo

// Es un componente de React
// - es una funcion
// - Siempre tiene la primera letra en mayuscula
// - Siempre devuelve JSX (tipo especial HTML)

// - Los parametros de un componente se llaman props
// - props siempre es un objeto de parametros
// - Para anadir props se anade un solo parametro al componente, que utilice un tipo objeto

type TarjetaProductoProps = {
  nombre: string;
  precio: number;
  descripcion?: string;
};

const TarjetaProducto = (props: TarjetaProductoProps) => {
  // Destructurar valores dentro de los props (extraer de un objeto)
  const { nombre, precio, descripcion = "Descripcion pendiente." } = props;

  let descuento = null;
  if (precio % 2 === 0) {
    descuento = (
      <p>
        <b>Descuento: </b> 10 %
      </p>
    );
  }

  const impuestos = (
    <p>
      <b> -- Impuestos: </b>
      {precio % 2 === 0 ? <p>10%</p> : <p>5%</p>}
    </p>
  );

  return (
    <div>
      <hr />
      <h4>{nombre}</h4>
      <p>
        <b>Precio:</b> {precio}
      </p>
      {descuento}
      {impuestos}
      <p>{descripcion}</p>
      <hr />
    </div>
  );
};

export default TarjetaProducto;
