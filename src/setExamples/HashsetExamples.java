package setExamples;

import java.util.HashSet;
import java.util.Set;

public class HashsetExamples {
    public static void main(String[] args) {

        //These are un-ordered,allows null only once,doesn't allow duplicates,best for searching

        //Declaring
        Set<Integer> s1=new HashSet<>();


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
