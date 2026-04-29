package ListExamples;

import java.util.*;


public class LinkedListExample {
    public static void main(String[] args) {
//        wrapper class
//        int a=10,b=-10,c=null; in this c=null is not possible
//        So we use Wrapper class
//        Integer d= null;

//        Declaring ArrayList
        List<Integer> list1 = new LinkedList<>();


//        Adding data into LinkedList
        list1.add(10);
        list1.add(2);
        list1.add(62);
        list1.add(91);
        list1.add(34);
        list1.add(null);
        list1.add(1);
        System.out.println("The list is "+list1);

//        removing data using index
        list1.remove(5);
        System.out.println("The list after removing the data at 5 is "+list1);

//        searching data at particular position
        System.out.println("The data at position 5 is :"+list1.get(5));
        System.out.println("The data at position 1 is :"+list1.get(1));

//        Finding size of the list
        System.out.println("The size of the list is:"+list1.size());

//        Sorting of the LinkedList
        System.out.println("The list before sorting in asc order is "+list1);
        Collections.sort(list1);
        System.out.println("The list after sorting in asc order is "+list1);
        Collections.sort(list1,Collections.reverseOrder());
        System.out.println("The list after sorting in dsc order is "+list1);


//        Traversing in the LinkedList
        for(Integer l1 :list1){
            System.out.println(l1);
        }
    }
}
