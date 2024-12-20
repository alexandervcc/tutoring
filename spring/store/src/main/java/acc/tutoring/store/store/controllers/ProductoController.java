package acc.tutoring.store.store.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import acc.tutoring.store.store.dto.ProductoReqDto;
import acc.tutoring.store.store.model.Producto;
import acc.tutoring.store.store.services.ProductoServicio;
import jakarta.websocket.server.PathParam;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping(path = "/api/v1/producto")

public class ProductoController {
  @Autowired
  private ProductoServicio productoServicio;

  @GetMapping("/")
  public List<Producto> obtenerProductos() {
    return this.productoServicio.obtenerProductos();
  }

  @GetMapping("/{id}")
  public Producto obtenerUnProduct(@PathVariable("id") Long id) {
    return this.productoServicio.verProducto(id);
  }

  @PostMapping("/")
  public Producto creaProducto(@RequestBody ProductoReqDto producto) {
    return this.productoServicio.creaProducto(producto);
  }

  @PutMapping("/{id}")
  public Producto actualizarProducto(@PathVariable(name = "id", required = true) Long id,
      @RequestBody ProductoReqDto producto) throws Exception {
    return this.productoServicio.actualizarProducto(id, producto);
  }

  @DeleteMapping("/{id}")
  public void eliminarProducto(@PathVariable(name = "id", required = true) Long id) {
    this.productoServicio.eliminarProducto(id);
  }

}
