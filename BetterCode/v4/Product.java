package BetterCode.v4;

import BetterCode.v3.Builder;

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

    private Product(Builder builder) {
        if(builder.getPrice() > 0) this.price = builder.getPrice();
        if(!builder.getBrand().equals("")) this.brand = builder.getBrand();
        this.category = builder.getCategory();
        this.created_at = builder.getCreated_at();
        this.updated_at = builder.getUpdated_at();
        this.discount = builder.getDiscount();
        this.name = builder.getName();
        this.desc = builder.getDesc();

        this.images = builder.getImages();
    }

    public static Builder getBuilder() {
        return new Builder();
    }
}
