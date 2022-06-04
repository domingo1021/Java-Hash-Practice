package org.example;

import java.util.Hashtable;

public class Main {
    public static void main(String[] args) {
        ProductHashTable productHashTable = new ProductHashTable(new Hashtable<String, Integer>());
        String bread = "Bread";
        productHashTable.produce(bread, 100);
        System.out.println("Object to String:" + productHashTable.toString());
        System.out.printf("%s balance: %d",
                bread,
                productHashTable.get_product_num(bread));
    }
}