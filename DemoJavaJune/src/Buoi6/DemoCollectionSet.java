package Buoi6;


import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DemoCollectionSet {
    // List : ArrayList
    //Set : HashSet
    // Map : HashMap && HashTable
// note : Set can't use for for normal , can't not use listTest.get(i)

    public static void main(String[] args) {

     Set<String> testSet = new HashSet<String>();
     testSet.add("Javascript");
     testSet.add("Python");
     testSet.add("C++");
     testSet.add("Ruby");
     testSet.add("Customer");

        // Show set  through Iterator
        Iterator<String> itr = testSet.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        // Show set through for-each

        for(String obj : testSet){
            System.out.println("check for each " + obj);
        }

        // Show item set through normal for

       // contains
        System.out.println(testSet.contains("Python"));
        System.out.println(testSet.remove("Python"));
        System.out.println(testSet.size());
    }
}
