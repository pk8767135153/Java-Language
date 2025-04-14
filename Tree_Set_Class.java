/*
* Tree Set : It used sortedSet Interface
*            sortedSet use Set Interface
*            Tree Set Store value in sorted ordered.
*            Tree Set Store unique value.
*/
import java.util.TreeSet;
public class Tree_Set_Class {
    public static void main(String[] args){
        TreeSet<Integer> tree_set = new TreeSet<Integer>();
        tree_set.add(12);
        tree_set.add(5);
        tree_set.add(23);
        tree_set.add(4);
        tree_set.add(7);
        tree_set.add(7);
        System.out.println(tree_set);
    }
}
