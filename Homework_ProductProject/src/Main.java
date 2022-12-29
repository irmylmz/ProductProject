import Entity.concretes.Product;
import business.concretes.ProductManager;
import core.abstracts.LoggerService;
import core.concretes.jLoggerAdapter;

public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        LoggerService loggerService = new jLoggerAdapter();
        Product product1 = new Product(1,"Macbook" ,"m2" ,100);
        Product product2 = new Product(2,"Lenovo" ,"i5" ,150);
        Product product3 = new Product(3,"Huawei", "ryzen" ,125);

        productManager.addProduct(product1);
        productManager.addProduct(product2);
        productManager.addProduct(product3);
        productManager.removeProduct(product1);
        productManager.removeProduct(product2);

        loggerService.updateSystem(product3);
        System.out.println(product3.getName());
    }
}