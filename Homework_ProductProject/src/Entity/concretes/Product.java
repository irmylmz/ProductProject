package Entity.concretes;

import Entity.abstracts.Entity;

public class Product implements Entity {
    private int id;
    private String name;
    private String description;
    private int unitPrice;

    public Product(int id, String name, String description, int unitPrice) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.unitPrice = unitPrice;
    }

    public Product(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }
}
