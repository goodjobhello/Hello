package demo1;

import java.text.ParseException;
import java.util.*;

public class Test3 {
    public static void main(String[] args) throws ParseException {
//        DecimalFormat decimalFormat = new DecimalFormat("0.000");
//        System.out.println(decimalFormat.format(22.2313));
        Map<User,String>map = new TreeMap<>(new Comparator<User>(){

            @Override
            public int compare(User user1, User user2) {
                if(user1.getName().compareTo(user2.getName())!=0){
                    return user1.getName().compareTo(user2.getName());
                }else{
                    if(user1.getAge().compareTo(user2.getAge())!=0){
                        return user1.getAge().compareTo(user2.getAge());
                    }else{
                        return 0;
                    }
                }
            }
        });
        map.put(new User(17,"bb"),"world");
        map.put(new User(17,"aa"),"hello");
        map.put(new User(17,"aa"),"china");
//        for(Map.Entry<User,String> entry:map.entrySet()){
//            System.out.println(entry.getValue());
//        }

    }
}
