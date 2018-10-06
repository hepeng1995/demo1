package ThreadDemo;

public class TestThreadGroup {
    public static void main(String[] args) {
        ThreadGroup tg1=new ThreadGroup("线程组1");
        ThreadGroup tg2=new ThreadGroup("线程组2");
        MyRunnable mr=new MyRunnable();
        Thread t1=new Thread(tg1,mr,"线程1");
        Thread t2=new Thread(tg2,mr,"线程2");
        t1.start();
        t2.start();
        System.out.println(t1.getThreadGroup().getName());
        System.out.println(t2.getThreadGroup().getName());
    }
}
class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i=0;i<1000;i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
}
