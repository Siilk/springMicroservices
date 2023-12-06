package se.magnus.priceservice.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import se.magnus.api.core.price.Price;
import se.magnus.api.core.price.PriceService;
import se.magnus.api.exceptions.InvalidInputException;
import se.magnus.api.exceptions.NotFoundException;
import se.magnus.util.http.ServiceUtil;

@RestController
public class PriceServiceImpl implements PriceService {

    private static final Logger LOG = LoggerFactory.getLogger(PriceServiceImpl.class);

    private final ServiceUtil serviceUtil;

    @Autowired
    public PriceServiceImpl(ServiceUtil serviceUtil) {
        this.serviceUtil = serviceUtil;
    }

    @Override
    public Price getPrice(int productId) {
        LOG.debug("/price return the found price for productId={}", productId);

        if (productId < 1) {
            throw new InvalidInputException("Invalid productId: " + productId);
        }

        if (productId == 13) {
            throw new NotFoundException("No price found for productId: " + productId);
        }

        return new Price(productId, productId + 0.5f, (productId / 2) + 0.99f, serviceUtil.getServiceAddress());
    }
}
