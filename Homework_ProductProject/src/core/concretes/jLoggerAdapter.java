package core.concretes;

import Entity.concretes.Product;
import core.abstracts.LoggerService;
import jLogger.jLoggerManager;

public class jLoggerAdapter implements LoggerService {
    public void updateSystem(Product product) {
        jLoggerManager manager = new jLoggerManager();
        product.setName(manager.update(product));
    }
}
