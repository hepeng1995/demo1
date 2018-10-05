package ThreadDemo;

public class Demo_Ticket {
    public static void main(String[] args) {
        new Ticket().start();
        new Ticket().start();
        new Ticket().start();
        new Ticket().start();
    }
}

class Ticket extends Thread{
    private static int ticket=100;

    @Override
    public void run() {

            while (true) {
                synchronized (Ticket.class) {
                if (ticket <= 0) {
                    break;
                }
                try {
                    Thread.sleep(10);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "这是第" + ticket-- + "号票");

            }
        }
    }

}
