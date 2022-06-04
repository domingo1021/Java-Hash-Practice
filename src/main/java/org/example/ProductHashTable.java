package org.example;

import java.util.Hashtable;

public class ProductHashTable {
    private Hashtable<String, Integer> product_balances;

    public ProductHashTable(Hashtable<String, Integer> product_balances) {
        this.product_balances = product_balances;
    }

    public Hashtable<String, Integer> getProduct_balances() {
        return product_balances;
    }

    public int get_product_num(String product_name){
        return product_balances.get(product_name);
    }

    public void produce(String product_name, Integer increase_num) {
        if (this.product_balances.get(product_name)==null) {
            this.product_balances.put(product_name, increase_num);
        }else{
            int previous_num = product_balances.get(product_name);
            this.product_balances.replace(product_name, previous_num + increase_num);
        }
    }

    @Override
    public String toString() {
        return "ProductHashTable{" +
                "product_balances=" + product_balances +
                '}';
    }
}
