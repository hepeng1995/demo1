package com.company;

import java.lang.reflect.Method;
import java.util.LinkedList;
import java.util.List;

public class ListTest {
    public static void main(String args[])throws Exception{
        LinkedList<Integer> list=new LinkedList<>();
        Class clazz = Class.forName("java.util.LinkedList");
        Method m=clazz.getMethod("add",Object.class);
        m.invoke(list,"你妈逼");
        m.invoke(list,"草泥马");
        m.invoke(list,"你妈死了");
        System.out.println(list);
    }
}
