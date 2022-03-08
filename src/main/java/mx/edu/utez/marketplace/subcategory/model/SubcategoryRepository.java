package mx.edu.utez.marketplace.subcategory.model;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository //indica que es un repositorio
public interface SubcategoryRepository extends JpaRepository<Subcategory, Long> {
    Optional<Subcategory> findByDescription (String description); // Regresa la descripcción
    Optional <Subcategory> findSubcategoriesByCategory_Id(long id); //Optional por list (se importa el de java)
    boolean existsById(long id); // para validar si un registro existe por su id
    boolean existsSubcategoriesByCategory_Id(long id); // parte que compartió Roy se puede sustituir por la que hizo el profe (linea 18)

    //parte del profe
    List<Subcategory> findAllByCategoryId(long id);
}
