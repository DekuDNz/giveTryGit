package Buoi7;

import java.util.HashMap;
import java.util.Map;

public class DemoCollectionMap {

    // Không lưu giữ liệu trùng lặp

    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        Map<Integer,Double> map2 = new HashMap<>();

        //Thêm  giữ liệu cho MAP
        map.put("language","Java");
        map.put("framework","TestNG");
        map.put("library","Selenium");

            map2.put(1,2.2D);
            map2.put(2,23.3D);


        System.out.println(map);
        System.out.println(map2);

        // kiem tra key
        System.out.println(map.containsKey("library"));
        // kiem tra value
        System.out.println(map.containsValue("Java"));
// Remove value

        map.remove("library");

        // duyet map
for(Map.Entry<String,String> entry : map.entrySet()){
    System.out.println(entry.getKey() + ": " + entry.getValue());
}
        System.out.println("=======================");
// duyet map
        for(Map.Entry<Integer,Double> entry : map2.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }


}
