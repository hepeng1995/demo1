package com.company;

import java.lang.reflect.Method;
import java.util.LinkedList;
import java.util.List;

public class ListTest {
    public static void main(String args[])throws Exception{
        LinkedList<Integer> list=new LinkedList<>();
        Class clazz = Class.forName("java.util.LinkedList");
        Method m=clazz.getMethod("add",Object.class);
        m.invoke(list,"你");
        m.invoke(list,"好");
        m.invoke(list,"吗");
        System.out.println(list);
    }
}
