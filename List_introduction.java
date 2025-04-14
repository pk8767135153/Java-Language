/*
* List Extend Collection Interface
* List is also interface
* By using list we implement Arraylist, Linked-list, Vector
* Arrlist, linked list and Vector is classes
*
* This is not a good way to create oject
*    List<Integer> list1 = new ArrayList<Integer>();
*   due to List, List is interface in collection frameworks
*
*       This is Good way to create array List
*       ArrayList<Integer> list1 = new ArrayList<Integer>();
 */

import java.util.ArrayList;
import java.util.List;
public class List_introduction {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        List<Integer> list1 = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(2,30);
        list.add(5);
        System.out.println(list);
    }
}
