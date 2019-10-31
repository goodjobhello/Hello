package demo3;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Pet {

    public static void main(String[] args) {
        Map<String,String> map = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.compareTo(o2)!=0){
                    return -o1.compareTo(o2);
                }else {
                    return 0;
                }
            }
        });
        map.put("1","a");
        map.put("2","a");
        map.put("3","c");
        map.put("1","d");
        for(Map.Entry<String,String> entry:map.entrySet()){
            System.out.print(entry.getValue()+" ");
        }
        for(String s : map.keySet()){
            System.out.println(map.get(s));
        }
    }
}
