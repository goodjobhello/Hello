package demo5;

public class ListTest {


    public static void main(String[] args) {
//
//        ExecutorService executorService = Executors.newCachedThreadPool();
//        for (int i = 0; i < 10; i++) {
//            executorService.submit(new Runnable() {
//                @Override
//                public void run() {
//
//                    System.out.println("hello");
//                    try {
//                        Thread.sleep(2000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            });
//        }

        Thread t1 = new Thread() {
            @Override
            public void run() {
                System.out.println(this.getName()+"hello");
            }
        };
        t1.setName("aa");

        Thread t2 = new Thread() {
            @Override
            public void run() {
                System.out.println(this.getName()+"hello");
            }
        };
        t2.setName("bb");

        t1.start();
        t2.start();
    }
}
