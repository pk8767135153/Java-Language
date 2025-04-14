/*
* Stack : Stack extend Vector Class due to Vector in Synchronized and only one threads are allowed.
*           Principle : First In Last Out [FILO]
*                              or
*                      Last In First Out [LIFO]
* */

import java.util.Stack;

public class Stack_Data_Structure {
    public static void main(String[] args){
        // Create stack
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(10);
        stack.push(30);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack);
    }
}
