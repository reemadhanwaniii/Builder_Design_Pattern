import BetterCode.v4.Product;

public class Main {
    static void main(String[] args) {

            Product p = Product.getBuilder()
                    .setName("Iphone")
                    .setPrice(100000)
                    .setBrand("Apple")
                    .setCategory("Electronics")
                    .setDesc("this is Apple Iphone")
                    .setDiscount(10)
                    .setCreated_at("2022-08-12")
                    .setUpdated_at("2022-08-12")
                    .build();
    }

}

