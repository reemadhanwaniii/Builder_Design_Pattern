package ProblematicCode;

import java.util.List;

public class Product {
    private String name;
    private String desc;
    private double price;
    private String brand;
    private String category;
    private String created_at;
    private String updated_at;
    private double discount;
    private List<String> images;

    Product(String name, String desc, double price, String brand, String category, String created_at, String updated_at,double discount, List<String> images) {
        this.name = name;
        this.desc = desc;
        this.price = price;
        this.brand = brand;
        this.category = category;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.discount = discount;
        this.images = images;
    }

    Product(String name,String desc) {}

    Product(String name, String desc, double price) {}
//    Product(String name, String brand, double price) {}
}
