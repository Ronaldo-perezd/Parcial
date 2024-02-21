package uptc.edu.ronaldo.parcial.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uptc.edu.ronaldo.parcial.entities.Sale;
import uptc.edu.ronaldo.parcial.services.SaleServices;

import java.util.List;

@RestController
@RequestMapping("/api/sales")
public class SaleController {
    @Autowired
    private SaleServices saleService;

    @GetMapping
    public List<Sale> getAllSales() {
        return saleService.getAllSales();
    }

    @GetMapping("/{id}")
    public Sale getSaleById(@PathVariable Long id) {
        return saleService.getSaleById(id);
    }

    @PostMapping
    public Sale addSale(@RequestBody Sale sale) {
        return saleService.addSale(sale);
    }

    @DeleteMapping("/{id}")
    public void deleteSale(@PathVariable Long id) {
        saleService.deleteSale(id);
    }
}
