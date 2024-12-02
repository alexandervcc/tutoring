package acc.tutoring.store.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import acc.tutoring.store.store.model.Producto;

@Repository
public interface IProductoRepository extends JpaRepository<Producto, Long> {
  
}
