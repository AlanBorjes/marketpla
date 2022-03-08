package mx.edu.utez.marketplace.category.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository //indica que es un repositorio

public interface CategoryRepository  extends JpaRepository<Category, Long> {
    Optional<Category> findByDescription(String description);  // Regresa la descripcción
    boolean existsById(long id); // para validar si un registro existe por su id
}
