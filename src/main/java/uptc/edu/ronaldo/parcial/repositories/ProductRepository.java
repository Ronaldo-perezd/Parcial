package uptc.edu.ronaldo.parcial.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uptc.edu.ronaldo.parcial.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}

