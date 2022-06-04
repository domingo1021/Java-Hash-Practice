package org.example;

import java.util.Hashtable;
import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        ProductHashTable productHashTable = new ProductHashTable(new Hashtable<String, Integer>());
        String bread = "Bread";
        productHashTable.produce(bread, 100);
        System.out.println("Object to String:" + productHashTable.toString());
        System.out.printf("Hash Table %s balance: %d",
                bread,
                productHashTable.get_product_num(bread));
        System.out.println("");

        ProductHashMap productHashMap = new ProductHashMap(new HashMap<String, Integer>());
        productHashMap.produce(bread, 100);
        productHashMap.produce(bread, 111);
        System.out.printf("HashMap %s balance: %d",
                bread,
                productHashMap.get(bread));
    }
}