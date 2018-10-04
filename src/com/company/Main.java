package com.company;
import java.util.ArrayList;
public class Main implements Runnable{

    public static void main(String[] args) {
        Thread t=new Thread(new Main());

        t.start();


    }
    public void run(){
        for (int i=0;i<20;i++) {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(300);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}