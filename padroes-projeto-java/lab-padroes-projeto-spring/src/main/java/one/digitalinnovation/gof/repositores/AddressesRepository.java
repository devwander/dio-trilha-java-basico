package one.digitalinnovation.gof.repositores;

import one.digitalinnovation.gof.entities.Addresses;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressesRepository extends CrudRepository<Addresses, String> {

}