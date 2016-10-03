package com.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hanqunfeng on 2016/10/3.
 */
public class Demo {

    public static void main(String[] args) {
//        System.out.println("args = [" + args + "]");
        List<String> list = new ArrayList<String>();
        list.add("hello");
        list.add("nihao");
        for (String s : list) {
            System.out.println("s = " + s);

        }
        System.out.println(123);
    }
}
