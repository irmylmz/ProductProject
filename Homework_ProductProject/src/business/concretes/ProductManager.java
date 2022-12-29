package business.concretes;

import Entity.concretes.Product;
import business.abstracts.ProductService;

import java.util.ArrayList;
import java.util.List;

public class ProductManager implements ProductService {
    List<Product> DatabaseProducts = new ArrayList<>();
    public void addProduct(Product product){
        this.DatabaseProducts.add(product);
        System.out.println(product.getName() + " was added to Database.");
    }
    public void removeProduct(Product product){
        this.DatabaseProducts.remove(product);
        System.out.println(product.getName() + " was removed from Database.");
    }
    public void changeData(Product product){
        product.setId(0);
    }
}
