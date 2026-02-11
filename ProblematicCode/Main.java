package ProblematicCode;

import java.util.ArrayList;

public class Main {
    static void main(String[] args) {
        Product p = new Product("iphone","this is apple iphone",980000,"Apple","Electronicx","2023-07-21","2023-07-21",10,new ArrayList<>());
    }
}

/**
 * Problems With Above Code :
 *
 * We have to be very careful wrt order of arguments,making it hard to maintain.
 * what if we want to have some optional arguments, we are forced to manually give some default values.
 *
 * => benefits:
 *   Validation is easily doable.
 *
 *
 *   The problem of forcefully passing args can be solved by constructor overloading:
 *     But it creates 2 more problem
 *      1. Constructor Explosion : let say if we have 4 attributes then how many possible constructor of our class
 *         is : 2^4.
 *      2. A few constructor will cause an issue.
 *       Product(String name, String desc, double price) {}
 *       Product(String name, String brand, double price) {}
 *
 *       it will not allow to do this bcz of same signature.
 *
 */