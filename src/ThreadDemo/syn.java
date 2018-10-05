package ThreadDemo;

public class syn {
    public static void main(String[] args) {
        Printer p=new Printer();
        new Thread(){
            @Override
            public void run() {
                for (int i=0;i<1000;i++){
                    p.print1();
                }
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                for (int i=0;i<1000;i++){
                    p.print2();
                }
            }
        }.start();
    }
}

class Printer{
    Object obj=new Object();
    public void print1(){
        synchronized(obj){
        System.out.print("传");
        System.out.print("智");
        System.out.print("播");
        System.out.print("客");
        System.out.println();
        }
    }
    public void print2(){
        synchronized (obj){
        System.out.print("黑");
        System.out.print("马");
        System.out.print("程");
        System.out.print("序");
        System.out.print("员");
        System.out.println();
        }
    }
}
