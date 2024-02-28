package com.practice.collections;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> data =new HashSet<Integer>();
        data.add(22);//shift+F6 to map into object/ to refactor
        data.add(23);
        data.add(54);
        data.add(27);
        data.add(54);
        data.add(null);
        data.add(22);
        data.add(1);
        data.add(null);
        System.out.println(" HashSet is: "+ data);
        Iterator<Integer> iterator=data.iterator();
         while(iterator.hasNext())
            {
                System.out.println(iterator.next());
            }
        System.out.println("***************************************************************");
        Set<Integer> data1 =new LinkedHashSet<Integer>();
        data1.add(22);//shift+F6 to map into object/ to refactor
        data1.add(3);
        data1.add(54);
        data1.add(23);
        data1.add(5);
        data1.add(null);
        data1.add(22);
        data1.add(1);
        data1.add(null);
        System.out.println(" LinkedHashSet is: "+ data1);
        Iterator iterator1=data1.iterator();
        while(iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
        System.out.println("***************************************************************");
    Set<Integer> data2 =new TreeSet<Integer>();
        data2.add(22);//shift+F6 to map into object/ to refactor
        data2.add(3);
        data2.add(54);
        data2.add(23);
        data2.add(5);
        //data2.add(null); NullPointerException
        data2.add(22);
        data2.add(1);
       // data2.add(null);
        System.out.println("TreeSet is: "+ data2);
    Iterator iterator2=data2.iterator();

        while(iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }

        /*Hash - neither sorted nor ordered
        * Linked - insertion order maintained
        * Tree - sorted in ascending order indefault, null not included
        * by default any of the three neither synchronized nor threadsafe to make it synchronized use ex: Collections.SynchronizedSet(data2)*/
}
}


