import BetterCode.v3.Builder;
import BetterCode.v3.Product;

import java.util.ArrayList;

public class Main {
    static void main(String[] args) {

        Builder b = new Builder();
        b.setBrand("Apple");
        b.setCategory("Electronics");
        b.setPrice(100000);

        Product p = new Product(b);
    }
}

