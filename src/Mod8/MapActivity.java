package Mod8;

import java.util.HashMap;
import java.util.Map;

public class MapActivity {
    public static void main(String[] args) {
        // 1 - Type code to create a HashMap of key-value pairs
        HashMap<String,String> map = new HashMap<>();
        map.put("1","Daniel");
        map.put("2","John");
        map.put("3","Stacie");
        // where key is id of type String and value is a name

        MapActivity mapActivity = new MapActivity();
        mapActivity.print(map);
        // 2 - Call print method to print the map passed as its parameter.
        // (Hint: Notice print() is a non-static method, so create an instance of MapActivity)

    }

    void print(Map<String,String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " | " + entry.getValue());
        }
        // 3 - Type code to print this map (keys and values)

    }
}
