package demo5;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        int i = 1;
        List<Integer>list = new ArrayList<>();
        list.add(10);
        list.add(28);
        list.add(33);
        for (Integer integer : new ArrayList<>(list)) {
            if(integer>20){
                list.add(i+=10);
            }
        }
        System.out.println(list.toString());  // 10 28 (11) 33 (21)
    }
}
