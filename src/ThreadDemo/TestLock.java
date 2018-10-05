package ThreadDemo;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class TestLock {
    public static void main(String[] args)throws Exception {
        final Printer4 p=new Printer4();


        new Thread(){
            @Override
            public void run() {
                for (int i=0;i<1000;i++){
                    try{
                        p.print1();}
                    catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                for (int i=0;i<1000;i++){
                    try{
                        p.print2();}
                    catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                for (int i=0;i<1000;i++){
                    try{
                        p.print3();}
                    catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }
        }.start();
    }
}
class Printer4{
    private ReentrantLock r =new ReentrantLock();
    private Condition c1 =r.newCondition();
    private Condition c2 =r.newCondition();
    private Condition c3=r.newCondition();
    private int flag=1;
    public void print1()throws Exception{
            r.lock();
            if (flag!=1){
                c1.await();
            }
            System.out.print("传");
            System.out.print("智");
            System.out.print("播");
            System.out.print("客");
            System.out.println();
            flag=2;

            c2.signal();
        r.unlock();
    }
    public void print2()throws Exception{
        r.lock();
            if (flag!=2){
                c2.await();
            }
            System.out.print("黑");
            System.out.print("马");
            System.out.print("程");
            System.out.print("序");
            System.out.print("员");
            System.out.println();
            flag=3;

        c3.signal();
        r.unlock();
    }
    public void print3()throws Exception{
        r.lock();
            if (flag!=3){
                c3.await();
            }
            System.out.print("i");
            System.out.print("t");
            System.out.print("h");
            System.out.print("m");
            System.out.print("a");
            System.out.println();
            flag=1;

        c1.signal();
        r.unlock();
    }
}