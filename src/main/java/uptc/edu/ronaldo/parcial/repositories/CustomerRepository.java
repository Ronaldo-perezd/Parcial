package uptc.edu.ronaldo.parcial.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uptc.edu.ronaldo.parcial.entities.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    // Puedes agregar métodos adicionales de consulta si es necesario
}
