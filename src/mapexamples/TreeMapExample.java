package mapexamples;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {

        //By default in ASC order,Here key cannot be null

        Map<Integer,String> mp = new TreeMap<>();

        mp.put(107,"Orange");
        mp.put(105,"Apple");
        mp.put(104,"Grapes");
//        mp.put(null,"Orange");
        mp.put(108,null);
        mp.put(104,"Pine apple");
        mp.put(99,"Sick");

        System.out.println(mp);

        System.out.println("Before removing: "+mp);

        mp.remove(99);

        System.out.println("Before removing: "+mp);

        for(Map.Entry m1 :mp.entrySet()){
            System.out.println(m1.getKey()+"---"+m1.getValue());
        }



    }
}
