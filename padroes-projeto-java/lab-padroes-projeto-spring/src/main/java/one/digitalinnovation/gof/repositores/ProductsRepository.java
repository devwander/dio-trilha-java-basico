package one.digitalinnovation.gof.repositores;

import one.digitalinnovation.gof.entities.Products;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsRepository extends CrudRepository<Products, Long> {

}