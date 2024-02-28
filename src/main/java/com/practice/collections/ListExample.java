package com.practice.collections;

import java.util.*;

public class ListExample {
    public static void main(String[] args) {
        List data = new ArrayList();
        System.out.println("Initial size of vector: " + data.size());
        data.add("java");
        data.add(null);
        data.add(true);
        data.add(12);
        System.out.println("Now size of ArrayList is : " + data.size());
        for (int i = 0; i < data.size(); i++) {
            System.out.println("Element in array index " + i + " is " + data.get(i));
        }
        data.add(true);
        data.add(12);
        System.out.println("Now size of ArrayList is : " + data.size());

        System.out.println("***************************************************************");

        List<Integer> data1 = new LinkedList<Integer>();
        System.out.println("Initial size of LinkedList is : " + data1.size());
        data1.add(33);
        data1.add(null);
        data1.add(43);
        data1.add(12);
        System.out.println("LinkedList is " + data1);
        System.out.println("LinkedList is " + Collections.synchronizedList(data1));
        System.out.println("Now the size of LinkedList is " + data1.size());
    }

    //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
    // click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
}
