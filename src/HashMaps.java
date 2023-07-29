
//        HashMap: is a collection that stores data in key-value pairs. It provides a way to store and retrieve objects
//                 based on a unique key. The HashMap class is a part of the Java Collections Framework and is used to
//                 implement the Map interface.
//
//        HashMap internally uses a hash table to store the key-value pairs. When an element is added to a HashMap,
//        its key is used to calculate the hash code, which is then used as an index to store the key-value
//        pair in the hash table.
//
//        The key is unique in the HashMap, and its hash code is used to locate the value associated with it.
//        When you try to retrieve a value based on a key, the HashMap uses the same hash code to locate
//        the value in the hash table. This makes the retrieval process very fast, even for large amounts of data.
//
//        Some key features of HashMap in Java are:
//            It allows null keys and null values.
//            It does not maintain the insertion order of the elements.
//            It uses the hash code of the key to retrieve values, so it provides fast access to elements.
//            It allows for duplicate values, but not duplicate keys.
//        HashMaps are commonly used in Java for implementing caching mechanisms, for storing and retrieving
//        data, and for implementing algorithms that require fast access to elements.

import java.util.*;


public class HashMaps {
    public static void main(String args[]) {
        //Creation
        HashMap<String, Integer> map = new HashMap<>();


        //Insertion
        map.put("India", 120);
        map.put("US", 30);
        map.put("China", 150);


        System.out.println(map);


        map.put("China", 180);
        System.out.println(map);



        //Searching
//        if(map.containsKey("Indonesia")) {
//            System.out.println("key is present in the map");
//        } else {
//            System.out.println("key is not present in the map");
//        }
//
//
//        System.out.println(map.get("China")); //key exists
//        System.out.println(map.get("Indonesia")); //key doesn't exist

//        //Iteration (1)
        Set<String> keys = map.keySet();
        for (String k: keys) {
            System.out.println("Key = " + k + ", Value = " + map.get(k));
        }

        //Iteration (2)
        Set<String> key = map.keySet();
        System.out.println(key);


        //Removing
        map.remove("China");
        System.out.println(map);
    }
}

