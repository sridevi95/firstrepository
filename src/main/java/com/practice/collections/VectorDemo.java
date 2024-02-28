package com.practice.collections;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {

        Vector data1 = new Vector(3);
        System.out.println("Initial capacity of vector: " + data1.capacity());
        System.out.println("Initial size of vector: " + data1.size());
        data1.add("java");
        data1.add(null);
        data1.add(true);
        data1.add(12);
        System.out.println("Now capacity of vector: " + data1.capacity());
        System.out.println("Now size of vector: " + data1.size());
        System.out.println("First vector is " + data1);
        System.out.println("***************************************************************");
        Vector<Integer> data2 = new Vector<Integer>(3);//using generic
        System.out.println("Initial capacity of vector: " + data2.capacity());
        System.out.println("Initial size of vector: " + data2.size());
        data2.add(22);
        data2.add(1);
        data2.add(null);
        data2.add(22);
        data2.add(1);
        data2.add(null);
        data2.add(22);
        data2.add(1);
        data2.add(null);
        System.out.println("Now capacity of vector: " + data2.capacity());
        System.out.println("Now size of vector: " + data2.size());
        System.out.println("Second vector is " + data2);

    }
}