package demo4;

import java.util.ArrayList;
import java.util.List;

/**
 * 有一对兔子，到第三个月大时，每一个月生一对兔子，
 * 1   1
 * 2   1
 * 3   2
 * 4   3
 * 5   5
 */
public class Rabbit {


    public static void main(String[] args) {
        //System.out.println(diGui(4));

        //List<Object> objects = Collections.synchronizedList(new ArrayList<>());

        //面向对象的思想
        List<Rabbit1> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {

            if (i == 1) {
                list.add(new Rabbit1());
            } else {
                for (Rabbit1 rabbit1 : new ArrayList<>(list)) {
                    rabbit1.addAge();
                    Rabbit1 rb = rabbit1.birth();
                    if (rb != null) {
                        list.add(rb);
                    }
                }
            }
        }
        System.out.println("10个月后兔子的数量:" + list.size());
    }

    /**
     * 递归
     *
     * @param n
     * @return
     */
    public static int diGui(int n) {
        if (n == 1) return 1;
        if (n == 2) return 1;
        return diGui(n - 1) + diGui(n - 2);
    }


    static class Rabbit1 {
        private int age = 1;//月龄

        public void addAge() {
            age++;
        }

        public Rabbit1 birth() {
            if (age >= 3) {
                return new Rabbit1();
            }
            return null;
        }
    }
}
