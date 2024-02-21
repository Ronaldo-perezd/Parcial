package uptc.edu.ronaldo.parcial.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uptc.edu.ronaldo.parcial.entities.Sale;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Long> {
    // Puedes agregar métodos adicionales de consulta si es necesario
}
