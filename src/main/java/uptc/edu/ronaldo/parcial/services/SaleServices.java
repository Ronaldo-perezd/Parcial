package uptc.edu.ronaldo.parcial.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uptc.edu.ronaldo.parcial.entities.Sale;
import uptc.edu.ronaldo.parcial.repositories.SaleRepository;
import java.util.List;

@Service
public class SaleServices {
    @Autowired
    private SaleRepository saleRepository;

    public List<Sale> getAllSales() {
        return saleRepository.findAll();
    }

    public Sale getSaleById(Long id) {
        return saleRepository.findById(id).orElse(null);
    }

    public Sale addSale(Sale sale) {
        return saleRepository.save(sale);
    }

    public void deleteSale(Long id) {
        saleRepository.deleteById(id);
    }
}
