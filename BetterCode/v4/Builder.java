package BetterCode.v4;

import java.util.List;

public class Builder {
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

    public void setName(String name) {
        this.name = name;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public void setImages(List<String> images) {
        this.images = images;
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
