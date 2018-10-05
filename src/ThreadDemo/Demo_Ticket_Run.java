package ThreadDemo;

public class Demo_Ticket_Run {

        public static void main(String[] args) {
            Ticket2 t=new Ticket2();
            new Thread(t).start();
            new Thread(t).start();
            new Thread(t).start();
            new Thread(t).start();

        }
    }

    class Ticket2 implements Runnable{
        private int ticket=100;

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


