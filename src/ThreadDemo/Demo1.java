package ThreadDemo;

public class Demo1 extends Thread{
    public static void main(String args[]){
        Demo1 d = new Demo1();
        d.start();
    }

    @Override
    public void run() {
        int count=0;
        for(int i=0;i<20;i++){

            System.out.println("线程的名字："+getName());
            count++;
            try{Thread.sleep(100);}
            catch (Exception e){
                e.printStackTrace();
            }

                System.out.println("执行了"+count+"次");

        }

    }
}
