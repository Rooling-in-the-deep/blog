package com.example.demo.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Test {


    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
//        list.add("a");
//        list.add("b");
//        list.add("c");


        /**
         * 1、Arraylist<String>集合的iterator()函數使用方法
         */
//        Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

        /**
         * 1、拓展
         *  ①数组方式的遍历方法（普通方式）
         *
         */
//        int a[] = {1, 2, 3};
//
//        for (int temp = 0; temp < a.length; temp++) {
//            System.out.println(a[temp]);
//        }
        /**
         * 1、拓展
         * ②数组方式的遍历方法（加强方式）
         */
//        Integer b[] = {4, 5, 6};
//        for (int temp : b) {
//            System.out.println(temp);
//        }


        /**
         * 2、Arraylist<String>集合的addAll()函数使用方法
         * 大意：将任意集合装进此集合中
         *
         */
        ArrayList<String> listTwice = new ArrayList<>();
//        listTwice.add("d");
//        listTwice.add("e");
//        listTwice.add("f");
//        list.addAll(listTwice);
//        for (String temp : list) {
//            System.out.println(temp);
//        }

        /**
         * 3、Arraylist<String>集合的clear()函数使用方法
         * 大意：见名知意，将集合中的数据清空
         */
//        list.add("a");
//        list.add("b");
//        list.add("c");
//
//        for (String before:list){
//            System.out.println(before);
//        }
//
//        list.clear();
//
//        for (String after:list){
//            System.out.println(after);
//        }

        /**
         * 4、Arraylist<String>clone()函数使用方法
         *  大意：就是利用这个方法生成新的克隆体对象，list还是list，o却不是原本的list，二个是两个实例了
         */
//        list.add("a");
//        list.add("A");
//
//        ArrayList<String> o = (ArrayList<String>) list.clone();
//        o.remove(1);
//        System.out.println(list);
//        System.out.println(o);
//




//        for (String after : list) {
//            System.out.println(after);
//        }
//        list.contains();
//        list.ensureCapacity();
//        list.forEach();
//        list.get();
//        list.indexOf();
//        list.isEmpty();
//        list.iterator();
//        list.lastIndexOf();
//        list.remove();
    }
}
