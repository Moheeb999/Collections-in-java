package mapexamples;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {

        //Ordered Map one null key is allowed
        Map<Integer,String> mp = new LinkedHashMap<>();

        mp.put(107,"Orange");
        mp.put(105,"Apple");
        mp.put(104,"Grapes");
        mp.put(null,"Orange");
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
