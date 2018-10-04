package com.company;

//字符串反转

import java.util.Scanner;

public class ReversDemo {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s=sc.next();
        StringBuilder sb =new StringBuilder(s);
        sb.reverse().toString();
        System.out.println(sb);
    }
}
