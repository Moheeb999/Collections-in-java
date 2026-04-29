package setExamples;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashsetExample {
    public static void main(String[] args) {

        //These are ordered,allows null only once,doesn't allow duplicates,best for Manipulations

        //Declaring
        Set<Integer> s2 =new LinkedHashSet<>();


        //Adding data

        s2.add(100);
        s2.add(23);
        s2.add(100);
        s2.add(44);
        s2.add(167);
        s2.add(45);
        s2.add(12);
        s2.add(null);

        System.out.println("The set After adding values:"+ s2);


        //remove operation
        System.out.println("The set Before removing values:"+ s2);
        s2.remove(100);
        System.out.println("The set After removing values:"+ s2);

        //Traversal

        for(Integer i: s2){
            System.out.println(i);
        }

    }
}
