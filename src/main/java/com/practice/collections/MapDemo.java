package com.practice.collections;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer,Integer> data =new HashMap<>();
        data.put(22,3);//shift+F6 to map into object/ to refactor
        data.put(23,4);
        data.put(54,5);
        data.put(27,44);
        data.put(54,5);
        data.put(null,3);// accepts only one null value,overwrites previous
        data.put(null,41);
        data.put(22,33);
        data.put(1,42);
        data.put(23,null);
        System.out.println(" HashMap is: "+ data);
        Iterator iterator=data.entrySet().iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
        System.out.println("***************************************************************");
    }
}
/* go for HashTable -  if syncronization and thread safe is needed
go for ConcurrentHashMap - when multithreading needed
both these are neither sorted nor ordered , doesn't allow null as key or value
*
Hashmap - no duplicate as key; accepts one null key
*/