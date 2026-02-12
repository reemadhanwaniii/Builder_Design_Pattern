import BetterCode.v4.Builder;
import BetterCode.v4.Product;

import java.util.ArrayList;

public class Main {
    static void main(String[] args) {

        Builder b = Product.getBuilder();
        b.setBrand("Apple");
        b.setCategory("Electronics");
        b.setPrice(100000);

//        we have taken access from user to create new product, they will not able to pass irrelevant thngs
        Product p = b.build();
    }

}

