package ListExamples;

import java.util.*;


public class StackExample {
    public static void main(String[] args) {

        //Declaring stack
        Stack<String> st1 = new Stack<>();

        //Pushing elements into stack

        st1.push("Mangoes");
        st1.push("Apples");
        st1.push("Banana");
        st1.push("PineApple");
        st1.push("Grapes");
        st1.push("Blueberry");
        st1.push("null");

        System.out.println("The Stack is "+st1);


        // poping values from stack
        st1.pop();
        System.out.println("The stack after poping first value"+st1);

        st1.pop();
        System.out.println("The stack after poping second value"+st1);


        //Traversing in Stack

        for(String s1:st1){
            System.out.println(s1);
        }




    }
}

