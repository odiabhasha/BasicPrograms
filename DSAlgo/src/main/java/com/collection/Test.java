package com.collection;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Test {

    public static void main(String[] args) {
        Hashtable<String,String> hashtable = new Hashtable<>();
        hashtable.put("1",null);

        System.out.println(hashtable.get("1"));

        hashtable.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String s, String s2) {

            }
        });

        HashSet<String> set = new HashSet<>();
        set.add(null);
        set.add(null);
        set.add("Somthing");

        List l = new ArrayList();

        /*for(String s : set){
            System.out.println(s);
        }*/

        /*set.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });*/

        Iterator iterator = set.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        Queue<String> queue = new ArrayDeque<String>();
        queue.add("ww");
        queue.add("ww1");




    }
}
