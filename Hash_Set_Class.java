/*
* Hash Set : Unique , Unordered
* LinkedHashSet : Unique, Ordered
* HashSet and LinkedHashSet both are used Set Interface
* */

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Hash_Set_Class {
    public static void main(String[] args){
        HashSet<Integer> set = new HashSet<Integer>();
        set.add(10);
        set.add(22);
        set.add(10);
        set.add(11);
        set.add(2);
        set.add(13);
        System.out.println(set);

        LinkedHashSet<Integer> set1 = new LinkedHashSet<Integer>();
        set1.add(10);
        set1.add(23);
        set1.add(1);
        set1.add(39);
        set1.add(5);
        System.out.println(set1);
        System.out.println("Answer is "+set1.contains(5)+"\n because set1 contains 5");
    }
}
