package Buoi7;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class DemoCollectionArrayList {
    public static void main(String[] args) {
        // Khai bao Arraylist
List<String> listMenu = new ArrayList<String>();
        // Add value
listMenu.add("Python");
listMenu.add("Javascript");
listMenu.add("C++");
listMenu.add("Java");
listMenu.add("Java");
        // Delete value
        listMenu.remove(3);


        // Update value
//        listMenu.add(3,"Zenki");
        listMenu.set(3, "Zenki");


// get gia tri theo chi muc

        System.out.println("check chi muc " + listMenu.get(2));

        // Duyet listMenu by normal for
        for(int i = 0; i < listMenu.size(); i++){
            System.out.println(listMenu.get(i));
        }

        // Duyet listMenu by for each

        for(String listItem : listMenu){
            System.out.println(listItem);
        }

        // add other list menu

        List<String> listMenu2 = new ArrayList<String>();
        listMenu2.addAll(listMenu);

        System.out.println("check listMenu2 : " + listMenu2);
    }

}
