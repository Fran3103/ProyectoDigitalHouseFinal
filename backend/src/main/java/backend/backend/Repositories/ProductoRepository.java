package backend.backend.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import backend.backend.Entities.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long>{
    boolean existsByTitulo( String titulo);
}
