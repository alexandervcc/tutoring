package acc.tutoring.store.store.services;

import java.util.List;
import java.util.Optional;

import org.apache.coyote.BadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import acc.tutoring.store.store.dto.ProductoReqDto;
import acc.tutoring.store.store.model.Producto;
import acc.tutoring.store.store.repository.IProductoRepository;

@Service
public class ProductoServicio {
  @Autowired
  private IProductoRepository productoRepository;

  public Producto verProducto(Long id) {
    Optional<Producto> op = this.productoRepository.findById(id);
    if (op.isPresent()) {
      return op.get();
    }
    throw new ResponseStatusException(
        HttpStatus.NOT_FOUND, "Producto no encontrado.");
  }

  public List<Producto> obtenerProductos() {
    return this.productoRepository.findAll();
  }

  public Producto creaProducto(ProductoReqDto producto) {
    Producto p = new Producto(producto.nombre, producto.descripcion, producto.precio, producto.cantidad);
    return this.productoRepository.save(p);
  }

  public Producto actualizarProducto(Long id, ProductoReqDto producto) throws Exception {
    Optional<Producto> opcional = this.productoRepository.findById(id);
    if (opcional.isEmpty()) {
      throw new BadRequestException("No existe producto para el id entregado.");
    }
    Producto p = opcional.get();
    p.setCantidad(producto.cantidad);
    p.setDescripcion(producto.descripcion);
    p.setNombre(producto.nombre);
    p.setPrecio(producto.precio);

    return this.productoRepository.save(p);
  }

  public void eliminarProducto(Long id) {
    this.productoRepository.deleteById(id);
  }

}
