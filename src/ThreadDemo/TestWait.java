package ThreadDemo;

public class TestWait {
    public static void main(String[] args)throws Exception {
        final Printer3 p=new Printer3();
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
    }
}
class Printer3{
    Object obj=new Object();
    private int flag=1;
    public void print1()throws Exception{
        synchronized(this){
            if (flag!=1){
                this.wait();
            }
            System.out.print("传");
            System.out.print("智");
            System.out.print("播");
            System.out.print("客");
            System.out.println();
            flag=2;
            this.notify();
        }
    }
    public void print2()throws Exception{
        synchronized (this){
            if (flag!=2){
                this.wait();
            }
            System.out.print("黑");
            System.out.print("马");
            System.out.print("程");
            System.out.print("序");
            System.out.print("员");
            System.out.println();
            flag=1;
            this.notify();
        }
    }
}