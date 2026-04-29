package setExamples;


import java.util.*;

import java.util.*;

public class TreesetExample {
    public static void main(String[] args) {

        //These are sorted in ascending order,Doesnot allows null values,doesn't allow duplicates.

        //Declaring
        Set<Integer> s1=new TreeSet<>();


        //Adding data

        s1.add(100);
        s1.add(23);
        s1.add(100);
        s1.add(44);
        s1.add(167);
        s1.add(45);
        s1.add(12);
        s1.add(null);

        System.out.println("The set After adding values:"+s1);


        //remove operation
        System.out.println("The set Before removing values:"+s1);
        s1.remove(100);
        System.out.println("The set After removing values:"+s1);

        //Traversal

        for(Integer i:s1){
            System.out.println(i);
        }

    }
}
