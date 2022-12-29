package jLogger;

import Entity.concretes.Product;

public class jLoggerManager {
    public String update(Product product){
        String reverseName = "";
        char ch;
        for (int i=0; i<product.getName().length(); i++)
        {
            ch= product.getName().charAt(i);
            reverseName = ch + reverseName;
        }
        return reverseName;
    }
}
