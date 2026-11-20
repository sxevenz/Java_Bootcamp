package Mod10;

import java.util.HashMap;

public class ElectronicItemDetails {

    public static  double returnPriceOfItem(HashMap<String,Double> itemHashMap, String itemName) {
        if(itemHashMap.containsKey(itemName)) {
        return  itemHashMap.get(itemName);}else {
            System.out.println("Item does not exist");
            return 0;
        }

    }


    static void main(String[] args) {
        HashMap<String, Double> itemHashMap = new HashMap<>();
        itemHashMap.put("TV", 25.0);
        itemHashMap.put("Refrigerator", 35.0);
        itemHashMap.put("Washing Machine", 29.0);
        itemHashMap.put("Laptop", 35.0);

        System.out.println("Price of item TV is " + returnPriceOfItem(itemHashMap,"TV"));
       }
}
