package demo1;

public class Paper {
    public static void main(String[] args) {
        ThreadLocal threadLocal = new ThreadLocal();
        threadLocal.set("hello world");
            new Thread(){
                @Override
                public void run() {
                    threadLocal.get();
                }
            }.start();
        System.out.println(threadLocal.get()+"***");
    }
}
