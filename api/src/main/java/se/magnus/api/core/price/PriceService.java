package se.magnus.api.core.price;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


public interface PriceService {

    @GetMapping(value = "/price/{productId}", produces = "application/json")
    Price getPrice(@PathVariable int productId);
}
