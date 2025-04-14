/*
* ArrayList : It is not Synchronized(Thread Safe)
*              Arraylist is Faster.
*               High Performance
*               Multiple Threads is allowed.
*
* Vector :  It is Synchronized
*           Vector is  slow.
*           Low Performance
*           only one threads are allowed
*
*
*/

import java.util.Vector;

public class Vector_Class {
    public static void main(String[] args){
        Vector<String> vector = new Vector<String>();
        vector.add("Pravinsingh");
        vector.add("Korekar");
        vector.add(1,"Arun");
        System.out.println(vector.size());
        System.out.println(vector);
        vector.set(0,"Priyanka");
        System.out.println(vector);
    }
}
