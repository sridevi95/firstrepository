package com.practice.collections;

import java.util.*;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> data1 =new PriorityQueue<>();
        data1.add(22);//shift+F6 to map into object/ to refactor
        data1.add(3);
        data1.add(54);
        data1.add(23);
        data1.add(5);
        //data1.add(null);NullPointerException
        data1.add(22);
        data1.add(1);
        System.out.println(" Before first iteration PriorityQueue is: "+ data1);
        Iterator iterator1=data1.iterator();
        System.out.println("peek : "+ data1.peek());
        //System.out.println("poll : "+ data1.poll());
        while(iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
        System.out.println("***************************************************************");

        Iterator iterator2=data1.iterator();
        System.out.println("peek : "+ data1.peek());
        System.out.println("poll : "+ data1.poll());
        System.out.println(" After first iteration PriorityQueue is: "+ data1);
        System.out.println("***************************************************************");
        System.out.println("Before second iteration PriorityQueue is: "+ data1);
        while(iterator1.hasNext()){
            System.out.println(iterator2.next());
        }
        System.out.println("peek : "+ data1.peek());
        System.out.println("poll : "+ data1.poll());
        System.out.println(" After second iteration PriorityQueue is: "+ data1);
        System.out.println("***************************************************************");

    /*data neither sorted nor ordered
    * no null value is allowed
    * duplicates are allowed
    * priority queue -FIFO*/

    }
}
