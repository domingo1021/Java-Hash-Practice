package org.example;
import java.util.HashMap;

public class ProductHashMap {
    private HashMap<String, Integer> product_balances;

    public ProductHashMap(HashMap<String, Integer> product_balances) {
        this.product_balances = product_balances;
    }

    public int get(String nane){
        return this.product_balances.get(nane);
    }

    public void produce(String name, int increase_number){
        if(this.product_balances.get(name) == null) {
            this.product_balances.put(name, increase_number);
        }else{
            int previous_num = product_balances.get(name);
            this.product_balances.put(name, previous_num + increase_number);
        }
    }

    @Override
    public String toString() {
        return "ProductHashTable{" +
                "product_balances=" + product_balances +
                '}';
    }
}
