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




    public static class Builder {
        private String name;
        private String desc;
        private double price;
        private String brand;
        private String category;
        private String created_at;
        private String updated_at;
        private double discount;
        private List<String> images;

        public Builder() {}

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setDesc(String desc) {
            this.desc = desc;
            return this;
        }

        public Builder setPrice(double price) {
            this.price = price;
            return this;
        }

        public Builder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder setCategory(String category) {
            this.category = category;
            return this;
        }

        public Builder setCreated_at(String created_at) {
            this.created_at = created_at;
            return this;
        }

        public Builder setUpdated_at(String updated_at) {
            this.updated_at = updated_at;
            return this;
        }

        public Builder setDiscount(double discount) {
            this.discount = discount;
            return this;
        }

        public Builder setImages(List<String> images) {
            this.images = images;
            return this;
        }

        public String getName() {
            return name;
        }

        public String getDesc() {
            return desc;
        }

        public double getPrice() {
            return price;
        }

        public String getBrand() {
            return brand;
        }

        public String getCategory() {
            return category;
        }

        public String getCreated_at() {
            return created_at;
        }

        public String getUpdated_at() {
            return updated_at;
        }

        public double getDiscount() {
            return discount;
        }

        public List<String> getImages() {
            return images;
        }

        public Product build() {
            return new Product(this);
        }
    }

}


